package viewClient;

import view.*;
import view.objects.ViewRoot;
import view.objects.ViewObjectInTree;

import view.visitor.AnythingStandardVisitor;

import java.util.Optional;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToolBar;
import javafx.scene.control.TreeItem;
import javafx.scene.image.ImageView;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;


import com.sun.javafx.geom.Point2D;

import javax.swing.tree.TreeModel;


public class ShopkeeperServiceClientView extends BorderPane implements ExceptionAndEventHandler{

	private ConnectionMaster 		 connection;
	private ExceptionAndEventHandler parent;	
	private ShopkeeperServiceView 		 		 service;

	/**
	 * This is the default constructor
	 */
	public ShopkeeperServiceClientView( ExceptionAndEventHandler parent, ShopkeeperServiceView service) {
		super();
		this.parent = parent;
		this.service = service;
		this.initialize();
	}
	@SuppressWarnings("unused")
	private ShopkeeperServiceView getService(){
		return this.service;
	}
	private void initialize() {
        this.setCenter( this.getMainSplitPane());
        if( !WithStaticOperations && this.getMainToolBar().getItems().size() > 0){
        	this.setTop( this.getMainToolBar() );
        }
	}
	private ToolBar mainToolBar = null;
	private ToolBar getMainToolBar() {
		if( this.mainToolBar == null){
			this.mainToolBar = new ToolBar();
			for( Button current : this.getToolButtonsForStaticOperations()) {
				this.mainToolBar.getItems().add( current );
			}
		}
		return this.mainToolBar;
	}
	private SplitPane mainSplitPane = null;
	private SplitPane getMainSplitPane() {
		if( this.mainSplitPane == null) {
			this.mainSplitPane = new SplitPane();
			this.mainSplitPane.setOrientation( Orientation.HORIZONTAL);
			this.mainSplitPane.getItems().addAll( this.getNavigationSplitPane(), this.getTitledDetailsPane() );	
			this.mainSplitPane.setDividerPosition( 0, 0.5);
			this.mainSplitPane.prefHeightProperty().bind( this.heightProperty());
			this.mainSplitPane.prefWidthProperty().bind( this.widthProperty());
		}
		return this.mainSplitPane;
	}
	private SplitPane navigationSplitPane = null;
	private SplitPane getNavigationSplitPane(){
		if( this.navigationSplitPane == null ){
			this.navigationSplitPane = new SplitPane();
			this.navigationSplitPane.setOrientation( Orientation.VERTICAL);
			this.navigationSplitPane.getItems().addAll( this.getNavigationPanel(), this.getErrorPanel());
			this.navigationSplitPane.prefHeightProperty().bind( this.getMainSplitPane().heightProperty());
			this.navigationSplitPane.setDividerPosition( 0, 1.0);
			this.navigationSplitPane.heightProperty().addListener(new ChangeListener<Number>() {
				public void changed(
						ObservableValue<? extends Number> observable,
						Number oldValue, Number newValue) {
					if(! getErrorPanel().isVisible()) {						
						navigationSplitPane.setDividerPosition(0, 1.0);
					} else {						
						navigationSplitPane.setDividerPosition(0, 0.7);
					}
				}
			});
			this.getErrorPanel().setMinHeight(0);
		}
		return this.navigationSplitPane;
	}
	private TitledPane treePanel = null;
	private TitledPane getNavigationPanel() {
		if( this.treePanel == null) {
			this.treePanel = new TitledPane( GUIConstants.NaviationTitle, this.getNavigationTree() );
			this.treePanel.setCollapsible( false );
			this.treePanel.prefHeightProperty().bind( this.getNavigationSplitPane().heightProperty());
		}
		return treePanel;
	}
	private TitledPane errorPanel = null;
	private TitledPane getErrorPanel(){
		if( this.errorPanel == null){
			this.errorPanel = new TitledPane( GUIConstants.ErrorTitle, this.getErrorTree());
			this.errorPanel.setCollapsible( false );
			this.errorPanel.setVisible( false );
		}
		return this.errorPanel;
	}

	private TreeRefresh errorTree = null;
	private TreeRefresh getErrorTree(){
		if( this.errorTree == null){
			this.errorTree = new TreeRefresh(parent);
			this.errorTree.setOnContextMenuRequested( new EventHandler<ContextMenuEvent>() {
				public void handle(ContextMenuEvent e) {
					tryShowContextMenu( e, errorTree, false);					
				}
			});
		}
		return this.errorTree;
	}
	private void setErrors( TreeModel errors){
		this.getErrorPanel().setVisible(true);
		this.getErrorTree().setModel( errors );
		this.getNavigationSplitPane().setDividerPosition(0, 0.7);
	}
	private void setNoErrors(){
		this.getErrorPanel().setVisible(false);
        this.getNavigationSplitPane().setDividerPosition(0, 1.0);
	}
	private TitledPane titledDetailsPane = null;
	private TitledPane getTitledDetailsPane() {
		if( this.titledDetailsPane == null ){
			this.titledDetailsPane = new TitledPane();
			this.titledDetailsPane.setText( GUIConstants.DetailsTitle);
			this.titledDetailsPane.setCollapsible(false);			
			this.titledDetailsPane.prefHeightProperty().bind(this.getMainSplitPane().heightProperty());
		}
		return this.titledDetailsPane;		
	}	
	private TreeRefresh navigationTree = null;
	private TreeRefresh getNavigationTree() {
		if( this.navigationTree == null) {
			this.navigationTree = new TreeRefresh( parent );
			this.navigationTree.getSelectionModel().setSelectionMode( SelectionMode.SINGLE);
			this.navigationTree.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TreeItem<ViewObjectInTree>>() {
				public void changed(
					ObservableValue<? extends TreeItem<ViewObjectInTree>> observable,
					TreeItem<ViewObjectInTree> oldValue,
					TreeItem<ViewObjectInTree> newValue) {
					if( menu !=null) menu.hide();
					if( newValue != null ){						
						setDetailsTable( (Anything) newValue.getValue().getWrappedObject());				
					}
				}
			});
			this.navigationTree.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
				public void handle(ContextMenuEvent e) {
					tryShowContextMenu( e, navigationTree, WithStaticOperations);					
				}
			});
			navigationTree.setOnKeyReleased( new EventHandler<KeyEvent>() {
				public void handle(KeyEvent event) {
					if( event.getCode() == KeyCode.F5 ){
						Platform.runLater( new Runnable() {
							public void run() {								
								try {
									getNavigationTree().refreshTree();
								} catch (ModelException e) {
									handleException(e);
								}			
							}
						});
					}
				}
			});
		}
		return this.navigationTree;
	}
	private DetailPanel currentDetails = null;
	protected void setDetailsTable( Anything object) {
		this.getTitledDetailsPane().setVisible( false );
		if (object == null && this.getConnection() != null) object = this.getConnection().getShopkeeperServiceView();
		if (object == null){
			this.currentDetails = getNoDetailsPanel();
		}else{
			try {
				this.currentDetails = this.getDetailView(object);
			} catch (ModelException e) {
				this.handleException(e);
				this.currentDetails = null;
			}
			if(this.currentDetails == null) this.currentDetails = getStandardDetailsTable(object);
		}
		this.getTitledDetailsPane().setContent( this.currentDetails );
		this.getTitledDetailsPane().setVisible( true );
		this.currentDetails.prefWidthProperty().bind( this.getTitledDetailsPane().widthProperty() );
	}

	private DetailPanel getDetailView(final Anything anything) throws ModelException {
		class PanelDecider extends AnythingStandardVisitor {

			private DetailPanel result;
			
			public DetailPanel getResult() {
				return this.result;
			}
			protected void standardHandling(Anything Anything) throws ModelException {
				this.result = null;
			}
			//TODO Overwrite all handle methods for the types for which you intend to provide a special panel!
		}
		PanelDecider decider = new PanelDecider();
		anything.accept(decider);
		return decider.getResult();
	}
	private NoDetailPanel noDetailPanel = null;
	public DetailPanel getNoDetailsPanel() {
		if( this.noDetailPanel == null) this.noDetailPanel = new NoDetailPanel(this);
		return noDetailPanel;
	}
	private ContextMenu menu = null;
	protected void tryShowContextMenu( ContextMenuEvent e, TreeRefresh tree, boolean withStaticOperations) {
		if( this.menu !=null ) this.menu.hide();
		SelectionModel<TreeItem<ViewObjectInTree>> selMod = tree.getSelectionModel();
		ViewObjectInTree selVal = selMod.getSelectedItem().getValue();
		ViewRoot selected = selVal.getWrappedObject();
		this.menu = this.getContextMenu( selected, withStaticOperations , new Point2D((float)e.getScreenX(), (float)e.getScreenY() ) );
		if( this.menu.getItems().size() > 0) {
			this.menu.show( this.getNavigationPanel(),  e.getScreenX(), e.getScreenY() );
		}
	}
	
	private DetailPanel getStandardDetailsTable(Anything object) {
		try {
			return DefaultDetailPanel.getStandardDetailPanel(object,this);
		} catch (ModelException e) {
			this.handleException(e);
			return new NoDetailPanel(this);
		}
	}

	public void setConnection(ConnectionMaster connection){
		this.connection = connection;
	}
	public ShopkeeperServiceConnection getConnection(){
        	return (ShopkeeperServiceConnection)this.connection;
	}
	/** Is called by the refresher thread if the server object has changed
	**/
	public void handleRefresh(){
		Platform.runLater(new Runnable() {
			public void run(){
				try {
					getNavigationTree().refreshTree();
					java.util.Vector<?> errors = getConnection().getShopkeeperServiceView().getErrors();
					if (errors.size() >0 )setErrors( new ListRoot(errors));
					else setNoErrors();
				} catch (ModelException e) {
					handleException(e);
				}			
			}
		});
	}
	/** Is called only once after the connection has been established
	**/
	public void initializeConnection(){
		Platform.runLater( new  Runnable() {
			public void run() {
				getNavigationTree().setModel((TreeModel) getConnection().getShopkeeperServiceView());	
				getNavigationTree().getRoot().setExpanded(true);
				getNavigationTree().getSelectionModel().select( getNavigationTree().getRoot());
			}
		});
	}
	public void handleException(ModelException exception) {
		this.parent.handleException(exception);
	}
	public void handleOKMessage(String message) {
		this.parent.handleOKMessage(message);
	}
	public void handleUserException(UserException exception) {
		this.parent.handleUserException(exception);	
	}	
	
	/* Menu and wizard section start */

	static boolean WithStaticOperations = false;


    interface MenuItemVisitor{
        ImageView handle(ChangePricePRMTRArticlePRMTRIntegerPRMTRMenuItem menuItem);
        ImageView handle(ChangeDescriptionPRMTRItemPRMTRStringPRMTRMenuItem menuItem);
        ImageView handle(ChangeManufacturerDeliveryPRMTRIntegerPRMTRMenuItem menuItem);
        ImageView handle(PresetBalancePRMTRIntegerPRMTRMenuItem menuItem);
        ImageView handle(PresetLowerLimitPRMTRIntegerPRMTRMenuItem menuItem);
        ImageView handle(ChangeTimePRMTRCustomerDeliveryPRMTRIntegerPRMTRMenuItem menuItem);
        ImageView handle(ChangeExtraChargePRMTRCustomerDeliveryPRMTRIntegerPRMTRMenuItem menuItem);
        ImageView handle(ChangeProductGroupPRMTRArticlePRMTRProductGroupPRMTRMenuItem menuItem);
        ImageView handle(ChangeRetourePercentagePRMTRIntegerPRMTRMenuItem menuItem);
        ImageView handle(StartSellingPRMTRNewlyAddedPRMTRMenuItem menuItem);
    }
    private abstract class ShopkeeperServiceMenuItem extends MenuItem{
        private ShopkeeperServiceMenuItem(){
            this.setGraphic(getIconForMenuItem(this));
        }
        abstract protected ImageView accept(MenuItemVisitor visitor);
    }
    private class ChangePricePRMTRArticlePRMTRIntegerPRMTRMenuItem extends ShopkeeperServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class ChangeDescriptionPRMTRItemPRMTRStringPRMTRMenuItem extends ShopkeeperServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class ChangeManufacturerDeliveryPRMTRIntegerPRMTRMenuItem extends ShopkeeperServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class PresetBalancePRMTRIntegerPRMTRMenuItem extends ShopkeeperServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class PresetLowerLimitPRMTRIntegerPRMTRMenuItem extends ShopkeeperServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class ChangeTimePRMTRCustomerDeliveryPRMTRIntegerPRMTRMenuItem extends ShopkeeperServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class ChangeExtraChargePRMTRCustomerDeliveryPRMTRIntegerPRMTRMenuItem extends ShopkeeperServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class ChangeProductGroupPRMTRArticlePRMTRProductGroupPRMTRMenuItem extends ShopkeeperServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class ChangeRetourePercentagePRMTRIntegerPRMTRMenuItem extends ShopkeeperServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class StartSellingPRMTRNewlyAddedPRMTRMenuItem extends ShopkeeperServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private java.util.Vector<javafx.scene.control.Button> getToolButtonsForStaticOperations() {
        java.util.Vector<javafx.scene.control.Button> result = new java.util.Vector<javafx.scene.control.Button>();
        javafx.scene.control.Button currentButton = null;
        currentButton = new javafx.scene.control.Button("Herstellerlieferzeit ändern ... ");
        currentButton.setGraphic(new ChangeManufacturerDeliveryPRMTRIntegerPRMTRMenuItem().getGraphic());
        currentButton.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                final ShopkeeperServiceChangeManufacturerDeliveryIntegerMssgWizard wizard = new ShopkeeperServiceChangeManufacturerDeliveryIntegerMssgWizard("Herstellerlieferzeit ändern");
                wizard.setWidth(getNavigationPanel().getWidth());
                wizard.showAndWait();
            }
        });
        result.add(currentButton);
        currentButton = new javafx.scene.control.Button("Kundenkonto:Startkapital setzen ... ");
        currentButton.setGraphic(new PresetBalancePRMTRIntegerPRMTRMenuItem().getGraphic());
        currentButton.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                final ShopkeeperServicePresetBalanceIntegerMssgWizard wizard = new ShopkeeperServicePresetBalanceIntegerMssgWizard("Kundenkonto:Startkapital setzen");
                wizard.setWidth(getNavigationPanel().getWidth());
                wizard.showAndWait();
            }
        });
        result.add(currentButton);
        currentButton = new javafx.scene.control.Button("Kundenkonto:Unteres Limit setzen ... ");
        currentButton.setGraphic(new PresetLowerLimitPRMTRIntegerPRMTRMenuItem().getGraphic());
        currentButton.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                final ShopkeeperServicePresetLowerLimitIntegerMssgWizard wizard = new ShopkeeperServicePresetLowerLimitIntegerMssgWizard("Kundenkonto:Unteres Limit setzen");
                wizard.setWidth(getNavigationPanel().getWidth());
                wizard.showAndWait();
            }
        });
        result.add(currentButton);
        currentButton = new javafx.scene.control.Button("Retoure:Prozentsatz ändern ... ");
        currentButton.setGraphic(new ChangeRetourePercentagePRMTRIntegerPRMTRMenuItem().getGraphic());
        currentButton.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                final ShopkeeperServiceChangeRetourePercentageIntegerMssgWizard wizard = new ShopkeeperServiceChangeRetourePercentageIntegerMssgWizard("Retoure:Prozentsatz ändern");
                wizard.setWidth(getNavigationPanel().getWidth());
                wizard.showAndWait();
            }
        });
        result.add(currentButton);
        return result;
    }
    private ContextMenu getContextMenu(final ViewRoot selected, final boolean withStaticOperations, final Point2D menuPos) {
        final ContextMenu result = new ContextMenu();
        MenuItem item = null;
        item = new ChangeManufacturerDeliveryPRMTRIntegerPRMTRMenuItem();
        item.setText("(S) Herstellerlieferzeit ändern ... ");
        item.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                final ShopkeeperServiceChangeManufacturerDeliveryIntegerMssgWizard wizard = new ShopkeeperServiceChangeManufacturerDeliveryIntegerMssgWizard("Herstellerlieferzeit ändern");
                wizard.setWidth(getNavigationPanel().getWidth());
                wizard.showAndWait();
            }
        });
        if (withStaticOperations) result.getItems().add(item);
        item = new PresetBalancePRMTRIntegerPRMTRMenuItem();
        item.setText("(S) Kundenkonto:Startkapital setzen ... ");
        item.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                final ShopkeeperServicePresetBalanceIntegerMssgWizard wizard = new ShopkeeperServicePresetBalanceIntegerMssgWizard("Kundenkonto:Startkapital setzen");
                wizard.setWidth(getNavigationPanel().getWidth());
                wizard.showAndWait();
            }
        });
        if (withStaticOperations) result.getItems().add(item);
        item = new PresetLowerLimitPRMTRIntegerPRMTRMenuItem();
        item.setText("(S) Kundenkonto:Unteres Limit setzen ... ");
        item.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                final ShopkeeperServicePresetLowerLimitIntegerMssgWizard wizard = new ShopkeeperServicePresetLowerLimitIntegerMssgWizard("Kundenkonto:Unteres Limit setzen");
                wizard.setWidth(getNavigationPanel().getWidth());
                wizard.showAndWait();
            }
        });
        if (withStaticOperations) result.getItems().add(item);
        item = new ChangeRetourePercentagePRMTRIntegerPRMTRMenuItem();
        item.setText("(S) Retoure:Prozentsatz ändern ... ");
        item.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                final ShopkeeperServiceChangeRetourePercentageIntegerMssgWizard wizard = new ShopkeeperServiceChangeRetourePercentageIntegerMssgWizard("Retoure:Prozentsatz ändern");
                wizard.setWidth(getNavigationPanel().getWidth());
                wizard.showAndWait();
            }
        });
        if (withStaticOperations) result.getItems().add(item);
        if (selected != null){
            try {
                this.setPreCalculatedFilters(this.getConnection().shopkeeperService_Menu_Filter((Anything)selected));
            } catch (ModelException me){
                this.handleException(me);
                return result;
            }
            if (selected instanceof ItemView){
                item = new ChangeDescriptionPRMTRItemPRMTRStringPRMTRMenuItem();
                item.setText("Beschreibung ändern ... ");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        final ShopkeeperServiceChangeDescriptionItemStringMssgWizard wizard = new ShopkeeperServiceChangeDescriptionItemStringMssgWizard("Beschreibung ändern");
                        wizard.setFirstArgument((ItemView)selected);
                        wizard.setWidth(getNavigationPanel().getWidth());
                        wizard.showAndWait();
                    }
                });
                result.getItems().add(item);
            }
            if (selected instanceof ArticleView){
                item = new ChangePricePRMTRArticlePRMTRIntegerPRMTRMenuItem();
                item.setText("Artikelpreis ändern ... ");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        final ShopkeeperServiceChangePriceArticleIntegerMssgWizard wizard = new ShopkeeperServiceChangePriceArticleIntegerMssgWizard("Artikelpreis ändern");
                        wizard.setFirstArgument((ArticleView)selected);
                        wizard.setWidth(getNavigationPanel().getWidth());
                        wizard.showAndWait();
                    }
                });
                result.getItems().add(item);
                item = new ChangeProductGroupPRMTRArticlePRMTRProductGroupPRMTRMenuItem();
                item.setText("Produktgruppe wechseln ... ");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        final ShopkeeperServiceChangeProductGroupArticleProductGroupMssgWizard wizard = new ShopkeeperServiceChangeProductGroupArticleProductGroupMssgWizard("Produktgruppe wechseln");
                        wizard.setFirstArgument((ArticleView)selected);
                        wizard.setWidth(getNavigationPanel().getWidth());
                        wizard.showAndWait();
                    }
                });
                result.getItems().add(item);
            }
            if (selected instanceof NewlyAddedView){
                item = new StartSellingPRMTRNewlyAddedPRMTRMenuItem();
                item.setText("Verkauf starten");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        Alert confirm = new Alert(AlertType.CONFIRMATION);
                        confirm.setTitle(GUIConstants.ConfirmButtonText);
                        confirm.setHeaderText(null);
                        confirm.setContentText("Verkauf starten" + GUIConstants.ConfirmQuestionMark);
                        Optional<ButtonType> buttonResult = confirm.showAndWait();
                        if (buttonResult.get() == ButtonType.OK) {
                            try {
                                getConnection().startSelling((NewlyAddedView)selected);
                                getConnection().setEagerRefresh();
                                
                            }catch(ModelException me){
                                handleException(me);
                            }
                        }
                    }
                });
                result.getItems().add(item);
            }
            if (selected instanceof CustomerDeliveryView){
                item = new ChangeTimePRMTRCustomerDeliveryPRMTRIntegerPRMTRMenuItem();
                item.setText("Kundenlieferzeit:Dauer ändern ... ");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        final ShopkeeperServiceChangeTimeCustomerDeliveryIntegerMssgWizard wizard = new ShopkeeperServiceChangeTimeCustomerDeliveryIntegerMssgWizard("Kundenlieferzeit:Dauer ändern");
                        wizard.setFirstArgument((CustomerDeliveryView)selected);
                        wizard.setWidth(getNavigationPanel().getWidth());
                        wizard.showAndWait();
                    }
                });
                result.getItems().add(item);
                item = new ChangeExtraChargePRMTRCustomerDeliveryPRMTRIntegerPRMTRMenuItem();
                item.setText("Kundenlieferzeit:Kosten ändern ... ");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        final ShopkeeperServiceChangeExtraChargeCustomerDeliveryIntegerMssgWizard wizard = new ShopkeeperServiceChangeExtraChargeCustomerDeliveryIntegerMssgWizard("Kundenlieferzeit:Kosten ändern");
                        wizard.setFirstArgument((CustomerDeliveryView)selected);
                        wizard.setWidth(getNavigationPanel().getWidth());
                        wizard.showAndWait();
                    }
                });
                result.getItems().add(item);
            }
            
        }
        this.addNotGeneratedItems(result,selected);
        return result;
    }
    private String preCalculatedFilters = "";
    private String getPreCalculatedFilters() {
        return this.preCalculatedFilters;
    }
    private void setPreCalculatedFilters(String switchOff) {
        this.preCalculatedFilters = switchOff;
    }
    
	class ShopkeeperServiceChangeDescriptionItemStringMssgWizard extends Wizard {

		protected ShopkeeperServiceChangeDescriptionItemStringMssgWizard(String operationName){
			super(ShopkeeperServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new ChangeDescriptionPRMTRItemPRMTRStringPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "ShopkeeperServiceChangeDescriptionItemStringMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().changeDescription(firstArgument, ((StringSelectionPanel)getParametersPanel().getChildren().get(0)).getResult());
				getConnection().setEagerRefresh();
				this.close();	
			} catch(ModelException me){
				handleException(me);
				this.close();
			}
			
		}
		protected String checkCompleteParameterSet(){
			return null;
		}
		protected boolean isModifying () {
			return false;
		}
		protected void addParameters(){
			getParametersPanel().getChildren().add(new StringSelectionPanel("newDescription", this));		
		}	
		protected void handleDependencies(int i) {
		}
		
		
		private ItemView firstArgument; 
	
		public void setFirstArgument(ItemView firstArgument){
			this.firstArgument = firstArgument;
			this.setTitle(this.firstArgument.toString());
			this.check();
		}
		
		
	}

	class ShopkeeperServiceChangeExtraChargeCustomerDeliveryIntegerMssgWizard extends Wizard {

		protected ShopkeeperServiceChangeExtraChargeCustomerDeliveryIntegerMssgWizard(String operationName){
			super(ShopkeeperServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new ChangeExtraChargePRMTRCustomerDeliveryPRMTRIntegerPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "ShopkeeperServiceChangeExtraChargeCustomerDeliveryIntegerMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().changeExtraCharge(firstArgument, ((IntegerSelectionPanel)getParametersPanel().getChildren().get(0)).getResult().longValue());
				getConnection().setEagerRefresh();
				this.close();	
			} catch(ModelException me){
				handleException(me);
				this.close();
			}
			
		}
		protected String checkCompleteParameterSet(){
			return null;
		}
		protected boolean isModifying () {
			return false;
		}
		protected void addParameters(){
			getParametersPanel().getChildren().add(new IntegerSelectionPanel("newCharge", this));		
		}	
		protected void handleDependencies(int i) {
		}
		
		
		private CustomerDeliveryView firstArgument; 
	
		public void setFirstArgument(CustomerDeliveryView firstArgument){
			this.firstArgument = firstArgument;
			this.setTitle(this.firstArgument.toString());
			this.check();
		}
		
		
	}

	class ShopkeeperServiceChangeManufacturerDeliveryIntegerMssgWizard extends Wizard {

		protected ShopkeeperServiceChangeManufacturerDeliveryIntegerMssgWizard(String operationName){
			super(ShopkeeperServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new ChangeManufacturerDeliveryPRMTRIntegerPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "ShopkeeperServiceChangeManufacturerDeliveryIntegerMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().changeManufacturerDelivery(((IntegerSelectionPanel)getParametersPanel().getChildren().get(0)).getResult().longValue());
				getConnection().setEagerRefresh();
				this.close();	
			} catch(ModelException me){
				handleException(me);
				this.close();
			}
			
		}
		protected String checkCompleteParameterSet(){
			return null;
		}
		protected boolean isModifying () {
			return false;
		}
		protected void addParameters(){
			getParametersPanel().getChildren().add(new IntegerSelectionPanel("newManuDelivery", this));		
		}	
		protected void handleDependencies(int i) {
		}
		
		
	}

	class ShopkeeperServiceChangePriceArticleIntegerMssgWizard extends Wizard {

		protected ShopkeeperServiceChangePriceArticleIntegerMssgWizard(String operationName){
			super(ShopkeeperServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new ChangePricePRMTRArticlePRMTRIntegerPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "ShopkeeperServiceChangePriceArticleIntegerMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().changePrice(firstArgument, ((IntegerSelectionPanel)getParametersPanel().getChildren().get(0)).getResult().longValue());
				getConnection().setEagerRefresh();
				this.close();	
			} catch(ModelException me){
				handleException(me);
				this.close();
			}
			
		}
		protected String checkCompleteParameterSet(){
			return null;
		}
		protected boolean isModifying () {
			return false;
		}
		protected void addParameters(){
			getParametersPanel().getChildren().add(new IntegerSelectionPanel("newPrice", this));		
		}	
		protected void handleDependencies(int i) {
		}
		
		
		private ArticleView firstArgument; 
	
		public void setFirstArgument(ArticleView firstArgument){
			this.firstArgument = firstArgument;
			this.setTitle(this.firstArgument.toString());
			this.check();
		}
		
		
	}

	class ShopkeeperServiceChangeProductGroupArticleProductGroupMssgWizard extends Wizard {

		protected ShopkeeperServiceChangeProductGroupArticleProductGroupMssgWizard(String operationName){
			super(ShopkeeperServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new ChangeProductGroupPRMTRArticlePRMTRProductGroupPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "ShopkeeperServiceChangeProductGroupArticleProductGroupMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().changeProductGroup(firstArgument, (ProductGroupView)((ObjectSelectionPanel)getParametersPanel().getChildren().get(0)).getResult());
				getConnection().setEagerRefresh();
				this.close();	
			} catch(ModelException me){
				handleException(me);
				this.close();
			}
			
		}
		protected String checkCompleteParameterSet(){
			return null;
		}
		protected boolean isModifying () {
			return false;
		}
		protected void addParameters(){
			final ObjectSelectionPanel panel1 = new ObjectSelectionPanel("newPG", "view.ProductGroupView", null, this);
			getParametersPanel().getChildren().add(panel1);
			panel1.setBrowserRoot((ViewRoot) getConnection().getShopkeeperServiceView());		
		}	
		protected void handleDependencies(int i) {
		}
		
		
		private ArticleView firstArgument; 
	
		public void setFirstArgument(ArticleView firstArgument){
			this.firstArgument = firstArgument;
			this.setTitle(this.firstArgument.toString());
			this.check();
		}
		
		
	}

	class ShopkeeperServiceChangeRetourePercentageIntegerMssgWizard extends Wizard {

		protected ShopkeeperServiceChangeRetourePercentageIntegerMssgWizard(String operationName){
			super(ShopkeeperServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new ChangeRetourePercentagePRMTRIntegerPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "ShopkeeperServiceChangeRetourePercentageIntegerMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().changeRetourePercentage(((IntegerSelectionPanel)getParametersPanel().getChildren().get(0)).getResult().longValue());
				getConnection().setEagerRefresh();
				this.close();	
			} catch(ModelException me){
				handleException(me);
				this.close();
			}
			
		}
		protected String checkCompleteParameterSet(){
			return null;
		}
		protected boolean isModifying () {
			return false;
		}
		protected void addParameters(){
			getParametersPanel().getChildren().add(new IntegerSelectionPanel("newPercentage", this));		
		}	
		protected void handleDependencies(int i) {
		}
		
		
	}

	class ShopkeeperServiceChangeTimeCustomerDeliveryIntegerMssgWizard extends Wizard {

		protected ShopkeeperServiceChangeTimeCustomerDeliveryIntegerMssgWizard(String operationName){
			super(ShopkeeperServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new ChangeTimePRMTRCustomerDeliveryPRMTRIntegerPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "ShopkeeperServiceChangeTimeCustomerDeliveryIntegerMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().changeTime(firstArgument, ((IntegerSelectionPanel)getParametersPanel().getChildren().get(0)).getResult().longValue());
				getConnection().setEagerRefresh();
				this.close();	
			} catch(ModelException me){
				handleException(me);
				this.close();
			}
			
		}
		protected String checkCompleteParameterSet(){
			return null;
		}
		protected boolean isModifying () {
			return false;
		}
		protected void addParameters(){
			getParametersPanel().getChildren().add(new IntegerSelectionPanel("newTime", this));		
		}	
		protected void handleDependencies(int i) {
		}
		
		
		private CustomerDeliveryView firstArgument; 
	
		public void setFirstArgument(CustomerDeliveryView firstArgument){
			this.firstArgument = firstArgument;
			this.setTitle(this.firstArgument.toString());
			this.check();
		}
		
		
	}

	class ShopkeeperServicePresetBalanceIntegerMssgWizard extends Wizard {

		protected ShopkeeperServicePresetBalanceIntegerMssgWizard(String operationName){
			super(ShopkeeperServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new PresetBalancePRMTRIntegerPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "ShopkeeperServicePresetBalanceIntegerMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().presetBalance(((IntegerSelectionPanel)getParametersPanel().getChildren().get(0)).getResult().longValue());
				getConnection().setEagerRefresh();
				this.close();	
			} catch(ModelException me){
				handleException(me);
				this.close();
			}
			
		}
		protected String checkCompleteParameterSet(){
			return null;
		}
		protected boolean isModifying () {
			return false;
		}
		protected void addParameters(){
			getParametersPanel().getChildren().add(new IntegerSelectionPanel("amount", this));		
		}	
		protected void handleDependencies(int i) {
		}
		
		
	}

	class ShopkeeperServicePresetLowerLimitIntegerMssgWizard extends Wizard {

		protected ShopkeeperServicePresetLowerLimitIntegerMssgWizard(String operationName){
			super(ShopkeeperServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new PresetLowerLimitPRMTRIntegerPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "ShopkeeperServicePresetLowerLimitIntegerMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().presetLowerLimit(((IntegerSelectionPanel)getParametersPanel().getChildren().get(0)).getResult().longValue());
				getConnection().setEagerRefresh();
				this.close();	
			} catch(ModelException me){
				handleException(me);
				this.close();
			}
			
		}
		protected String checkCompleteParameterSet(){
			return null;
		}
		protected boolean isModifying () {
			return false;
		}
		protected void addParameters(){
			getParametersPanel().getChildren().add(new IntegerSelectionPanel("amount", this));		
		}	
		protected void handleDependencies(int i) {
		}
		
		
	}

	/* Menu and wizard section end */
	
	private ImageView getIconForMenuItem(ShopkeeperServiceMenuItem menuItem){
		return new ImageView(new javafx.scene.image.Image("/viewResources/default.gif")); //TODO Pimp-up your menu items!
	}
	
	
	private void addNotGeneratedItems(ContextMenu result, ViewRoot selected) {
		// TODO Add items to menue if you have not generated service calls!!!
	}
	protected boolean getMultiSelectionFor(String parameterInBrowser){
		return false;
	}
	public int getPartsPerHour(String parameterInBrowser) {
		// divides 60 minutes into the returned number of parts
		return 59;
	}
	
	
}
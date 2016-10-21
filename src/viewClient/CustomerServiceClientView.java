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
import javafx.scene.control.ButtonType;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TitledPane;
import javafx.scene.control.TreeItem;
import javafx.scene.image.ImageView;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;


import com.sun.javafx.geom.Point2D;

import javax.swing.tree.TreeModel;


public class CustomerServiceClientView extends BorderPane implements ExceptionAndEventHandler{

	private ConnectionMaster 		 connection;
	private ExceptionAndEventHandler parent;	
	private CustomerServiceView 	 service;

	/**
	 * This is the default constructor
	 */
	public CustomerServiceClientView( ExceptionAndEventHandler parent, CustomerServiceView service) {
		super();
		this.parent = parent;
		this.service = service;
		this.initialize();
	}
	@SuppressWarnings("unused")
	private CustomerServiceView getService(){
		return this.service;
	}
	private void initialize() {
        this.setTop(getTabs());
	}
	private TabPane tabs = null;
	private TabPane getTabs() {
		if(this.tabs == null) {
			this.tabs = new TabPane();
			this.tabs.getTabs().addAll(getTabShop(), getTabAccount(), getTabCart());
		}
		return this.tabs;
	}
	private Tab tabShop = null;
	private Tab getTabShop() {
		if(this.tabShop == null) {
			this.tabShop = new Tab();
			this.tabShop.setText("Shop");
			this.tabShop.setClosable(false);
		    this.tabShop.setContent(new ShopServiceView(this));
		}
		return this.tabShop;
	}
	private Tab tabAccount = null;
	private Tab getTabAccount() {
		if(this.tabAccount == null) {
			this.tabAccount = new Tab();
			this.tabAccount.setText("Konto");
			this.tabAccount.setClosable(false);
		    this.tabAccount.setContent(new AccountServiceView(this));
		}
		return this.tabAccount;
	}
	private Tab tabCart = null;
	private Tab getTabCart() {
		if(this.tabCart == null) {
			this.tabCart = new Tab();
			this.tabCart.setText("Einkaufswagen");
			this.tabCart.setClosable(false);
		    this.tabCart.setContent(new CartServiceView(this));
		}
		return this.tabCart;
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
		if (object == null && this.getConnection() != null) object = this.getConnection().getCustomerServiceView();
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

	protected DetailPanel getDetailView(final Anything anything) throws ModelException {
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
	public CustomerServiceConnection getConnection(){
        	return (CustomerServiceConnection)this.connection;
	}
	/** Is called by the refresher thread if the server object has changed
	**/
	public void handleRefresh(){
		Platform.runLater(new Runnable() {
			public void run(){
				try {
					getNavigationTree().refreshTree();
					java.util.Vector<?> errors = getConnection().getCustomerServiceView().getErrors();
					if (errors.size() >0 )setErrors( new ListRoot(errors));
					else setNoErrors();
				} catch (ModelException e) {
					handleException(e);
				}			
			}
		});
		//TODO adjust implementation: handleRefresh()!
	}
	/** Is called only once after the connection has been established
	**/
	public void initializeConnection(){
		Platform.runLater( new  Runnable() {
			public void run() {
				getNavigationTree().setModel((TreeModel) getConnection().getCustomerServiceView());	
				getNavigationTree().getRoot().setExpanded(true);
				getNavigationTree().getSelectionModel().select( getNavigationTree().getRoot());
			}
		});
		//TODO adjust implementation: initializeConnection
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
	protected FindArticlePRMTRStringPRMTRMenuItem newFindArticlePRMTRStringPRMTRMenuItem() {
		return new FindArticlePRMTRStringPRMTRMenuItem();
	}
	protected OrderPRMTRMenuItem newOrderPRMTRMenuItem() {
		return new OrderPRMTRMenuItem();
	}
	protected WithdrawPRMTRIntegerPRMTRMenuItem newWithdrawPRMTRIntegerPRMTRMenuItem() {
		return new WithdrawPRMTRIntegerPRMTRMenuItem();
	}
	protected DepositPRMTRIntegerPRMTRMenuItem newDepositPRMTRIntegerPRMTRMenuItem() {
		return new DepositPRMTRIntegerPRMTRMenuItem();
	}
	protected RemoveFCartPRMTRQuantifiedArticlesPRMTRCartPRMTRMenuItem newRemoveFCartPRMTRQuantifiedArticlesPRMTRCartPRMTRMenuItem() {
		return new RemoveFCartPRMTRQuantifiedArticlesPRMTRCartPRMTRMenuItem();
	}
	protected AddToCartPRMTRArticlePRMTRIntegerPRMTRMenuItem newAddToCartPRMTRArticlePRMTRIntegerPRMTRMenuItem() {
		return new AddToCartPRMTRArticlePRMTRIntegerPRMTRMenuItem();
	}
	protected CheckOutPRMTRMenuItem newCheckOutPRMTRMenuItem() {
		return new CheckOutPRMTRMenuItem();
	}
	protected AcceptDeliveryPRMTRCustomerOrderPRMTRMenuItem newAcceptDeliveryPRMTRCustomerOrderPRMTRMenuItem() {
		return new AcceptDeliveryPRMTRCustomerOrderPRMTRMenuItem();
	}
		
	/* Menu and wizard section start */

	static boolean WithStaticOperations = false;


    interface MenuItemVisitor{
        ImageView handle(FindArticlePRMTRStringPRMTRMenuItem menuItem);
        ImageView handle(OrderPRMTRMenuItem menuItem);
        ImageView handle(WithdrawPRMTRIntegerPRMTRMenuItem menuItem);
        ImageView handle(DepositPRMTRIntegerPRMTRMenuItem menuItem);
        ImageView handle(RemoveFCartPRMTRQuantifiedArticlesPRMTRCartPRMTRMenuItem menuItem);
        ImageView handle(AddToCartPRMTRArticlePRMTRIntegerPRMTRMenuItem menuItem);
        ImageView handle(CheckOutPRMTRMenuItem menuItem);
        ImageView handle(AcceptDeliveryPRMTRCustomerOrderPRMTRMenuItem menuItem);
    }
    private abstract class CustomerServiceMenuItem extends MenuItem{
        private CustomerServiceMenuItem(){
            this.setGraphic(getIconForMenuItem(this));
        }
        abstract protected ImageView accept(MenuItemVisitor visitor);
    }
    private class FindArticlePRMTRStringPRMTRMenuItem extends CustomerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class OrderPRMTRMenuItem extends CustomerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class WithdrawPRMTRIntegerPRMTRMenuItem extends CustomerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class DepositPRMTRIntegerPRMTRMenuItem extends CustomerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class RemoveFCartPRMTRQuantifiedArticlesPRMTRCartPRMTRMenuItem extends CustomerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class AddToCartPRMTRArticlePRMTRIntegerPRMTRMenuItem extends CustomerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class CheckOutPRMTRMenuItem extends CustomerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private class AcceptDeliveryPRMTRCustomerOrderPRMTRMenuItem extends CustomerServiceMenuItem{
        protected ImageView accept(MenuItemVisitor visitor){
            return visitor.handle(this);
        }
    }
    private java.util.Vector<javafx.scene.control.Button> getToolButtonsForStaticOperations() {
        java.util.Vector<javafx.scene.control.Button> result = new java.util.Vector<javafx.scene.control.Button>();
        javafx.scene.control.Button currentButton = null;
        currentButton = new javafx.scene.control.Button("Artikel suchen ... ");
        currentButton.setGraphic(new FindArticlePRMTRStringPRMTRMenuItem().getGraphic());
        currentButton.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                final CustomerServiceFindArticleStringMssgWizard wizard = new CustomerServiceFindArticleStringMssgWizard("Artikel suchen");
                wizard.setWidth(getNavigationPanel().getWidth());
                wizard.showAndWait();
            }
        });
        result.add(currentButton);
        currentButton = new javafx.scene.control.Button("Bestellen");
        currentButton.setGraphic(new OrderPRMTRMenuItem().getGraphic());
        currentButton.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                Alert confirm = new Alert(AlertType.CONFIRMATION);
                confirm.setTitle(GUIConstants.ConfirmButtonText);
                confirm.setHeaderText(null);
                confirm.setContentText("Bestellen" + GUIConstants.ConfirmQuestionMark);
                Optional<ButtonType> buttonResult = confirm.showAndWait();
                if (buttonResult.get() == ButtonType.OK) {
                    try {
                        getConnection().order();
                        getConnection().setEagerRefresh();
                        
                    }catch(ModelException me){
                        handleException(me);
                    }
                }
            }
        });
        result.add(currentButton);
        currentButton = new javafx.scene.control.Button("Geld abheben ... ");
        currentButton.setGraphic(new WithdrawPRMTRIntegerPRMTRMenuItem().getGraphic());
        currentButton.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                final CustomerServiceWithdrawIntegerMssgWizard wizard = new CustomerServiceWithdrawIntegerMssgWizard("Geld abheben");
                wizard.setWidth(getNavigationPanel().getWidth());
                wizard.showAndWait();
            }
        });
        result.add(currentButton);
        currentButton = new javafx.scene.control.Button("Geld einzahlen ... ");
        currentButton.setGraphic(new DepositPRMTRIntegerPRMTRMenuItem().getGraphic());
        currentButton.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                final CustomerServiceDepositIntegerMssgWizard wizard = new CustomerServiceDepositIntegerMssgWizard("Geld einzahlen");
                wizard.setWidth(getNavigationPanel().getWidth());
                wizard.showAndWait();
            }
        });
        result.add(currentButton);
        currentButton = new javafx.scene.control.Button("Zur Kasse gehen");
        currentButton.setGraphic(new CheckOutPRMTRMenuItem().getGraphic());
        currentButton.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                Alert confirm = new Alert(AlertType.CONFIRMATION);
                confirm.setTitle(GUIConstants.ConfirmButtonText);
                confirm.setHeaderText(null);
                confirm.setContentText("Zur Kasse gehen" + GUIConstants.ConfirmQuestionMark);
                Optional<ButtonType> buttonResult = confirm.showAndWait();
                if (buttonResult.get() == ButtonType.OK) {
                    try {
                        getConnection().checkOut();
                        getConnection().setEagerRefresh();
                        
                    }catch(ModelException me){
                        handleException(me);
                    }
                }
            }
        });
        result.add(currentButton);
        return result;
    }
    private ContextMenu getContextMenu(final ViewRoot selected, final boolean withStaticOperations, final Point2D menuPos) {
        final ContextMenu result = new ContextMenu();
        MenuItem item = null;
        item = new FindArticlePRMTRStringPRMTRMenuItem();
        item.setText("(S) Artikel suchen ... ");
        item.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                final CustomerServiceFindArticleStringMssgWizard wizard = new CustomerServiceFindArticleStringMssgWizard("Artikel suchen");
                wizard.setWidth(getNavigationPanel().getWidth());
                wizard.showAndWait();
            }
        });
        if (withStaticOperations) result.getItems().add(item);
        item = new OrderPRMTRMenuItem();
        item.setText("(S) Bestellen");
        item.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                Alert confirm = new Alert(AlertType.CONFIRMATION);
                confirm.setTitle(GUIConstants.ConfirmButtonText);
                confirm.setHeaderText(null);
                confirm.setContentText("Bestellen" + GUIConstants.ConfirmQuestionMark);
                Optional<ButtonType> buttonResult = confirm.showAndWait();
                if (buttonResult.get() == ButtonType.OK) {
                    try {
                        getConnection().order();
                        getConnection().setEagerRefresh();
                        
                    }catch(ModelException me){
                        handleException(me);
                    }
                }
            }
        });
        if (withStaticOperations) result.getItems().add(item);
        item = new WithdrawPRMTRIntegerPRMTRMenuItem();
        item.setText("(S) Geld abheben ... ");
        item.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                final CustomerServiceWithdrawIntegerMssgWizard wizard = new CustomerServiceWithdrawIntegerMssgWizard("Geld abheben");
                wizard.setWidth(getNavigationPanel().getWidth());
                wizard.showAndWait();
            }
        });
        if (withStaticOperations) result.getItems().add(item);
        item = new DepositPRMTRIntegerPRMTRMenuItem();
        item.setText("(S) Geld einzahlen ... ");
        item.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                final CustomerServiceDepositIntegerMssgWizard wizard = new CustomerServiceDepositIntegerMssgWizard("Geld einzahlen");
                wizard.setWidth(getNavigationPanel().getWidth());
                wizard.showAndWait();
            }
        });
        if (withStaticOperations) result.getItems().add(item);
        item = new CheckOutPRMTRMenuItem();
        item.setText("(S) Zur Kasse gehen");
        item.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                Alert confirm = new Alert(AlertType.CONFIRMATION);
                confirm.setTitle(GUIConstants.ConfirmButtonText);
                confirm.setHeaderText(null);
                confirm.setContentText("Zur Kasse gehen" + GUIConstants.ConfirmQuestionMark);
                Optional<ButtonType> buttonResult = confirm.showAndWait();
                if (buttonResult.get() == ButtonType.OK) {
                    try {
                        getConnection().checkOut();
                        getConnection().setEagerRefresh();
                        
                    }catch(ModelException me){
                        handleException(me);
                    }
                }
            }
        });
        if (withStaticOperations) result.getItems().add(item);
        if (selected != null){
            try {
                this.setPreCalculatedFilters(this.getConnection().customerService_Menu_Filter((Anything)selected));
            } catch (ModelException me){
                this.handleException(me);
                return result;
            }
            if (selected instanceof ArticleView){
                item = new AddToCartPRMTRArticlePRMTRIntegerPRMTRMenuItem();
                item.setText("Zum Einkaufswagen hinzuf�gen ... ");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        final CustomerServiceAddToCartArticleIntegerMssgWizard wizard = new CustomerServiceAddToCartArticleIntegerMssgWizard("Zum Einkaufswagen hinzuf�gen");
                        wizard.setFirstArgument((ArticleView)selected);
                        wizard.setWidth(getNavigationPanel().getWidth());
                        wizard.showAndWait();
                    }
                });
                result.getItems().add(item);
            }
            if (selected instanceof CustomerOrderView){
                item = new AcceptDeliveryPRMTRCustomerOrderPRMTRMenuItem();
                item.setText("acceptDelivery");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        Alert confirm = new Alert(AlertType.CONFIRMATION);
                        confirm.setTitle(GUIConstants.ConfirmButtonText);
                        confirm.setHeaderText(null);
                        confirm.setContentText("acceptDelivery" + GUIConstants.ConfirmQuestionMark);
                        Optional<ButtonType> buttonResult = confirm.showAndWait();
                        if (buttonResult.get() == ButtonType.OK) {
                            try {
                                getConnection().acceptDelivery((CustomerOrderView)selected);
                                getConnection().setEagerRefresh();
                                
                            }catch(ModelException me){
                                handleException(me);
                            }
                        }
                    }
                });
                result.getItems().add(item);
            }
            if (selected instanceof QuantifiedArticlesView){
                item = new RemoveFCartPRMTRQuantifiedArticlesPRMTRCartPRMTRMenuItem();
                item.setText("L�schen ... ");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        final CustomerServiceRemoveFCartQuantifiedArticlesCartMssgWizard wizard = new CustomerServiceRemoveFCartQuantifiedArticlesCartMssgWizard("L�schen");
                        wizard.setFirstArgument((QuantifiedArticlesView)selected);
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
    
	class CustomerServiceAddToCartArticleIntegerMssgWizard extends Wizard {

		protected CustomerServiceAddToCartArticleIntegerMssgWizard(String operationName){
			super(CustomerServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new AddToCartPRMTRArticlePRMTRIntegerPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "CustomerServiceAddToCartArticleIntegerMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().addToCart(firstArgument, ((IntegerSelectionPanel)getParametersPanel().getChildren().get(0)).getResult().longValue());
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
		
		
		private ArticleView firstArgument; 
	
		public void setFirstArgument(ArticleView firstArgument){
			this.firstArgument = firstArgument;
			this.setTitle(this.firstArgument.toString());
			this.check();
		}
		
		
	}

	class CustomerServiceDepositIntegerMssgWizard extends Wizard {

		protected CustomerServiceDepositIntegerMssgWizard(String operationName){
			super(CustomerServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new DepositPRMTRIntegerPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "CustomerServiceDepositIntegerMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().deposit(((IntegerSelectionPanel)getParametersPanel().getChildren().get(0)).getResult().longValue());
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

	class CustomerServiceFindArticleStringMssgWizard extends Wizard {

		protected CustomerServiceFindArticleStringMssgWizard(String operationName){
			super(CustomerServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new FindArticlePRMTRStringPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "CustomerServiceFindArticleStringMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().findArticle(((StringSelectionPanel)getParametersPanel().getChildren().get(0)).getResult());
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
			getParametersPanel().getChildren().add(new StringSelectionPanel("description", this));		
		}	
		protected void handleDependencies(int i) {
		}
		
		
	}

	class CustomerServiceRemoveFCartQuantifiedArticlesCartMssgWizard extends Wizard {

		protected CustomerServiceRemoveFCartQuantifiedArticlesCartMssgWizard(String operationName){
			super(CustomerServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new RemoveFCartPRMTRQuantifiedArticlesPRMTRCartPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "CustomerServiceRemoveFCartQuantifiedArticlesCartMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().removeFCart(firstArgument, (CartView)((ObjectSelectionPanel)getParametersPanel().getChildren().get(0)).getResult());
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
			final ObjectSelectionPanel panel1 = new ObjectSelectionPanel("cart", "view.CartView", null, this);
			getParametersPanel().getChildren().add(panel1);
			panel1.setBrowserRoot((ViewRoot) getConnection().getCustomerServiceView());		
		}	
		protected void handleDependencies(int i) {
		}
		
		
		private QuantifiedArticlesView firstArgument; 
	
		public void setFirstArgument(QuantifiedArticlesView firstArgument){
			this.firstArgument = firstArgument;
			this.setTitle(this.firstArgument.toString());
			this.check();
		}
		
		
	}

	class CustomerServiceWithdrawIntegerMssgWizard extends Wizard {

		protected CustomerServiceWithdrawIntegerMssgWizard(String operationName){
			super(CustomerServiceClientView.this);
			getOkButton().setText(operationName);
			getOkButton().setGraphic(new WithdrawPRMTRIntegerPRMTRMenuItem ().getGraphic());
		}
		protected void initialize(){
			this.helpFileName = "CustomerServiceWithdrawIntegerMssgWizard.help";
			super.initialize();		
		}
				
		protected void perform() {
			try {
				getConnection().withdraw(((IntegerSelectionPanel)getParametersPanel().getChildren().get(0)).getResult().longValue());
				getConnection().setEagerRefresh();
				this.close();	
			} catch(ModelException me){
				handleException(me);
				this.close();
			}
			catch(InsufficientFunds e) {
				getStatusBar().setText(e.getMessage());
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
	
	private ImageView getIconForMenuItem(CustomerServiceMenuItem menuItem){
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
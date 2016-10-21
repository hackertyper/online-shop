package viewClient;

import com.sun.javafx.geom.Point2D;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToolBar;
import javafx.scene.control.TreeItem;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import view.Anything;
import view.ArticleView;
import view.ModelException;
import view.objects.ViewObjectInTree;
import view.objects.ViewRoot;
import viewClient.CustomerServiceClientView.CustomerServiceAddToCartArticleIntegerMssgWizard;
import viewClient.CustomerServiceClientView.CustomerServiceFindArticleStringMssgWizard;

public class ShopServiceView extends BorderPane {
	private CustomerServiceClientView view;
	
	public ShopServiceView(CustomerServiceClientView view) {
		this.view = view;
		this.initialize();
	}
	private void initialize() {
		this.setTop(getMainToolBar());
        this.setCenter(getMainSplitPane());
	}
	private ToolBar mainToolBar = null;
	private ToolBar getMainToolBar() {
		if( this.mainToolBar == null){
			this.mainToolBar = new ToolBar();
			for( Button current : this.getToolButtonsForShopOperations()) {
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
			this.mainSplitPane.getItems().addAll( this.getArticleListPane(), this.getTitledDetailsPane());	
			this.mainSplitPane.setDividerPosition( 0, 0.5);
			this.mainSplitPane.prefHeightProperty().bind( this.heightProperty());
			this.mainSplitPane.prefWidthProperty().bind( this.widthProperty());
		}
		return this.mainSplitPane;
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
	private TitledPane articleListPane = null;
	private TitledPane getArticleListPane() {
		if(this.articleListPane == null) {
			this.articleListPane = new TitledPane(GUIConstants.ArticleListTitle, getArticleTree());
			this.articleListPane.setCollapsible(false);
			this.articleListPane.prefHeightProperty().bind( this.getMainSplitPane().heightProperty());
			
		}
		return this.articleListPane;
	}
	private TreeRefresh articleTree = null;
	private TreeRefresh getArticleTree() {
		if( this.articleTree == null) {
			this.articleTree = new TreeRefresh( view );
			this.articleTree.getSelectionModel().setSelectionMode( SelectionMode.SINGLE);
			this.articleTree.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TreeItem<ViewObjectInTree>>() {
				public void changed(
					ObservableValue<? extends TreeItem<ViewObjectInTree>> observable,
					TreeItem<ViewObjectInTree> oldValue,
					TreeItem<ViewObjectInTree> newValue) {
					if( menu !=null) menu.hide();
					if( newValue != null ){						
						view.setDetailsTable( (Anything) newValue.getValue().getWrappedObject());				
					}
				}
			});
			this.articleTree.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
				public void handle(ContextMenuEvent e) {
					tryShowContextMenu( e, articleTree, false);					
				}
			});
			articleTree.setOnKeyReleased( new EventHandler<KeyEvent>() {
				public void handle(KeyEvent event) {
					if( event.getCode() == KeyCode.F5 ){
						Platform.runLater( new Runnable() {
							public void run() {								
								try {
									getArticleTree().refreshTree();
								} catch (ModelException e) {
									view.handleException(e);
								}			
							}
						});
					}
				}
			});
		}
		return this.articleTree;
	}
	private DetailPanel currentDetails = null;
	protected void setDetailsTable( Anything object) {
		this.getTitledDetailsPane().setVisible( false );
		if (object == null && view.getConnection() != null) object = view.getConnection().getCustomerServiceView();
		if (object == null){
			this.currentDetails = view.getNoDetailsPanel();
		}else{
			try {
				this.currentDetails = view.getDetailView(object);
			} catch (ModelException e) {
				view.handleException(e);
				this.currentDetails = null;
			}
			if(this.currentDetails == null) this.currentDetails = getStandardDetailsTable(object);
		}
		this.getTitledDetailsPane().setContent( this.currentDetails );
		this.getTitledDetailsPane().setVisible( true );
		this.currentDetails.prefWidthProperty().bind( this.getTitledDetailsPane().widthProperty() );
	}
	private DetailPanel getStandardDetailsTable(Anything object) {
		try {
			return DefaultDetailPanel.getStandardDetailPanel(object,view);
		} catch (ModelException e) {
			view.handleException(e);
			return new NoDetailPanel(view);
		}
	}
	private ContextMenu menu = null;
	protected void tryShowContextMenu( ContextMenuEvent e, TreeRefresh tree, boolean withStaticOperations) {
		if( this.menu !=null ) this.menu.hide();
		SelectionModel<TreeItem<ViewObjectInTree>> selMod = tree.getSelectionModel();
		ViewObjectInTree selVal = selMod.getSelectedItem().getValue();
		ViewRoot selected = selVal.getWrappedObject();
		this.menu = this.getContextMenu( selected, withStaticOperations , new Point2D((float)e.getScreenX(), (float)e.getScreenY() ) );
		if( this.menu.getItems().size() > 0) {
			this.menu.show( this.getArticleListPane(),  e.getScreenX(), e.getScreenY() );
		}
	}
	private ContextMenu getContextMenu(final ViewRoot selected, final boolean withStaticOperations, final Point2D menuPos) {
        final ContextMenu result = new ContextMenu();
        MenuItem item = null;
        if (selected != null){
            if (selected instanceof ArticleView){
                item = view.newAddToCartPRMTRArticlePRMTRIntegerPRMTRMenuItem();
                item.setText("Zum Einkaufswagen hinzufügen ... ");
                item.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(javafx.event.ActionEvent e) {
                        final CustomerServiceAddToCartArticleIntegerMssgWizard wizard = view.new CustomerServiceAddToCartArticleIntegerMssgWizard("Zum Einkaufswagen hinzufügen");
                        wizard.setFirstArgument((ArticleView)selected);
                        wizard.setWidth(getArticleListPane().getWidth());
                        wizard.showAndWait();
                    }
                });
                result.getItems().add(item);
            }
        }
        this.addNotGeneratedItems(result,selected);
        return result;
	}
	private void addNotGeneratedItems(ContextMenu result, ViewRoot selected) {
		// TODO Add items to menue if you have not generated service calls!!!
	}
	private java.util.Vector<javafx.scene.control.Button> getToolButtonsForShopOperations() {
        java.util.Vector<javafx.scene.control.Button> result = new java.util.Vector<javafx.scene.control.Button>();
        javafx.scene.control.Button currentButton = null;
        currentButton = new javafx.scene.control.Button("Artikel suchen ... ");
        currentButton.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                final CustomerServiceFindArticleStringMssgWizard wizard = view.new CustomerServiceFindArticleStringMssgWizard("Artikel suchen");
                wizard.setWidth(getArticleListPane().getWidth());
                wizard.showAndWait();
            }
        });
        result.add(currentButton);
        return result;
	}
}

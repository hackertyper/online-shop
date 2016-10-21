package viewClient;

import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import view.ModelException;

public class CartServiceView extends BorderPane {
	private CustomerServiceClientView view;
	private boolean isReserved = false;
	
	public CartServiceView(CustomerServiceClientView view) {
		this.view = view;
		this.initialize();
	}
	private void initialize() {
		this.setTop(getMainToolBar());
        this.setCenter(getTitledDetailsPane());
	}
	private ToolBar mainToolBar = null;
	private ToolBar getMainToolBar() {
		if( this.mainToolBar == null){
			this.mainToolBar = new ToolBar();
			this.mainToolBar.getItems().add( getToolButton() );
		}
		return this.mainToolBar;
	}
	private TitledPane titledDetailsPane = null;
	private TitledPane getTitledDetailsPane() {
		if( this.titledDetailsPane == null ){
			this.titledDetailsPane = new TitledPane();
			this.titledDetailsPane.setText( GUIConstants.DetailsTitle);
			this.titledDetailsPane.setCollapsible(false);			
			this.titledDetailsPane.prefHeightProperty().bind(this.heightProperty());
		}
		return this.titledDetailsPane;		
	}
	private javafx.scene.control.Button getToolButton() {
        javafx.scene.control.Button result = null;
        if(!isReserved) {
			result = new javafx.scene.control.Button("Zur Kasse gehen");
			result.setOnAction(new EventHandler<ActionEvent>(){
		        public void handle(javafx.event.ActionEvent e) {
		            Alert confirm = new Alert(AlertType.CONFIRMATION);
		            confirm.setTitle(GUIConstants.ConfirmButtonText);
		            confirm.setHeaderText(null);
		            confirm.setContentText("Zur Kasse gehen" + GUIConstants.ConfirmQuestionMark);
		            Optional<ButtonType> buttonResult = confirm.showAndWait();
		            if (buttonResult.get() == ButtonType.OK) {
		                try {
		                    view.getConnection().checkOut();
		                    isReserved = true;
		                    view.getConnection().setEagerRefresh();
		                    getMainToolBar().getItems().clear();
		                    getMainToolBar().getItems().add(getToolButton());
		                }catch(ModelException me){
		                    view.handleException(me);
		                }
		            }
		        }
		    });
        }
        if(isReserved) {
        	result = new javafx.scene.control.Button("Bestellen");
        	result.setOnAction(new EventHandler<ActionEvent>(){
                public void handle(javafx.event.ActionEvent e) {
                    Alert confirm = new Alert(AlertType.CONFIRMATION);
                    confirm.setTitle(GUIConstants.ConfirmButtonText);
                    confirm.setHeaderText(null);
                    confirm.setContentText("Bestellen" + GUIConstants.ConfirmQuestionMark);
                    Optional<ButtonType> buttonResult = confirm.showAndWait();
                    if (buttonResult.get() == ButtonType.OK) {
                        try {
                            view.getConnection().order();
                            isReserved = false;
                            view.getConnection().setEagerRefresh();
                            getMainToolBar().getItems().clear();
		                    getMainToolBar().getItems().add(getToolButton());
                            
                        }catch(ModelException me){
                            view.handleException(me);
                        }
                    }
                }
            });
        }
        return result;
	}
}

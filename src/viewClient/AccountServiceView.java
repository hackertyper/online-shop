package viewClient;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import viewClient.CustomerServiceClientView.CustomerServiceDepositIntegerMssgWizard;
import viewClient.CustomerServiceClientView.CustomerServiceWithdrawIntegerMssgWizard;

public class AccountServiceView extends BorderPane {
	private CustomerServiceClientView view;
	public AccountServiceView(CustomerServiceClientView view) {
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
			for( Button current : this.getToolButtonsForStaticOperations()) {
				this.mainToolBar.getItems().add( current );
			}
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
	private java.util.Vector<javafx.scene.control.Button> getToolButtonsForStaticOperations() {
        java.util.Vector<javafx.scene.control.Button> result = new java.util.Vector<javafx.scene.control.Button>();
        javafx.scene.control.Button currentButton = null;
        currentButton = new javafx.scene.control.Button("Geld abheben ... ");
        currentButton.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                final CustomerServiceWithdrawIntegerMssgWizard wizard = view.new CustomerServiceWithdrawIntegerMssgWizard("Geld abheben");
                wizard.setWidth(getTitledDetailsPane().getWidth());
                wizard.showAndWait();
            }
        });
        result.add(currentButton);
        currentButton = new javafx.scene.control.Button("Geld einzahlen ... ");
        currentButton.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(javafx.event.ActionEvent e) {
                final CustomerServiceDepositIntegerMssgWizard wizard = view.new CustomerServiceDepositIntegerMssgWizard("Geld einzahlen");
                wizard.setWidth(getTitledDetailsPane().getWidth());
                wizard.showAndWait();
            }
        });
        result.add(currentButton);
        return result;
    }
}

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage; // for labels and buttons?


public class FxStudying extends Application { //extending it to a application?
	
	//Labels 
	Label l_status;
	Label l_serverIp;
	Label l_serverQport;
	Label l_serverUsername;
	Label l_serverPassword;
	Label l_botUsername;
	
	//Buttons
	Button btn_connect;
	
	//Text Fields
	TextField serverIp;
	TextField serverQport;
	TextField serverUsername;
	TextField serverPassword;
	TextField botUsername;
	
	//Vars
	String windowTitle = "Ts3 Moderation Bot";
	int uiSpacing = 5;
	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		//Labels
		l_status = new Label("Disconnected");
		l_serverIp = new Label("Server IP:");
		l_serverQport = new Label("Server Query Port:");
		l_serverUsername = new Label("Query Username:");
		l_serverPassword = new Label("Query Password:");
		l_botUsername = new Label("Bot Username:");
		
		//Buttons
		btn_connect = new Button("click it");
		
		//Text fields
		serverIp = new TextField();
		serverQport = new TextField();
		serverUsername = new TextField();
		serverPassword = new TextField();
		botUsername = new TextField();
		
		// On click 
		btn_connect.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				String text = serverIp.getText();
				l_status.setText(text);
			}
			
		});
		
		//
		
		VBox vb = new VBox();
		//we need to set the positions before actually displaying them ;D
		btn_connect.setPrefSize(70, 20); //width, height
		serverIp.setMaxSize(150, 20);
		serverQport.setMaxSize(150, 20);
		serverUsername.setMaxSize(150, 20);
		serverPassword.setMaxSize(150, 20);
		botUsername.setMaxSize(150, 20);

		vb.setSpacing(uiSpacing);
		// Buttons, Labels, TextFields, and more.
		vb.getChildren().addAll(l_serverIp, serverIp, // server IP gui
								  l_serverQport, serverQport, // server Query port gui
								  l_serverUsername, serverUsername, // server Username gui
								  l_serverPassword, serverPassword, // server Password gui
								  l_botUsername, botUsername, // botUsername gui
								  l_status, btn_connect); // misc gui
		
		Scene scene = new Scene(vb, 700, 350);
		stage.setScene(scene);
		stage.setTitle(windowTitle);
		stage.show(); //inits the window1
		
	}
}

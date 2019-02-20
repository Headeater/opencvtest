package opencv.com.opencvimage;

import javafx.application.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

/**
 * Hello world!
 *
 */
public class App extends Application
{
	
	Button knopf; 
	
    public static void main( String[] args )
    {
        launch(args);				//Methode in Application-Class
    }
    

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Einstieg");		
		knopf = new Button("Testknopf");
		
		StackPane aussehen = new StackPane();
		aussehen.getChildren().add(knopf);
		
		Scene szene = new Scene(aussehen, 300, 300);
		primaryStage.setScene(szene);
		primaryStage.show();
		
	}
}

package calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainCalculator extends Application {

	@Override
	public void start(Stage primaryStage) {

		try {
			Parent root = FXMLLoader.load(getClass().getResource("BasicCalculator.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("Calculator.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Basic Calculator No. 0.0.1");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		launch(args);
	}

}

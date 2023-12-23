package calculator;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class BasicCalculatorController implements Initializable {

	@FXML
	private AnchorPane pane;

	@FXML
	private GridPane calcButtons;

	SimpleIntegerProperty integerValue = new SimpleIntegerProperty();

	@FXML
	public void assignIntegersEventAction(ActionEvent event) {

		Button integerButton = (Button) event.getSource();
		System.out.println(integerButton.getText());
		
		// Concatenate text until you hit an non text button
	}

	@FXML
	public void assignOperatorEventAction(ActionEvent event) {

		System.out.println(event.getSource());
		System.out.println(event.getTarget());
	}

	@FXML
	public void assignMemoryEventAction(ActionEvent event) {

		System.out.println(event.getSource());
		System.out.println(event.getTarget());
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		for (Node idx : calcButtons.getChildren()) {

			if (idx instanceof Button)
			{
				((Button) idx).getText();
			}
		}
	}

}

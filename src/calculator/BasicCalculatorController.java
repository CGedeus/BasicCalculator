package calculator;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class BasicCalculatorController implements Initializable {

	private Button integerButton;

	private String n1 = new String();

	private String n2 = new String();

	private String sign = new String();

	private SimpleStringProperty numberProperty = new SimpleStringProperty();

	@FXML
	private TextField textField;

	@FXML
	private GridPane calcButtons;

	@FXML
	private void integerActionEvent(ActionEvent event) {

		integerButton = (Button) event.getSource();
		if (sign.isEmpty()) {
			n1 += integerButton.getText();
			numberProperty.set(n1);
			textField.textProperty().bind(numberProperty);
		} else if (!sign.isEmpty()) {
			n2 += integerButton.getText();
			numberProperty.set(n2);
			textField.textProperty().bind(numberProperty);
		} else {
			// Nothing
		}
	}

	@FXML
	private void operatorActionEvent(ActionEvent event) {

		Button button = (Button) event.getSource();
		sign = button.getText();
	}

	@FXML
	private int equalActionEvent(ActionEvent event) {

		int result = 0;
		int operand1 = Integer.parseInt(n1);
		int operand2 = Integer.parseInt(n2);
		n1 = new String();
		n2 = new String();

		switch (sign) {
			case "+":
				result = operand1 + operand2;
				break;
			case "-":
				result = operand1 - operand2;
				break;
			case "*":
				result = operand1 * operand2;
				break;
			case "/":
				result = operand1 / operand2;
				break;
			default:
				break;
		}

		sign = "";

		textField.textProperty().bind(new SimpleStringProperty(String.valueOf(result)));

		return result;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

}
package wholeworthsgrocery;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable {

    @FXML
    private TextField inputEggs;

    @FXML
    private TextField inputMilk;

    @FXML
    private TextField inputBread;

    @FXML
    private TextField subtotalEggs;

    @FXML
    private TextField subtotalMilk;

    @FXML
    private TextField subtotalBread;

    @FXML
    private Button btnCalculate;

    @FXML
    private TextField totalPrice;

    @FXML
    void buttonCalculatorHandler(ActionEvent event) {
        double total = 0.0;
        total += processSubtotal(inputEggs, subtotalEggs, 0.5, 12, 5.0);
        total += processSubtotal(inputMilk, subtotalMilk, 2.5, 3, 7.0);
        total += processSubtotal(inputBread, subtotalBread, 3.5, 2, 6.0);
        
        totalPrice.setText("$" + total);
    }

    // inputTF, outputTF, unit price, qty per bundle, bundle price
    private double processSubtotal(TextField inputTF, TextField outputTF, double unitPrice, int bundle, double bundlePrice) {
        double subtotal = 0.0;

        try {

            int qty = Integer.valueOf(inputTF.getText());
            subtotal = (qty / bundle) * bundlePrice + (qty % bundle) * unitPrice;
            String output = "$" + subtotal;
            outputTF.setText(String.valueOf(output));
        } catch (NumberFormatException ex) {
            if ("".equals(inputTF.getText())) {
                outputTF.clear();
            } else {
                outputTF.setText("Invalid Qty...");
            }
        }

        return subtotal;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}

package sample;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;

import java.util.Arrays;

public class Controller {
    public Button closeBtn;
    public Button minimizeBtn;
    public Button ACBtn;
    public Button divideBtn;
    public Button nineBtn;
    public Button eightBtn;
    public Button sevenBtn;
    public Button multipleBtn;
    public Button sixBtn;
    public Button fiveBtn;
    public Button fourBtn;
    public Button minusBtn;
    public Button threeBtn;
    public Button twoBtn;
    public Button oneBtn;
    public Button plusBtn;
    public Button equalsBtn;
    public Button floatBtn;
    public Button zeroBtn;
    public Button powBtn;
    public Button sinBtn;
    public Button cosBtn;
    public Button sqrtBtn;
    public Calculator calculator = new Calculator();
    public TextField expressionTF;

    public void CloseBtnClick(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void ACBtnClick(ActionEvent actionEvent) {
        expressionTF.setText("");
    }

    public void DivideBtnClick(ActionEvent actionEvent) {
        expressionTF.setText(expressionTF.getText() + " / ");
    }

    public void NineBtnClick(ActionEvent actionEvent) {
        expressionTF.setText(expressionTF.getText() + "9");
    }

    public void EightBtnClick(ActionEvent actionEvent) {
        expressionTF.setText(expressionTF.getText() + "8");
    }

    public void SevenBtnClick(ActionEvent actionEvent) {
        expressionTF.setText(expressionTF.getText() + "7");
    }

    public void MultipleBtnClick(ActionEvent actionEvent) {
        expressionTF.setText(expressionTF.getText() + " x ");
    }

    public void SixBtnClick(ActionEvent actionEvent) {
        expressionTF.setText(expressionTF.getText() + "6");
    }

    public void FiveBtnClick(ActionEvent actionEvent) {
        expressionTF.setText(expressionTF.getText() + "5");
    }

    public void FourBtnClick(ActionEvent actionEvent) {
        expressionTF.setText(expressionTF.getText() + "4");
    }

    public void MinusBtnClick(ActionEvent actionEvent) {
        expressionTF.setText(expressionTF.getText() + " - ");
    }

    public void ThreeBtnClick(ActionEvent actionEvent) {
        expressionTF.setText(expressionTF.getText() + "3");
    }

    public void TwoBtnClick(ActionEvent actionEvent) {
        expressionTF.setText(expressionTF.getText() + "2");
    }

    public void OneBtnClick(ActionEvent actionEvent) {
        expressionTF.setText(expressionTF.getText() + "1");
    }

    public void PlusBtnClick(ActionEvent actionEvent) {
        expressionTF.setText(expressionTF.getText() + " + ");
    }

    public void EqualsBtnClick(ActionEvent actionEvent) {
        String[] expression = expressionTF.getText().split(" ");

        double sqrt = 0, pow = 0, sin = 0, cos = 0, sum = 0, subtract = 0, multiple = 0, divide = 0;
        int i = expression.length / 2;
        System.out.println(Arrays.toString(expression) + i);
        switch (expression[i]) {
            case "Sqrt(":
                sqrt = calculator.sqrt(Double.parseDouble(expression[i + 1]));
                expressionTF.setText(String.valueOf(sqrt));
                break;
            case "^":
                pow = calculator.pow(Double.parseDouble(expression[i - 1]), Double.parseDouble(expression[i + 1]));
                expressionTF.setText(String.valueOf(pow));
                break;
            case "Sin(":
                sin = calculator.sin(Double.parseDouble(expression[i + 1]));
                expressionTF.setText(String.valueOf(sin));
                break;
            case "Cos(":
                cos = calculator.cos(Double.parseDouble(expression[i + 1]));
                expressionTF.setText(String.valueOf(cos));
                break;
            case "+":
                sum = calculator.sum(Double.parseDouble(expression[i - 1]), Double.parseDouble(expression[i + 1]));
                expressionTF.setText(String.valueOf(sum));
                break;
            case "-":
                subtract = calculator.subtract(Double.parseDouble(expression[i - 1]), Double.parseDouble(expression[i + 1]));
                expressionTF.setText(String.valueOf(subtract));
                break;
            case "x":
                multiple = calculator.multiple(Double.parseDouble(expression[i - 1]), Double.parseDouble(expression[i + 1]));
                expressionTF.setText(String.valueOf(multiple));
                break;
            case "/":
                divide = calculator.divide(Double.parseDouble(expression[i - 1]), Double.parseDouble(expression[i + 1]));
                expressionTF.setText(String.valueOf(divide));
                break;
            default:
                System.out.println(expression[i]);
                expressionTF.setText("Invalid expression");
                break;
        }
    }

    public void FloatBtnClick(ActionEvent actionEvent) {
        expressionTF.setText(expressionTF.getText() + ".");
    }

    public void ZeroBtnClick(ActionEvent actionEvent) {
        expressionTF.setText(expressionTF.getText() + "0");
    }

    public void PowBtnClick(ActionEvent actionEvent) {
        expressionTF.setText(expressionTF.getText() + " ^ ");
    }

    public void SinBtnClick(ActionEvent actionEvent) {
        expressionTF.setText(expressionTF.getText() + " Sin( ");
    }

    public void CosBtnClick(ActionEvent actionEvent) {
        expressionTF.setText(expressionTF.getText() + " Cos( ");
    }

    public void SqrtBtnClick(ActionEvent actionEvent) {
        expressionTF.setText(expressionTF.getText() + " Sqrt( ");
    }
}

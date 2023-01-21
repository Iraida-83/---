package ui;

import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class UI {
    public static Text createText(String str, int y, int x, Font font){
        Text text = new Text(str);
        text.setLayoutY(y);    // установка положения надписи по оси Y
        text.setLayoutX(x);   // установка положения надписи по оси X
        text.setFont(font);
        return text;
    }

    public static TextField createTextField(String str, int y, int x, int prefWidth){
        TextField textField = new TextField();
        textField.setLayoutY(y);
        textField.setLayoutX(x);
        textField.setPrefWidth(prefWidth);
        textField.setPromptText(str);
        return textField;
    }

}

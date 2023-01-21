import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import operation.binary.operation.Work;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import ui.UI;

public class Main extends Application {
    public static void main(String[] args) {
        Work.BinaryOperation();
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Font baseFont = Font.font("verdana", 16);

        String welcomeStr = "Здесь можно вычислит длительность выплат в зависимости от: \n суммы кредита, годового процента и ежемесечной выплаты";
        String inputDataStr = "Введите данные: ";
        String creditStr = "Сумма кредита = ";
        String percentStr = "Годовой процент = ";
        String paymentStr = "Ежемесячный платёж = ";

        String creditPromptText = "введите сумму кредита";
        String percentPromptText = "введите годовой процент";
        String paymentPromptText = "введите ежемесячный платёж";

        Text welcomeText = UI.createText(welcomeStr, 20, 0, baseFont);
        Text inputData = UI.createText(inputDataStr, 80, 0, Font.font("verdana", FontWeight.BOLD, 16));
        Text creditText = UI.createText(creditStr, 120, 0, baseFont);
        Text percentText = UI.createText(percentStr, 160, 0, baseFont);
        Text paymentText = UI.createText(paymentStr, 200, 0, baseFont);

        TextField creditValue = UI.createTextField(creditPromptText, 100, 150, 200);
        TextField percentValue = UI.createTextField(percentPromptText, 140, 170, 200);
        TextField paymentValue = UI.createTextField(paymentPromptText, 180, 200, 200);

        Label lbl = new Label();
        lbl.setLayoutY(280);
        lbl.setLayoutX(0);
        lbl.setFont(Font.font("verdana", FontWeight.BOLD,16));

        Button btn = new Button("Рассчитать");
        btn.setPrefWidth(100);
        btn.setLayoutY(240);
        btn.setLayoutX(200);
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                int count = 0;
                try {
                    int credit = Integer.parseInt(creditValue.getText());
                    int percent = Integer.parseInt(percentValue.getText());
                    int payment = Integer.parseInt(paymentValue.getText());
                    int sum = credit + payment + percent;
                    while (sum >= 0){
                        sum += sum * (percent / 100);
                        sum -= payment;
                        count++;
                    }
                    lbl.setText("Количество месяцев для погашения: " + count);
                }
                catch (Exception e){
                    e.printStackTrace();
                    lbl.setText("Ошибка при вводе значений");
                }
            }
        });
        Group group = new Group(welcomeText, inputData, creditText, creditValue, percentText, percentValue, paymentText, paymentValue, btn, lbl);
        Scene scene = new Scene(group);

        stage.setScene(scene);
        stage.setTitle("Графическое приложение Java");
        stage.setWidth(600);
        stage.setHeight(500);
        stage.show();
    }
}

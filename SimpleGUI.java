
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class SimpleGUI extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("Welcome to the SOS Project GUI!");

        Line line = new Line(0, 0, 200, 0);

        CheckBox checkBox = new CheckBox("Enable feature");
        RadioButton option1 = new RadioButton("Option A");
        RadioButton option2 = new RadioButton("Option B");

        ToggleGroup group = new ToggleGroup();
        option1.setToggleGroup(group);
        option2.setToggleGroup(group);

        VBox layout = new VBox(10, label, line, checkBox, option1, option2);
        Scene scene = new Scene(layout, 300, 200);

        stage.setScene(scene);
        stage.setTitle("Sprint 0 GUI Demo");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}


package xmlParser;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.nio.charset.Charset;
import java.util.ArrayList;

public class App extends Application {
    final ToggleGroup toggleGroup = new ToggleGroup();
    Stage stage;
    BorderPane root;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        root = new BorderPane();
        root.setLeft(addVBox());

        Scene scene = new Scene(root, 640, 480);
        primaryStage.setScene(scene);
        primaryStage.setTitle(new String("OП - хуй".getBytes(), Charset.forName("UTF-8")));
        primaryStage.show();
    }

    public VBox addVBox() {
        VBox vBox = new VBox();
        vBox.setPadding(new Insets(15, 12, 15, 12));
        vBox.setSpacing(10);
        vBox.setStyle("-fx-background-color: #336699;");

        Button chooseBtn = new Button("Choose file...");
        chooseBtn.setPrefSize(150, 20);

        FileChooserHandler fileChooserHandler = new FileChooserHandler(stage);

        chooseBtn.setOnAction(e -> {
            fileChooserHandler.handle(e);
            TextArea area = new TextArea();
            area.setEditable(false);
            if (fileChooserHandler.set != null) {
                addRadioButtons(vBox, fileChooserHandler, area);
                root.setCenter(area);
            }
        });

        vBox.getChildren().addAll(chooseBtn);
        return vBox;
    }

    private void addRadioButtons(VBox vBox,
                                 FileChooserHandler fileChooserHandler,
                                 TextArea area) {
        ArrayList<RadioButton> radioButtons = new ArrayList<>();
        fileChooserHandler.set.forEach(s ->
        radioButtons.add(new RadioButton(s)));
        radioButtons.forEach(btn -> {
            btn.setToggleGroup(toggleGroup);
            btn.setStyle("-fx-text-fill:white");
            btn.setOnAction(new RadioButtonListener(fileChooserHandler, area));
            vBox.getChildren().add(btn);
        });

    }
}

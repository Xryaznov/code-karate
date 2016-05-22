package xmlParser;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Set;

public class FileChooserHandler implements EventHandler<ActionEvent> {
    Set<String> set;
    AnonXmlParser xmlParser;
    private Stage primaryStage;

    public FileChooserHandler(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @Override
    public void handle(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        configureFileChooser(fileChooser);

        File file = fileChooser.showOpenDialog(primaryStage);
        if (file != null) {
            xmlParser = new AnonXmlParser();
            set = xmlParser.getAttributes(file);
        }
    }

    private void configureFileChooser(final FileChooser fileChooser) {
        fileChooser.setTitle(new String("ОП - хуй".getBytes(), Charset.forName("UTF-8")));
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
    }
}

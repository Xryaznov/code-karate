package xmlParser;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;

public class RadioButtonListener
        implements EventHandler<ActionEvent> {
    private FileChooserHandler fileChooserHandler;
    private TextArea area;

    public RadioButtonListener(FileChooserHandler fileChooserHandler,
                               TextArea area) {
        this.fileChooserHandler = fileChooserHandler;
        this.area = area;
    }

    @Override
    public void handle(ActionEvent event) {
        RadioButton btn = (RadioButton) event.getSource();
        String text = fileChooserHandler
                .xmlParser
                .getAttributeValues(btn.getText());
        area.setText(text);
    }
}

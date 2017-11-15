package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Controller {

    public TextField pole;
    public TableView<String> lista;


    public void handleClick(ActionEvent actionEvent) {
        lista.getItems().add(pole.getText());
    }

    public void initialize (){
        TableColumn<String, String> onlyColumn = (TableColumn<String, String>) lista.getColumns().get(0);
        if (onlyColumn.getCellValueFactory() == null) {
            onlyColumn.setCellValueFactory((param) -> new SimpleStringProperty(param.getValue()));
        }

    }

}

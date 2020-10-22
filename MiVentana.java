/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg001proyectohilos;

import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author FP Mañana A
 */
public class MiVentana {
    public static Scene mostrarVentana(ArrayList<Contacto> lista)
    {
     TableView tv=new TableView();
      
      TableColumn<String, Contacto> columna1 = new TableColumn<>("NOMBRE");
      columna1.setCellValueFactory(new PropertyValueFactory<>("nombre"));
      TableColumn<String, Contacto> columna2 = new TableColumn<>("FOTO");
      columna2.setCellValueFactory(new PropertyValueFactory<>("foto"));
      TableColumn<String, Contacto> columna3 = new TableColumn<>("SEXO");
      columna3.setCellValueFactory(new PropertyValueFactory<>("sexo"));
      TableColumn<String, Contacto> columna4 = new TableColumn<>("NIVEL INGLES");
      columna4.setCellValueFactory(new PropertyValueFactory<>("n_ingles"));
      TableColumn<String, Contacto> columna5 = new TableColumn<>("COLOR");
      columna5.setCellValueFactory(new PropertyValueFactory<>("color"));
      tv.getColumns().add(columna1);
      tv.getColumns().add(columna2);
      tv.getColumns().add(columna3);
      tv.getColumns().add(columna4);
      tv.getColumns().add(columna5);
      for (Contacto contacto : lista) {
            tv.getItems().add(contacto);
        }
        
        VBox v=new VBox(20);
        v.getChildren().addAll(tv);
        Scene escena =new Scene(v, 200, 200);
        return escena;
    }
}

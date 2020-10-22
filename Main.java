/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg001proyectohilos;


import java.util.ArrayList;
import javafx.application.Application;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class Main extends Application{
String ruta="C:\\proyectosjava\\Agenda\\contactos.csv";
Scene scene_lista;
Scene scene_crear;
   public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
        MenuBar menubar=new MenuBar();
        Menu menu1=new Menu("Crear");
        Menu menu2=new Menu("Listar");
        Menu menu3=new Menu("Buscar");
        menubar.getMenus().addAll(menu1,menu2,menu3);
        VBox vBox = new VBox(menubar);
        Scene scene = new Scene(vBox,200,200);
        
        EventHandler<ActionEvent> oyente_crear=new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent t) {
           
        }
        };
        EventHandler<ActionEvent> oyente_buscar=new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent t) {
           
        }
        };
        EventHandler<ActionEvent> oyente_listar=new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent t) {
        ArrayList<Contacto> lista=AccesoFichero.leerContactos(ruta);
        scene_lista=MiVentana.mostrarVentana(lista);
        primaryStage.setScene(scene_lista);
        primaryStage.show();
        }
        };
        
	menu2.setOnAction(oyente_listar);
        primaryStage.setScene(scene);
        primaryStage.show();
        }
}

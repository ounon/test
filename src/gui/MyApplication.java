package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyApplication extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Fruits");
		BorderPane borderPaneRoot = new BorderPane();
		Scene scene = new Scene(borderPaneRoot,800,600);
		primaryStage.setScene(scene);
		
		// creation d'une zone de composants horizontales
		HBox hbox1 = new HBox();
		hbox1.setPadding(new Insets(10)); // espace avec les bordures de la fenêtre
		hbox1.setSpacing(10); // espace entre les composants
		Label labelNom = new Label("Fruits:");
		labelNom.setPadding(new Insets(5)); // espace pour centrer un peu le labael par rapport aux autres composants
		TextField textfieldNom = new TextField();
		Button buttonAdd = new Button("ajouter");
		
		// Insertion des composants dans le même hbox
		hbox1.getChildren().addAll(labelNom,textfieldNom,buttonAdd);
		
		// cration d'une zone de composant vertical
		VBox vbox1 = new VBox();
		vbox1.setPadding(new Insets(10));
		ListView<String> listView1 = new ListView<>();
		listView1.getItems().addAll("Orange","Pomme");
		vbox1.getChildren().add(listView1);
		
		
		// rajout du hbox dans le border pan en haut(Top)
		borderPaneRoot.setTop(hbox1);
		
		// rajout du vbox dans le border pan au centre
		borderPaneRoot.setCenter(vbox1);
		primaryStage.show();
		
		buttonAdd.setOnAction((event) -> {
			String nom = textfieldNom.getText();
			listView1.getItems().add(nom);
		});
	}

}

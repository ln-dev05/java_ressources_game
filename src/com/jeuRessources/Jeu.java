package com.jeuRessources;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.InputStream;


public class Jeu extends Application {
    private final Joueur m_joueur = new Joueur();
    private World worlds[];
    private int currentWorld = 0;

    public Jeu()
    {
        int nbWorlds = 1;
        worlds = new World[nbWorlds];
    }
    private void loadWorld()
    {

    }
    public void changeWolrd()
    {
        currentWorld = m_joueur.changeWorld();
        loadWorld();
    }

    @Override
    public void start(Stage stage) {
        Class<?> aClass = this.getClass();

        InputStream input = aClass.getResourceAsStream("/data/javafx/images/Shop_panel.png");
        Image image = new Image(input, 100, 100, true, false);
        ImageView imageView = new ImageView(image);

        GridPane root = worlds[currentWorld].print();
        root.getChildren().addAll(imageView);

        stage.setScene(new Scene(root, 640, 480));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
        Jeu jeu = new Jeu();
        jeu.loadWorld();
        if (true)
        {
            jeu.changeWolrd();
        }
    }
}

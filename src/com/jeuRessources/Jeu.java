package com.jeuRessources;

import com.jeuRessources.locate.World;
import com.jeuRessources.player.Joueur;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Jeu extends Application {
    private final Joueur m_joueur = new Joueur();
    private World worlds[];
    private int currentWorld = 0;

    public static int MAX_HEIGHT = 640;
    public static int MAX_WIDTH = 640;

    public Jeu()
    {
        int nbWorlds = 1;
        worlds = new World[nbWorlds];
        for (int i = 0; i < nbWorlds; i++)
        {
            worlds[i] = new World(20,20);
        }
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
        GridPane root = worlds[currentWorld].print();
        stage.setScene(new Scene(root, MAX_WIDTH, MAX_HEIGHT));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
        Jeu jeu = new Jeu();
        jeu.loadWorld();
        jeu.changeWolrd();
    }
}

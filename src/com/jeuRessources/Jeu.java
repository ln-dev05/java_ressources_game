package com.jeuRessources;

import com.jeuRessources.locate.World;
import com.jeuRessources.player.Joueur;
import com.jeuRessources.utils.ClickManager;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public final class Jeu extends Application {
    private final Joueur m_joueur = new Joueur();
    private final World[] worlds;
    private int currentWorld = 0;

    public static int MAX_HEIGHT = 640;
    public static int MAX_WIDTH = 640;

    public static double MouseX = 0;
    public static double MouseY = 0;

    public Jeu()
    {
        int nbWorlds = 1;
        worlds = new World[nbWorlds];
        for (int i = 0; i < nbWorlds; i++)
        {
            worlds[i] = new World(20,20);
        }
    }

    @SuppressWarnings("unused")
    private void loadWorld(String path)
    {
        File file = new File(path);
        Scanner myReader;
        try {
            myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unused")
    public void changeWorld()
    {
        currentWorld = m_joueur.changeWorld();
    }

    @Override
    public void start(Stage stage) {
        GridPane root = worlds[currentWorld].print();
        root.setOnMouseClicked(event -> {
            MouseX = event.getSceneX();
            MouseY = event.getSceneY();
            ClickManager.manageEvent(MouseX, MouseY);
        });
        stage.setScene(new Scene(root, MAX_WIDTH, MAX_HEIGHT));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
        new Jeu();
    }
}

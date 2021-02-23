package com.jeuRessources;

public class Jeu {
    private final Joueur m_joueur = new Joueur();
    private World worlds[];
    private int currentWorld = 0;
    public Jeu()
    {
        int nbWorlds = 1;
        worlds = new World[nbWorlds];
    }
    public void changeWolrd()
    {
        currentWorld = m_joueur.changeWorld();
    }
}

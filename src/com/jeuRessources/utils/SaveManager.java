package com.jeuRessources.utils;

import com.jeuRessources.Jeu;
import com.jeuRessources.locate.World;

public final class SaveManager {

    public static void saveGame(Jeu jeu)
    {

    }
    public static void saveWorld(World world)
    {
        WorldFile file = new WorldFile(world);
        file.save();
    }
    public static Jeu readGame(String path)
    {
        // a changer
        return new Jeu();
    }
    public static World readWorld(String path)
    {
        WorldFile file = new WorldFile(path);
        return file.toWorld();
    }
}

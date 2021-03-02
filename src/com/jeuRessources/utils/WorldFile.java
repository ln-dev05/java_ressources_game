package com.jeuRessources.utils;

import com.jeuRessources.locate.World;

import java.io.FileWriter;
import java.io.IOException;

public class WorldFile {
    private int dimX;
    private int dimY;
    private int[][] tab;
    private String path;

    public WorldFile(String path)
    {
        this.path = path;
    }
    public WorldFile(World world)
    {
        this.dimX = world.getWidth();
        this.dimY = world.getHeight();
        this.tab = world.getAreas();
    }

    public void save() {
        try {
            FileWriter file = new FileWriter(this.path);
            file.write(dimX + " " + dimY + "\n");
            for (int i = 0; i < this.dimY; i++)
                for (int j = 0; j < this.dimY; j++)
                    file.write(this.tab[j][i] + " ");
            file.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public World toWorld() {
        return new World(dimY, dimX, tab);
    }
}

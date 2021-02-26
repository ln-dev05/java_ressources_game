
package com.jeuRessources.locate;


import com.jeuRessources.Jeu;
import com.jeuRessources.ressources.Trees;
import com.jeuRessources.ressources.Water;
import javafx.scene.layout.GridPane;

public class World {
    private final Area[][] m_areas;
    private int m_height = 0;
    private int m_width = 0;

    public World()
    {
        this.m_areas = new Area[m_height][m_width];
    }
    public World(int height, int width)
    {
        this.m_height = height;
        this.m_width = width;
        this.m_areas = new Area[m_height][m_width];


        for (int x = 0; x < this.m_height; x++ )
            for (int y = 0; y < this.m_width; y++)
                m_areas[x][y] = new Water();
        setArea(0, 0, new Trees());
    }

    public GridPane print()
    {

        int sizeX = Jeu.MAX_WIDTH / this.m_width;
        int sizeY = Jeu.MAX_HEIGHT / this.m_height;
        GridPane tmp = new GridPane();
        for (int x = 0; x < this.m_height; x++ )
            for (int y = 0; y < this.m_width; y++)
                    tmp.add(m_areas[x][y].getIW(sizeX, sizeY),x,y);
        return tmp;
    }

    public void setArea(int x, int y, Area newArea)
    {
        m_areas[x][y] = newArea;
    }
}

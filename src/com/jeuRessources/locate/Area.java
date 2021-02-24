package com.jeuRessources.locate;

import com.jeuRessources.utils.ImageMap;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.InputStream;

public class Area {
    protected int m_id = 0;

    public Area()
    {

    }

    public ImageView getIW(int sizeX, int sizeY)
    {
        ImageMap myIM = new ImageMap();
        Class<?> aClass = this.getClass();
        InputStream input = aClass.getResourceAsStream(myIM.getPath(m_id));
        Image image = new Image(input, sizeX, sizeY, false, false);
        return new ImageView(image);
    }
}

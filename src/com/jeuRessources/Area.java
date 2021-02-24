package com.jeuRessources;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.InputStream;

public class Area {
    private ImageView m_view;
    private String path;
    public Area()
    {
        Class<?> aClass = this.getClass();
        InputStream input = aClass.getResourceAsStream("/data/javafx/images/Shop_panel.png");
        Image image = new Image(input, 100, 100, true, false);
        this.m_view = new ImageView(image);
    }
    public ImageView getIW()
    {
        return this.m_view;
    }
}

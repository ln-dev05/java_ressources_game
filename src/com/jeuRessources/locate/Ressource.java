package com.jeuRessources.locate;



public class Ressource extends Area{
    private int nbForSecond = 0;

    public Ressource(int id)
    {
        this.m_id = id;
    }
    public Ressource(int id, int nbForSecond)
    {
        this.m_id = id;
        this.nbForSecond = nbForSecond;
    }
    public int getRessourceForASec(){
        return nbForSecond;
    }
}

package com.jeuRessources.locate;



public class Resource extends Area{
    private int nbForSecond = 0;

    public Resource(int id)
    {
        this.m_id = id;
    }
    public Resource(int id, int nbForSecond)
    {
        this.m_id = id;
        this.nbForSecond = nbForSecond;
    }
    public int getResourceForASec(){
        return nbForSecond;
    }
}

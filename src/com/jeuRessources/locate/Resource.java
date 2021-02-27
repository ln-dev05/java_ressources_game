package com.jeuRessources.locate;



public abstract class Resource extends Area{
    private int nbForSecond = 2;
    protected boolean isClickable;

    public Resource(int id)
    {
        this.m_id = id;
    }
    public Resource(int id, int nbForSecond)
    {
        this.m_id = id;
        this.nbForSecond = nbForSecond;
    }

    @SuppressWarnings("unused")
    public int getResourceForASec(){
        return nbForSecond;
    }
    public boolean getIsClickable(){return isClickable;}
}

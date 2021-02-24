package com.jeuRessources.player;

public class Joueur {
    private final Money bourse;
    public Joueur()
    {
        this.bourse = new Money();
    }
    public void pay(int price)
    {
        bourse.pay(price);
    }
    public boolean canPay(int price)
    {
        return bourse.canPay(price);
    }
    public int getSolde()
    {
        return bourse.getSolde();
    }
    public void gain(int gain)
    {
        bourse.gain(gain);
    }
    public int changeWorld()
    {
        return 0;
    }

}

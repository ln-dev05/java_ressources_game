package com.jeuRessources.player;

public class Joueur {
    private final Money coinPurse;
    public Joueur()
    {
        this.coinPurse = new Money();
    }

    @SuppressWarnings("unused")
    public void pay(int price)
    {
        coinPurse.pay(price);
    }

    @SuppressWarnings("unused")
    public boolean canPay(int price)
    {
        return coinPurse.canPay(price);
    }

    @SuppressWarnings("unused")
    public int getMoney()
    {
        return coinPurse.getMoney();
    }
    @SuppressWarnings("unused")
    public void gain(int gain)
    {
        coinPurse.gain(gain);
    }
    @SuppressWarnings("unused")
    public int changeWorld()
    {
        return 0;
    }

}

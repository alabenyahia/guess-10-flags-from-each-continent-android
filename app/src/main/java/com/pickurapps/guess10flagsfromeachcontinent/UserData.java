package com.pickurapps.guess10flagsfromeachcontinent;

public class UserData {
    private int coinsNum = 25;
    private Continent currentContinent = Continent.SOUTH_AMERICA;
    private int currentFlagNum = 0;

    public int getCoinsNum() {
        return coinsNum;
    }

    public void setCoinsNum(int coinsNum) {
        this.coinsNum = coinsNum;
    }

    public Continent getCurrentContinent() {
        return currentContinent;
    }

    public void setCurrentContinent(Continent currentContinent) {
        this.currentContinent = currentContinent;
    }

    public int getCurrentFlagNum() {
        return currentFlagNum;
    }

    public void setCurrentFlagNum(int currentFlagNum) {
        this.currentFlagNum = currentFlagNum;
    }

    //singleton
    private UserData() {

    }
    private static UserData single_instance = null;
    public static UserData getInstance() {
        if (single_instance == null)
            single_instance = new UserData();

        return single_instance;
    }

}

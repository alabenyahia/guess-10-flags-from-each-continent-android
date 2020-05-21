package com.pickurapps.guess10flagsfromeachcontinent;

import android.content.Context;
import android.content.SharedPreferences;

public class UserData {
    private int coinsNum = 25;
    private Continents currentContinent;
    private Continents[] continents;

    public Continents getCurrentContinent() {
        return currentContinent;
    }

    public void setCurrentContinent(Continents currentContinent) {
        this.currentContinent = currentContinent;
    }

    public Continents[] getContinents() {
        return continents;
    }

    public void setContinents(Continents[] continents) {
        this.continents = continents;
    }

    public int getCoinsNum() {
        return coinsNum;
    }

    public void setCoinsNum(int coinsNum) {
        this.coinsNum = coinsNum;
    }


    //singleton
    private UserData(Context context) {

        continents = new Continents[5];

        SharedPreferences sharedPref = context.getSharedPreferences(
                context.getString(R.string.preference_file_key), Context.MODE_PRIVATE);

        setCoinsNum(sharedPref.getInt(context.getString(R.string.preference_coins_num), 25));

        boolean southAmericaIsLocked = sharedPref.getBoolean(context.getString(R.string.preference_south_america_islocked), false);
        int southAmericaCurrentFlag = sharedPref.getInt(context.getString(R.string.preference_south_america_currentflag), 0);

        boolean northAmericaIsLocked = sharedPref.getBoolean(context.getString(R.string.preference_north_america_islocked), true);
        int northAmericaCurrentFlag = sharedPref.getInt(context.getString(R.string.preference_north_america_currentflag), 0);

        boolean europeIsLocked = sharedPref.getBoolean(context.getString(R.string.preference_europe_islocked), true);
        int europeCurrentFlag = sharedPref.getInt(context.getString(R.string.preference_europe_currentflag), 0);

        boolean asiaIsLocked = sharedPref.getBoolean(context.getString(R.string.preference_asia_islocked), true);
        int asiaCurrentFlag = sharedPref.getInt(context.getString(R.string.preference_asia_currentflag), 0);

        boolean africaIsLocked = sharedPref.getBoolean(context.getString(R.string.preference_africa_islocked), true);
        int africaCurrentFlag = sharedPref.getInt(context.getString(R.string.preference_africa_currentflag), 0);

        SouthAmerica southAmerica = new SouthAmerica(southAmericaIsLocked, southAmericaCurrentFlag);
        NorthAmerica northAmerica = new NorthAmerica(northAmericaIsLocked, northAmericaCurrentFlag);
        Europe europe = new Europe(europeIsLocked, europeCurrentFlag);
        Asia asia = new Asia(asiaIsLocked, asiaCurrentFlag);
        Africa africa = new Africa(africaIsLocked, africaCurrentFlag);

        continents[0] = southAmerica;
        continents[1] = northAmerica;
        continents[2] = europe;
        continents[3] = asia;
        continents[4] = africa;
    }

    private static UserData single_instance = null;
    public static UserData getInstance(Context context) {
        if (single_instance == null)
            single_instance = new UserData(context);

        return single_instance;
    }

}

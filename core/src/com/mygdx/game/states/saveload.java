package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;
import com.mygdx.game.Screens.trialMapScreen;

import java.io.Serializable;

public class saveload implements Serializable {
    static int noofsaves=1;
    private Preferences preferences= Gdx.app.getPreferences("saveload");


    public void setstate(trialMapScreen screen){
        preferences.putString("save "+noofsaves,new Json().toJson(screen.getplayer()));
        preferences.flush();
    }
    public Double getstate(int savenumber){
        final JsonValue jsonval= new JsonReader().parse(preferences.getString("save "+savenumber));
        return new Json().fromJson(Double.class, String.valueOf(jsonval));

    }

}
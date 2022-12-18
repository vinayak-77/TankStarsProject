package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;
import com.mygdx.game.Sprites.Tanktry;

import java.io.Serializable;

public class saveload implements Serializable {
    public static int numberofsaves = 0;

    public static Preferences preferences= Gdx.app.getPreferences("saveload");


    public static void setstate(Tanktry player, int num){
        preferences.putString("save "+ numberofsaves +"player"+num+" health",new Json().toJson(player.getHealth()));
        preferences.putString("save "+ numberofsaves +"player"+num+" positionX",new Json().toJson(player.getX()));
        preferences.putString("save "+ numberofsaves +"player"+num+" positionY",new Json().toJson(player.getY()));
        preferences.putString("save "+ numberofsaves +"player"+num+" Angle",new Json().toJson(player.getAngle()));
        preferences.putString("save "+ numberofsaves +"player"+num+" Texture",new Json().toJson(player.getT()));


//        preferences.putString("save "+numberofsaves+"player2 health"+numberofsaves,new Json().toJson(player.getHealth()));
//        preferences.putString("save "+numberofsaves+"player2 positionX"+numberofsaves,new Json().toJson(player.getX()));
//        preferences.putString("save "+numberofsaves+"player2 positionY"+numberofsaves,new Json().toJson(player.getY()));
//        preferences.putString("save "+numberofsaves+"player2 Angle"+numberofsaves,new Json().toJson(player.getAngle()));
        preferences.flush();
    }
    public Double gethealth(int savenumber,int num){
        final JsonValue jsonval= new JsonReader().parse(preferences.getString("save "+ savenumber +"player"+num+" health"));
        return new Json().fromJson(Double.class, String.valueOf(jsonval));

    }
    public String getTexture(int savenumber,int num){
        final JsonValue jsonval= new JsonReader().parse(preferences.getString("save "+ savenumber +"player"+num+" Texture"));
        return new Json().fromJson(String.class, String.valueOf(jsonval));

    }
    public Float getposX(int savenumber,int num){
        final JsonValue jsonval= new JsonReader().parse(preferences.getString("save "+ savenumber +"player"+num+" positionX"));
        return new Json().fromJson(Float.class, String.valueOf(jsonval));

    }
    public Float getposY(int savenumber,int num){
        final JsonValue jsonval= new JsonReader().parse(preferences.getString("save "+ savenumber +"player"+num+" positionY"));
        return new Json().fromJson(Float.class, String.valueOf(jsonval));

    }
    public Double getAngle(int savenumber,int num){
        final JsonValue jsonval= new JsonReader().parse(preferences.getString("save "+ savenumber +"player"+num+" Angle"));
        return new Json().fromJson(Double.class, String.valueOf(jsonval));

    }

}

package com.mygdx.game.Scenes;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.Screens.mainMenu;

public class hud {
    public Stage stage;
    public Viewport viewport;
    private int health;
    public Label p1;
    public Label p2;
    public Label title;
    public PolygonSprite polygonSprite;
    private Texture moveleft;
    private Texture moveright;
    private Texture shoot;
    private ImageButton exitb,resumeb,saveb;
    ShapeRenderer shapeRenderer;

    public hud(SpriteBatch spriteBatch){
        viewport = new FitViewport(800,480,new OrthographicCamera());
        stage = new Stage(viewport,spriteBatch);
        shapeRenderer=new ShapeRenderer();
        Table table=new Table();
        table.top();
        table.setFillParent(true);
        moveleft = new Texture("moveleft.png");
        moveright = new Texture("moveright.png");
        shoot = new Texture("target.png");

        table.add(new Image(new Texture("healthbarog.png"))).width(195).height(50).padTop(15).padRight(50);
        table.add(new Image(new Texture("healthbarog.png"))).width(195).height(50).padTop(15);



        stage.addActor(table);


    }
    public void showHealth(){

        float health = 172;
//        PolygonSpriteBatch polygonSpriteBatch=new PolygonSpriteBatch();
//        polygonSpriteBatch.begin();
//        Pixmap pixmap = new Pixmap(1,1,Pixmap.Format.RGB565);
//        pixmap.setColor(Color.GREEN);
//        pixmap.fill();
//        PolygonRegion polygonRegion = new PolygonRegion(new TextureRegion(new Texture(pixmap)),new float[]{290,580,290,540,540,580,540,540},new short[]{0,1,2,0,1,3});
//        polygonSprite=new PolygonSprite(polygonRegion);
//
//        polygonSprite.draw(polygonSpriteBatch);
//
//        polygonSpriteBatch.end();



        shapeRenderer.setProjectionMatrix(stage.getCamera().combined);

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.GREEN);
        shapeRenderer.rect(437, 427, health, 27);

        shapeRenderer.rect(192, 427, health, 27);
        shapeRenderer.end();

    }

}

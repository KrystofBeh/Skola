package io.github.some_example_name.managers;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import io.github.some_example_name.Parts.Ptacek;
import io.github.some_example_name.Parts.Tube;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class SpriteManager {
    public static SpriteManager instance; // Proměnná pro instanci singletonu /** * Get method for singleton of SpriteManager * @return SpriteManager instance */
    private ShapeRenderer shapeRenderer;
    private static SpriteManager getInstance() {
        if (instance == null) {
            instance = new SpriteManager();
        }
        return instance;
    }

    public ArrayList<Tube> trubky = new ArrayList<>();
    public ArrayList<Tube> trubkyRemove = new ArrayList<>();

    public SpriteBatch batch;
    public HashMap<String, Texture> textures;
    private int pocetTrubek = 1000 ;
    private final Ptacek ptak;


    public SpriteManager() {
        batch = new SpriteBatch();
        shapeRenderer = new ShapeRenderer();
        textures = new HashMap<>();
        setTextures();
        ptak = new Ptacek(textures.get("Duck"));
    }

    private void setTextures() {
        textures.put("Tube", new Texture("Green_pipe.png"));
        textures.put("Duck", new Texture("duck.png"));
    }

    public void addTrubice(){
        trubky.add(new Tube(textures.get("Tube")));
    }

    public void checkTrubice(Tube trubice){
        Sprite s = trubice.getSprite();
        Sprite p = ptak.getSprite();

        float x = s.getX();
        float y = s.getY();
        float w = s.getWidth();
        float h = s.getHeight();

        Rectangle spodni = new Rectangle(x, y - 150 , w, h / 2f);
        Rectangle horni = new Rectangle(x, y + h / 2f + 150, w, h / 2f);
        Rectangle ptakRcl = p.getBoundingRectangle();
        ptakRcl.height /= 2f;
        ptakRcl.width /= 2f;
        ptakRcl.x = ptak.getSprite().getX() + 20;
        ptakRcl.y = ptak.getSprite().getY();


        /* ------ debug - vykreslení hitboxů -----
        batch.end();
        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
        shapeRenderer.rect(spodni.x, spodni.y, spodni.width, spodni.height);
        shapeRenderer.rect(horni.x, horni.y, horni.width, horni.height);
        shapeRenderer.rect(ptakRcl.x, ptakRcl.y, ptakRcl.width, ptakRcl.height);
        shapeRenderer.end();
        batch.begin();
         */

        if (ptakRcl.overlaps(spodni) || ptakRcl.overlaps(horni)) {
            System.out.println("Konec");
            System.exit(0);
        }

    }

    public void update() {

        ptak.update();

        for (Tube x : trubky){
            if (x.getSprite().getX() < 0 - x.getSprite().getWidth()){
                trubkyRemove.add(x);
                continue;
            }

            x.update(-2.5f);
            draw(x.getSprite());
            checkTrubice(x);
        }
        trubky.removeAll(trubkyRemove);

        pocetTrubek++;
        if (pocetTrubek > 300){
            pocetTrubek = 0;
            addTrubice();
        }

        draw(ptak.getSprite());
    }

    public void draw(Sprite sprite) {
        sprite.draw(batch);
    }


    public void begin() {
        batch.begin();
    }

    public void end() {
        batch.end();
    }

    public void dispose() {
        batch.dispose();
    }
}

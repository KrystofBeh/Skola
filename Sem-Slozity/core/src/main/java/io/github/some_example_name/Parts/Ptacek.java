
package io.github.some_example_name.Parts;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Ptacek {

    private final Sprite sprite;
    private float speed;

    public Ptacek(Texture texture) {
        this.sprite = new Sprite(texture);

        sprite.setSize(70f, 50f); //sprite setup
        sprite.setOriginCenter();
        sprite.setPosition(200f, 640f);
        sprite.setRotation(0f);

        this.speed = 0f;
    }

    public void update(){

        if(getY() + sprite.getHeight() > 960) {
            setY(960 - sprite.getHeight());
            speed = 0f;
        }

        if(sprite.getRotation()>-40f){
            setRotation(getRotation() - 0.6f);
        }

        speed += Gdx.graphics.getDeltaTime() * 5f;
        setY(getY() - speed);

        if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) {
            speed = -5f;
            setRotation( 40f );
        }

        if (sprite.getY() < 0 - sprite.getHeight()) {
            System.exit(0);
        }
    }

    private float getRotation() {
        return sprite.getRotation();
    } //makes code cleaner

    private void setRotation(float rotation) {
        sprite.setRotation(rotation);
    }

    private void setY(float y){
        sprite.setY(y);
    }


    public float getY() {
        return sprite.getY();
    } //actual getters

    public Sprite getSprite() {
        return sprite;
    }
}

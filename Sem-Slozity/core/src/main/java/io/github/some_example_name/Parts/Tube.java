
package io.github.some_example_name.Parts;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Tube {

    private final Sprite sprite;

    public Tube(Texture texture) {

        this.sprite = new Sprite(texture);

        sprite.setSize(150, 960*2);

        float x = 1280;
        float y = (int)(Math.random() * (-300 - (-700) + 1)) + (-700);
        sprite.setPosition(x, y);
    }

    public void update(float speed){
        sprite.setX(sprite.getX() + speed);
    }

    public Sprite getSprite() {
        return sprite;
    }
}


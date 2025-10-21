package io.github.some_example_name;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    ShapeRenderer sr;
    private BitmapFont font;

    float p1x, p1y, p2x, p2y;
    float bx, by;
    float ba;

    boolean isLeft, isRight;

    int[] score = {0, 0};

    @Override
    public void create() {
        batch = new SpriteBatch();
        sr = new ShapeRenderer();

        font = new BitmapFont();
        font.setColor(Color.WHITE);
        font.getData().setScale(2f);

        p1x = 10f;
        p1y = 10f;
        p2x = Gdx.graphics.getWidth() - 30f;
        p2y = 10f;
        bx = Gdx.graphics.getWidth() / 2f;
        by = Gdx.graphics.getHeight() / 2f;
        ba = (float) Math.random() * 2f;

        isLeft = true;
        isRight = true;
    }

    @Override
    public void render() {

        if (Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE) ) Gdx.app.exit();

        if (Gdx.input.isKeyPressed(Input.Keys.W) && p1y < Gdx.graphics.getHeight() - 210) p1y += 8;
        if (Gdx.input.isKeyPressed(Input.Keys.S) && p1y > 10) p1y -= 8;
        if (Gdx.input.isKeyPressed(Input.Keys.UP) && p2y < Gdx.graphics.getHeight() - 210) p2y += 8;
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN) && p2y > 10) p2y -= 8;

        if (bx - 20 < p1x + 20 && bx > 0 && by > p1y && by < p1y + 200 && isLeft) {
            ba = (float) Math.PI - ba;
            isLeft = false;
            isRight = true;
        }

        if (bx + 20 > p2x && bx < Gdx.graphics.getWidth() && by > p2y && by < p2y + 200 && isRight) {
            ba = (float) Math.PI - ba;
            isRight = false;
            isLeft = true;
        }

        if (by >= Gdx.graphics.getHeight() - 10 || by <= 10) ba = -ba;

        if (bx < 0) {
            score[1] += 1;
            vypisScore(score);
            bx = Gdx.graphics.getWidth() / 2;
            by = Gdx.graphics.getHeight() / 2;
        }
        if (bx > Gdx.graphics.getWidth()) {
            score[0] +=1;
            vypisScore(score);
            bx = Gdx.graphics.getWidth() / 2;
            by = Gdx.graphics.getHeight() / 2;
        }

        bx += (float) Math.cos(ba) * 5;
        by += (float) Math.sin(ba) * 5;

        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);

        sr.begin(ShapeRenderer.ShapeType.Filled);
        sr.setColor(1,1,1,1);
        sr.rect(p1x, p1y, 20, 200);
        sr.rect(p2x, p2y, 20, 200);
        sr.circle(bx, by, 20f);
        sr.end();

        batch.begin();
        String scoreText = score[0] + " : " + score[1];
        font.draw(batch, scoreText, (Gdx.graphics.getWidth() - (new GlyphLayout(font, scoreText).width)) / 2f, Gdx.graphics.getHeight() - 20);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        sr.dispose();
        font.dispose();
    }

    public static void vypisScore(int[] score){
        System.out.println("Score: " + score[0] + " : " + score[1]);
    }

}

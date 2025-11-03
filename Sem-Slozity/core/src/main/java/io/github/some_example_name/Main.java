package io.github.some_example_name;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.utils.ScreenUtils;
import io.github.some_example_name.managers.SpriteManager;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    SpriteManager sm;

    @Override
    public void create() {
        sm = new SpriteManager();
    }

    @Override
    public void render() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        sm.begin();
        sm.update();
        sm.end();
    }

    @Override
    public void dispose() {
        sm.dispose();
    }
}

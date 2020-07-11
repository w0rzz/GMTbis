package panic.game;

import actors.Plateform;
import actors.Player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;


public class World extends Stage {

    SpriteBatch batch;

    Player player;

    public static World mainWorld;

//    VisAssetManager manager;

    public World() {
        this.getViewport().getCamera().viewportHeight = this.getViewport().getScreenHeight();
        this.getViewport().getCamera().viewportWidth = this.getViewport().getScreenWidth();


        batch = new SpriteBatch();
        player = new Player(5, 5, 100, 100);
    }

    @Override
    public void act() {
        super.act();
    }

    @Override
    public void draw() {
        super.draw();

        player.update();

        batch.begin();
        batch.draw(player.texture, player.x, player.y, player.width, player.height);
        batch.end();
    }
}

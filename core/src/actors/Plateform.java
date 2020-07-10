package actors;

import com.badlogic.gdx.scenes.scene2d.Actor;
import panic.game.TextureLoader;

public class Plateform extends SuperActor {
    public Plateform(float x, float y){
        this.sprite = new AnimatedSprite(TextureLoader.BigGrass, x, y, -90, TextureLoader.BigGrass.getWidth(), TextureLoader.BigGrass.getHeight());
        this.setX(x);
        this.setY(y);
        this.setRotation(90);
    }

}

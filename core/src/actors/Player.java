package actors;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;

import panic.game.TextureLoader;

public class Player extends SuperActor{

    public float x, y, width, height;

    public static Texture texture;

    private float moveAmount = 5;

    public Player(float x, float y, float width, float height){

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        texture = TextureLoader.Player;
        this.sprite = new AnimatedSprite(texture, x, y, -90, texture.getWidth(), texture.getHeight());
        this.setX(x);
        this.setY(y);
        this.setRotation(90);
    }

    public void update(){

        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            x -= moveAmount;
        }

        if (Gdx.input.isKeyPressed(Input.Keys.D)) {
            x += moveAmount;
        }

        if (Gdx.input.isKeyPressed(Input.Keys.W)) {
            y += moveAmount;
        }

        if (Gdx.input.isKeyPressed(Input.Keys.S)) {
            y -= moveAmount;
        }
    }
}

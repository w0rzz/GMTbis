0package panic.game;

import actors.Plateform;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class TextureLoader {
    public static Texture BigGrass;
    public static Texture Player;

    public static void loadTexture() {
        loadTextureEnvironment();
        loadTextureActors();
    }

    private static void loadTextureActors(){
        Player = new Texture("core/assets/Triston.png");
    }


    private static void loadTextureEnvironment() {
        BigGrass = new Texture("core/assets/BIG_grass.png");
    }
}

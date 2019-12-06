package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class TileImp implements Visual {

    private Image tileImage;

    public TileImp(String key) {
        this.tileImage= new Image(key + "Block.png");
    }

    @Override
    public void put(GridPane gp, int x, int y) {
        ImageView tileView = new ImageView(tileImage);
        tileView.setFitHeight(50);
        tileView.setFitWidth(50);
        gp.add(tileView, x, y);
    }
}

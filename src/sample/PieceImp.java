package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class PieceImp implements Visual{

    private Image PieceImage;

    public PieceImp(String key, String piece) {
        this.PieceImage = new Image(key + piece + ".png");
    }

    @Override
    public void put(GridPane gp, int x, int y) {
        ImageView pieceView = new ImageView(PieceImage);
        pieceView.setFitHeight(50);
        pieceView.setFitWidth(50);
        gp.add(pieceView, x, y);
    }
}

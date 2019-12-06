package sample;

import javafx.scene.layout.GridPane;

public class PieceClient {

    private Visual _piece;

    public PieceClient(String key, String piece) {
        _piece = PieceFactory.getPiece(key, piece);
    }

    public void put(GridPane gp, int x, int y) {
        _piece.put(gp, x, y);
    }
}

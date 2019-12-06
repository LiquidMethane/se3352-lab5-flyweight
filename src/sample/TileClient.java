package sample;

import javafx.scene.layout.GridPane;

public class TileClient {

    private Visual _tile;

    public TileClient(String key) {
        _tile = TileFactory.getTile(key);
    }

    public void put(GridPane gp, int x, int y) {
        _tile.put(gp, x, y);
    }
}

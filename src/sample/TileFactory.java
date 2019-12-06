package sample;

import java.util.HashMap;

public class TileFactory {

    private static HashMap<String, Visual> _tiles = new HashMap<>();


    public static Visual getTile(String key) {
        _tiles.computeIfAbsent(key, k -> new TileImp(key));
        return _tiles.get(key);
    }
}

package sample;

import java.util.HashMap;

public class PieceFactory {

    private static HashMap<String, Visual> _pieces = new HashMap<>();


    public static Visual getPiece(String key, String piece) {
        _pieces.computeIfAbsent(key + piece, k -> new PieceImp(key, piece));
        return _pieces.get(key + piece);
    }
}

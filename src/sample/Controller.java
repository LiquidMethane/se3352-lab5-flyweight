package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML private GridPane board;

    private TileClient blackTile;
    private TileClient whiteTile;


    private PieceClient blackBishop;
    private PieceClient blackKing;
    private PieceClient blackKnight;
    private PieceClient blackPawn;
    private PieceClient blackQueen;
    private PieceClient blackRook;

    private PieceClient whiteBishop;
    private PieceClient whiteKing;
    private PieceClient whiteKnight;
    private PieceClient whitePawn;
    private PieceClient whiteQueen;
    private PieceClient whiteRook;



    @FXML
    private void drawBoard() {
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                if (i % 2 == j % 2)
                    whiteTile.put(board, i, j);
                else
                    blackTile.put(board, i, j);
    }

    @FXML
    private void addWhitePieces() {
        whiteRook.put(board, 0, 7);
        whiteRook.put(board, 7, 7);
        whiteKnight.put(board, 1, 7);
        whiteKnight.put(board, 6, 7);
        whiteBishop.put(board, 2, 7);
        whiteBishop.put(board, 5, 7);
        whiteKing.put(board, 4, 7);
        whiteQueen.put(board, 3, 7);

        for (int i = 0; i < 8; i++)
            whitePawn.put(board, i, 6);
    }

    @FXML
    private void addBlackPieces() {
        blackRook.put(board, 0, 0);
        blackRook.put(board, 7, 0);
        blackKnight.put(board, 1, 0);
        blackKnight.put(board, 6, 0);
        blackBishop.put(board, 2, 0);
        blackBishop.put(board, 5, 0);
        blackKing.put(board, 4, 0);
        blackQueen.put(board, 3, 0);

        for (int i = 0; i < 8; i++)
            blackPawn.put(board, i, 1);
    }

    @FXML
    private void reset() {
        board.getChildren().clear();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        blackTile = new TileClient("Black");
        whiteTile = new TileClient("White");

        blackBishop = new PieceClient("Black", "Bishop");
        blackKing = new PieceClient("Black", "King");
        blackKnight = new PieceClient("Black", "Knight");
        blackPawn = new PieceClient("Black", "Pawn");
        blackQueen = new PieceClient("Black", "Queen");
        blackRook = new PieceClient("Black", "Rook");

        whiteBishop = new PieceClient("White", "Bishop");
        whiteKing = new PieceClient("White", "King");
        whiteKnight = new PieceClient("White", "Knight");
        whitePawn = new PieceClient("White", "Pawn");
        whiteQueen = new PieceClient("White", "Queen");
        whiteRook = new PieceClient("White", "Rook");
    }
}

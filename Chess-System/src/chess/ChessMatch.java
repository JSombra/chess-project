package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch(){
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++){
            for (int j = 0; j < board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }
    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }
    private void initialSetup() {
        placeNewPiece('d', 5, new King(board, Color.WHITE));
        placeNewPiece('d', 4, new King(board, Color.BLACK));
        placeNewPiece('a', 8, new Rook(board, Color.WHITE));
        placeNewPiece('a', 7, new Rook(board, Color.WHITE));
        placeNewPiece('a', 6, new Rook(board, Color.WHITE));
        placeNewPiece('a', 5, new Rook(board, Color.WHITE));
        placeNewPiece('a', 4, new Rook(board, Color.WHITE));
        placeNewPiece('a', 3, new Rook(board, Color.WHITE));
        placeNewPiece('a', 2, new Rook(board, Color.WHITE));
        placeNewPiece('a', 1, new Rook(board, Color.WHITE));
        placeNewPiece('h', 8, new Rook(board, Color.BLACK));
        placeNewPiece('h', 7, new Rook(board, Color.BLACK));
        placeNewPiece('h', 6, new Rook(board, Color.BLACK));
        placeNewPiece('h', 5, new Rook(board, Color.BLACK));
        placeNewPiece('h', 4, new Rook(board, Color.BLACK));
        placeNewPiece('h', 3, new Rook(board, Color.BLACK));
        placeNewPiece('h', 2, new Rook(board, Color.BLACK));
        placeNewPiece('h', 1, new Rook(board, Color.BLACK));

    }
}

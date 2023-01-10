public class Pawn extends ChessPiece {

    private boolean promoted, enPassant, canCapture;

    public Pawn(String colour, int row, int col, int value, Boolean isCaptured, Boolean promoted,
            Boolean enPassant, Boolean canMove) {
        super(colour, row, col, value, isCaptured, canMove);
        this.promoted = false;
        this.enPassant = false;
        this.canCapture = false;
    }

    public void pawnMove(int y){

        int newRow = this.getRow() + 1;
        

    }




}

public class ChessPiece {
    private String colour;
    private int row;
    private int col;
    private int value;
    private boolean isCaptured;
    private boolean canMove;

    public ChessPiece(String colour, int row, int col, int value,  Boolean isCaptured, Boolean canMove) {
        this.colour = colour;
        this.row = row;
        this.col = col;
        this.value = value;
        this.isCaptured = false;
        this.canMove = canMove;
    }

    
    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    public int getValue(){
        return this.value;
    }

    public String getColour(){
        return this.colour;
    }



    public boolean capStatus() {
        return this.isCaptured;
    }

}
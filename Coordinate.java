public class Coordinate{

    private int coordX, coordY;
    private String pieceName;


public Coordinate (int coordX, int coordY, String pieceName){
    
this.coordX = coordX;
this.coordY = coordY;

this.pieceName = pieceName;
}

public int getX(){
    return this.coordX;
}

public int getY(){
    return this.coordY;
}


public void move(int rowsMoved, int colsMoved){

    this.coordX = this.coordX + rowsMoved;
    this.coordY = this.coordY+ colsMoved;

}


public String toString(){
    return "(" + this.coordX + "," + this.coordY + "," + ")";
}





}
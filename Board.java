import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/*This Class controls each  */

public class Board {

  private int bx, by;
  private int pieceNum;

  private ChessPiece[] boardPieces;

  Font pieceFont = new Font("", Font.PLAIN, 80);

  public Board(int bx, int by, int pieceNum, ChessPiece[] whitePawns) {
    this.bx = bx;
    this.by = by;

    this.boardPieces = new ChessPiece[16];
    this.pieceNum = 0;
  }

  public void drawBoard(Graphics g) {
    boolean drawRed = false;

    for (int h = 0; h < by; h = h + 80) {
      // draw the line of squares
      for (int w = 0; w < bx; w = w + 80) {
        // determine the colour
        if (drawRed) {
          // switch the colour for next time
          g.setColor(Color.RED);
          // enters into the array that no piece is on that specific space
          drawRed = false;
        } else {
          g.setColor(Color.WHITE);
          // switch the colour for next time
          drawRed = true;
        }

        // draw the square
        g.fillRect(h, w, 80, 80);
      }
      // a single line is finished
      // flip the starting colour
      drawRed = !drawRed;
    }
  }

  public void boardSetup(Graphics g) {
    g.setColor(Color.BLACK);
    g.setFont(pieceFont);

    g.drawString("♜", 0, 70);
    g.drawString("♞", 80, 70);
    g.drawString("♝", 160, 70);
    g.drawString("♛", 240, 70);
    g.drawString("♚", 320, 70);
    g.drawString("♝", 400, 70);
    g.drawString("♞", 480, 70);
    g.drawString("♜", 560, 70);

    g.drawString("♟", 0, 150);
    g.drawString("♟", 80, 150);
    g.drawString("♟", 160, 150);
    g.drawString("♟", 240, 150);
    g.drawString("♟", 320, 150);
    g.drawString("♟", 400, 150);
    g.drawString("♟", 480, 150);
    g.drawString("♟", 560, 150);

    g.drawString("♖", 0, 630);
    g.drawString("♘", 80, 630);
    g.drawString("♗", 160, 630);
    g.drawString("♕", 240, 630);
    g.drawString("♔", 320, 630);
    g.drawString("♗", 400, 630);
    g.drawString("♘", 480, 630);
    g.drawString("♖", 560, 630);

    g.drawString("♙", 0, 550);
    g.drawString("♙", 80, 550);
    g.drawString("♙", 160, 550);
    g.drawString("♙", 240, 550);
    g.drawString("♙", 320, 550);
    g.drawString("♙", 400, 550);
    g.drawString("♙", 480, 550);
    g.drawString("♙", 560, 550);
  }

  public void addPawn(String colour, int x, int y, Graphics g) {
    g.setColor(Color.BLACK);
    g.setFont(pieceFont);

    Pawn p = new Pawn(colour, x, y, 1, false, false, false, false);

    boardPieces[pieceNum] = p;

    if (colour == "white") {
      g.drawString("♙", (x * 80) - 80, (y * 80) + 70);
    } else if (colour == "black") {
      g.drawString("♟", (x * 80) - 80, (y * 80) + 70);
    }


  }

  public void addRook(String colour, int x, int y, Graphics g) {
    g.setColor(Color.BLACK);
    g.setFont(pieceFont);

    Rook r = new Rook(colour, x, y, 5, false, false);

    boardPieces[pieceNum] = r;

    if (colour == "white") {
      g.drawString("♖", (x * 80) - 80, (y*80) - 90);
    } else if (colour == "black"){
      g.drawString("♜", (x * 80) - 80, (y*80) - 90);
    }
    
  }

  public void addBishop(String colour, int x, int y, Graphics g){
    g.setColor(Color.BLACK);
    g.setFont(pieceFont);

    Bishop b = new Bishop(colour, x, y, 3, false, false);

    boardPieces[pieceNum] = b;


  }

}

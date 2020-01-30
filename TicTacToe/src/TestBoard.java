import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBoard {

    Board b;

    @BeforeEach
    public void setup() {
        b = new Board();
    }

    @Test
    public void testInitializeBoard() {
        b.initializeBoard();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                assertEquals("/", b.getMove(i, j));
            }
        }
    }

    @Test
    public void testIsBoardFull() {
        b.fillBoard();
        assertTrue(b.isBoardFull());
    }

    @Test
    public void testCheckRows() {
        b.initializeBoard();
        b.setMoveO(0,0);
        b.setMoveO(0,1);
        b.setMoveO(0,2);
        assertTrue(b.checkRows());
    }

    @Test
    public void testCheckColumns(){
        b.initializeBoard();
        b.setMoveX(0, 0);
        b.setMoveX(1, 0);
        b.setMoveX(2, 0);
        assertTrue(b.checkColumns());
    }

    @Test
    public void testCheckDiagonal(){
        b.initializeBoard();
        b.setMoveO(0, 0);
        b.setMoveO(1, 1);
        b.setMoveO(2, 2);
        assertTrue(b.checkDiagonals());
    }

    @Test
    public void testSetMoveX(){
        b.setMoveX(1,2);
        assertEquals("x", b.getMove(1, 2));
    }

    @Test
    public void testSetMoveO(){
        b.setMoveO(2, 0);
        assertEquals("o", b.getMove(2, 0));
    }

    @Test
    public void testPrintBoard(){
        b.initializeBoard();
        b.setMoveX(1, 2);
        b.setMoveO(2, 0);
        b.printBoard();
    }

    @Test
    public void testCheckWin(){
        b.initializeBoard();
        b.setMoveX(0,0);
        b.setMoveX(0,1);
        b.setMoveO(1, 1);
        b.setMoveX(0,2);
        assertTrue(b.checkWin());
    }
}

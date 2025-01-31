package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
     * BoardTest Class.
*/
public class BoardTest {
    /**
     * testBoard Fucntion.
    */
    @Test
    void testBoard() {
        Square s1 = new BasicSquare();
        Square[][] grid = new Square[1][1];
        grid[0][0] = s1;
        Board board = new Board(grid);
        assertThat(board.invariant()).isTrue();
    }

    /**
     * testBoardOneNullSquare Fucntion.
    */
    @Test
    void testBoardOneNullSquare() {
        Square s1 = new BasicSquare();
        Square[][] grid = new Square[1][1];
        grid[0][0] = s1;
        Board board = new Board(grid);
        assertThat(board.squareAt(0, 0)).isEqualTo(grid[0][0]);
    }
}

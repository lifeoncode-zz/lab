package io.octavia;

public class Game {
    public static void main(String[] args) {
        Cell cell = new Cell(true, 0, 0);
        Grid grid = new Grid();
        Turtle turtle = new Turtle();
        drawBoundaries(turtle, grid, cell);
    }

    static void drawBoundaries(Turtle turtle, Grid grid, Cell cell) {
        turtle.up();
        turtle.goTo(grid.getMinX(), grid.getMinY());
        turtle.down();

        for (int i = 0; i < 4; i++) {
            turtle.forward(500);
            turtle.left(90);
        }

        for (int i = 0; i < 4; i++) {
            turtle.forward(cell.getCellWidth());
            turtle.left(90);
            turtle.forward(cell.getCellHeight());
        }

    }
}

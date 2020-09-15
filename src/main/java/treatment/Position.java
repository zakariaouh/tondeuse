package treatment;

import java.util.Objects;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void goUp() {
        this.y = y + 1;
    }

    public void goRight() {
        this.x = x + 1;
    }

    public void goLift() {
        this.x = x - 1;
    }

    public void goDown() {
        this.y = y - 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x &&
                y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return y;
    }
}

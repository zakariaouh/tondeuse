package treatment;


import com.sun.deploy.util.StringUtils;

import java.util.Objects;

public class Mower {

    public static final char GAUCHE = 'G';
    private static final char DROIT = 'D';
    private final Lawn lawn;
    private Position position;
    private Direction direction;

    public Mower(Lawn lawn, Position position, Direction direction) {

        this.lawn = lawn;
        this.position = position;
        this.direction = direction;
    }


    public void changeDirection(String orders) {
        orders
                .chars()
                .mapToObj(singleOrder -> (char) singleOrder)
                .forEach(this::moveToDirection);

    }

    public void moveForward(String orders) {

        if (Direction.NORTH.equals(this.direction)) {
            for (int i = 0; i < orders.length(); i++) {
                position.goUp();
            }

        }
        if (Direction.EAST.equals(this.direction)) {
            for (int i = 0; i < orders.length(); i++) {
                position.goRight();
            }

        }
    }


    public void moveToDirection(char direction) {
        if (GAUCHE == direction) {
            this.direction = this.direction.leftDirection();
        }
        if (DROIT == direction) {
            this.direction = this.direction.rightDirection();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mower mower = (Mower) o;
        return lawn.equals(mower.lawn) &&
                position.equals(mower.position) &&
                direction == mower.direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lawn, position, direction);
    }

    @Override
    public String toString() {
        return "Mower{" +
                "lawn=" + lawn +
                ", position=" + position +
                ", direction=" + direction +
                '}';
    }
}

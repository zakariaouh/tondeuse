package treatment;


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
            int numberOfUpPossibleMovements = numberOfUpPossibleMovements(orders);
            for (int i = 0; i < numberOfUpPossibleMovements; i++) {
                position.goUp();
            }

        }
        if (Direction.EAST.equals(this.direction)) {
            int numberOfRightPossibleMovements = numberOfRightPossibleMovements(orders);
            for (int i = 0; i < numberOfRightPossibleMovements; i++) {
                position.goRight();
            }

        }
        if (Direction.WEST.equals(this.direction)) {
            int numberOfLeftPossibleMovements = numberOfLeftPossibleMovements(orders);
            for (int i = 0; i < numberOfLeftPossibleMovements; i++) {
                position.goLift();
            }

        }
        if (Direction.SOUTH.equals(this.direction)) {
            int numberOfLeftPossibleMovements = numberOfDownPossibleMovements(orders);
            for (int i = 0; i < numberOfLeftPossibleMovements; i++) {
                position.goDown();
            }

        }
    }



    private int numberOfUpPossibleMovements(String orders) {
        int max = orders.length();
        if (orders.length() > this.lawn.getLength()) {
            max = this.lawn.getLength();
        }
        return max;
    }

    private int numberOfRightPossibleMovements(String orders) {
        int max = orders.length();
        if (orders.length() > this.lawn.getLength()) {
            max = this.lawn.getWidth();
        }
        return max;
    }

    private int numberOfLeftPossibleMovements(String orders) {
        int max = this.position.getX();

        if (orders.length() < this.position.getX()) {
            max = orders.length();
        }
        return max;
    }
    private int numberOfDownPossibleMovements(String orders) {
        int max = this.position.getY();

        if (orders.length() < this.position.getY()) {
            max = orders.length();
        }
        return max;
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

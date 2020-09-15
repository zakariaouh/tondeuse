package treatment;


import java.util.Objects;

public class Mower {

    public static final char GAUCHE = 'G';
    private static final char DROITE = 'D';
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
    public void moveToDirection(char direction) {
        if (GAUCHE == direction) {
            this.direction = this.direction.left();
        }
        if (DROITE == direction) {
            this.direction = this.direction.right();
        }
    }
    public void moveForward(String orders) {

        if (Direction.NORTH.equals(this.direction)) {
            goNorth(orders);

        }
        if (Direction.EAST.equals(this.direction)) {
            goEast(orders);

        }
        if (Direction.WEST.equals(this.direction)) {
            goWest(orders);

        }
        if (Direction.SOUTH.equals(this.direction)) {
            goSouth(orders);
        }

    }

    private void goSouth(String orders) {
        int numberOfLeftPossibleMovements = numberOfDownPossibleMovements(orders);
        for (int i = 0; i < numberOfLeftPossibleMovements; i++) {
            position.goDown();
        }
    }

    private void goWest(String orders) {
        int numberOfLeftPossibleMovements = numberOfLeftPossibleMovements(orders);
        for (int i = 0; i < numberOfLeftPossibleMovements; i++) {
            position.goLift();
        }
    }

    private void goEast(String orders) {
        int numberOfRightPossibleMovements = numberOfRightPossibleMovements(orders);
        for (int i = 0; i < numberOfRightPossibleMovements; i++) {
            position.goRight();
        }
    }

    private void goNorth(String orders) {
        int numberOfUpPossibleMovements = numberOfUpPossibleMovements(orders);
        for (int i = 0; i < numberOfUpPossibleMovements; i++) {
            position.goUp();
        }
    }


    private int numberOfUpPossibleMovements(String orders) {
        int possibleMovements = orders.length();
        if (possibleMovements > this.lawn.getLength()) {
            possibleMovements = this.lawn.getLength();
        }
        return possibleMovements;
    }

    private int numberOfRightPossibleMovements(String orders) {
        int possibleMovements = orders.length();
        if (possibleMovements> this.lawn.getLength()) {
            possibleMovements = this.lawn.getWidth();
        }
        return possibleMovements;
    }

    private int numberOfLeftPossibleMovements(String orders) {
        int possibleMovements = this.position.getX();

        if (orders.length() < possibleMovements) {
            possibleMovements = orders.length();
        }
        return possibleMovements;
    }
    private int numberOfDownPossibleMovements(String orders) {
        int max = this.position.getY();

        if (orders.length() < this.position.getY()) {
            max = orders.length();
        }
        return max;
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

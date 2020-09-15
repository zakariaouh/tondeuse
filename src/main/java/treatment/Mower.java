package treatment;


import java.util.Objects;

public class Mower {

    public static final char GAUCHE = 'G';
    private static final char DROITE = 'D';
    private final Lawn lawn;
    private Position position;
    private Orientation orientation;

    public Mower(Lawn lawn, Position position, Orientation orientation) {

        this.lawn = lawn;
        this.position = position;
        this.orientation = orientation;
    }


    public void changeOrientation(String orders) {
        orders
                .chars()
                .mapToObj(singleOrder -> (char) singleOrder)
                .forEach(this::moveToDirection);

    }
    public void moveToDirection(char orientation) {
        if (GAUCHE == orientation) {
            this.orientation = this.orientation.left();
        }
        if (DROITE == orientation) {
            this.orientation = this.orientation.right();
        }
    }
    public void moveForward(String orders) {

        if (Orientation.NORTH.equals(this.orientation)) {
            goNorth(orders);

        }
        if (Orientation.EAST.equals(this.orientation)) {
            goEast(orders);

        }
        if (Orientation.WEST.equals(this.orientation)) {
            goWest(orders);

        }
        if (Orientation.SOUTH.equals(this.orientation)) {
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
                orientation == mower.orientation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lawn, position, orientation);
    }

    @Override
    public String toString() {
        return "Mower{" +
                "lawn=" + lawn +
                ", position=" + position +
                ", orientation=" + orientation +
                '}';
    }
}

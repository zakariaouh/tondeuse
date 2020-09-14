package treatment;


import java.util.Objects;

public class Mower {

    public static final String GAUCHE = "G";
    private final Lawn lawn;
    private Position position;
    private Direction direction;

    public Mower(Lawn lawn, Position position, Direction direction) {

        this.lawn = lawn;
        this.position = position;
        this.direction = direction;
    }

    public void mowItNow(String commande) {
        if (GAUCHE.equals(commande)) {
            if (Direction.NORTH == this.direction) {
                this.direction = Direction.WEST;
            } else if (Direction.WEST == this.direction) {
                this.direction = Direction.SOUTH;
            } else if (Direction.SOUTH == this.direction) {
                this.direction = Direction.EAST;
            }
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

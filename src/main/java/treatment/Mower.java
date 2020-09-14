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

    public void mowItNow(String commande) {
        if (commande.length() == 1) {
            moveToDirection(commande.charAt(0));
        } else if (commande.length() == 2) {
            moveToDirection(commande.charAt(0));
            moveToDirection(commande.charAt(1));
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

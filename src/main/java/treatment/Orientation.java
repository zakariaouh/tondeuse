package treatment;

import java.util.Arrays;

public enum Orientation {

    NORTH("N"), WEST("W"), EAST("E"), SOUTH("S");
    String value;

    Orientation(String value) {
        this.value = value;
    }

    public static Orientation findByValue(String value) {
        return Arrays.stream(values())
                .filter(x -> x.value .equals(value))
                .findFirst()
                .orElse(null);

    }

    Orientation left() {
        if (this == NORTH) {
            return Orientation.WEST;
        }
        if (this == WEST) {
            return Orientation.SOUTH;
        }
        if (this == Orientation.SOUTH) {
            return Orientation.EAST;
        }
        return NORTH;
    }

    public Orientation right() {
        if (this == NORTH) {
            return Orientation.EAST;
        }
        if (this == EAST) {
            return Orientation.SOUTH;
        }
        if (this == Orientation.SOUTH) {
            return Orientation.WEST;
        }
        return NORTH;
    }


}

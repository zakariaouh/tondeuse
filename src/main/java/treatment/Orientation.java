package treatment;

public enum Orientation {

    NORTH, WEST, EAST, SOUTH;

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

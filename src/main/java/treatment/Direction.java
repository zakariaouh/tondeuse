package treatment;

public enum Direction {

    NORTH, WEST, EAST, SOUTH;

    Direction leftDirection() {
        if (this == this.NORTH) {
            return Direction.WEST;
        }
        if (this == this.WEST) {
            return Direction.SOUTH;
        }
        if (this == Direction.SOUTH) {
            return Direction.EAST;
        }
        return this;
    }
}

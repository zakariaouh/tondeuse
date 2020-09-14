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
        return this.NORTH;
    }

    public Direction rightDirection() {
        if (this == this.NORTH) {
            return Direction.EAST;
        }
        if (this == this.EAST) {
            return Direction.SOUTH;
        }
        if (this == Direction.SOUTH) {
            return Direction.WEST;
        }
        return this.NORTH;
    }
}

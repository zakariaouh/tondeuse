package treatment;

public class OrientedPosition {
    private Position position;
    private Orientation orientation;
    public OrientedPosition(Position position, Orientation orientation) {
        this.orientation = orientation;
        this.position = position;
    }
}

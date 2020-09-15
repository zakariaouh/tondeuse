import org.junit.Assert;
import org.junit.Test;
import treatment.Direction;
import treatment.Lawn;
import treatment.Mower;
import treatment.Position;

public class changePosition {

    @Test
    public void moveOnceToNorthShouldIncrementYByOne() {
        Lawn lawn = new Lawn(5, 5);
        Mower m = new Mower(lawn, new Position(0, 0), Direction.NORTH);
        m.moveForward("A");
        Mower expected = new Mower(lawn, new Position(0, 1), Direction.NORTH);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void moveOnceToEastShouldIncrementXByOne() {
        Lawn lawn = new Lawn(5, 5);
        Mower m = new Mower(lawn, new Position(0, 0), Direction.EAST);
        m.moveForward("A");
        Mower expected = new Mower(lawn, new Position(1, 0), Direction.EAST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void moveTwiceToNorthShouldIncrementYByTow() {
        Lawn lawn = new Lawn(5, 5);
        Mower m = new Mower(lawn, new Position(0, 0), Direction.NORTH);
        m.moveForward("AA");
        Mower expected = new Mower(lawn, new Position(0, 2), Direction.NORTH);
        Assert.assertEquals(expected, m);
    }
    @Test
    public void moveTwiceToEastShouldIncrementXByTow() {
        Lawn lawn = new Lawn(5, 5);
        Mower m = new Mower(lawn, new Position(0, 0), Direction.EAST);
        m.moveForward("AA");
        Mower expected = new Mower(lawn, new Position(2, 0), Direction.EAST);
        Assert.assertEquals(expected, m);
    }
}

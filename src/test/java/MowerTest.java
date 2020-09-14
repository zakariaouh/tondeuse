import org.junit.Assert;
import org.junit.Test;
import treatment.Direction;
import treatment.Lawn;
import treatment.Mower;
import treatment.Position;

public class MowerTest {

    @Test
    public void theInitialPositionShouldBeZeroZero() {
        Lawn lawn = new Lawn(5, 5);
        Position initialPosition = new Position(0, 0);
        Mower m = new Mower(lawn, initialPosition, Direction.NORTH);
        m.mowItNow("");
        Mower expected = new Mower(lawn, initialPosition, Direction.NORTH);
        Assert.assertEquals(expected, m);

    }

    @Test
    public void theLiftOfNorthShouldBeWest() {
        Lawn lawn = new Lawn(5, 5);
        Position initialPosition = new Position(0, 0);
        Mower m = new Mower(lawn, initialPosition, Direction.NORTH);
        m.mowItNow("G");
        Mower expected = new Mower(lawn, initialPosition, Direction.WEST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void theLiftOfWestShouldBeSouth() {
        Lawn lawn = new Lawn(5, 5);
        Position initialPosition = new Position(0, 0);
        Mower m = new Mower(lawn, initialPosition, Direction.WEST);
        m.mowItNow("G");
        Mower expected = new Mower(lawn, initialPosition, Direction.SOUTH);
        Assert.assertEquals(expected, m);
    }


    @Test
    public void theLiftOfSouthShouldBeEast() {
        Lawn lawn = new Lawn(5, 5);
        Position initialPosition = new Position(0, 0);
        Mower m = new Mower(lawn, initialPosition, Direction.SOUTH);
        m.mowItNow("G");
        Mower expected = new Mower(lawn, initialPosition, Direction.EAST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void theLiftOfEasthouldBeNorth() {
        Lawn lawn = new Lawn(5, 5);
        Position initialPosition = new Position(0, 0);
        Mower m = new Mower(lawn, initialPosition, Direction.EAST);
        m.mowItNow("G");
        Mower expected = new Mower(lawn, initialPosition, Direction.NORTH);
        Assert.assertEquals(expected, m);
    }


    @Test
    public void theRightOfNorthShouldBeEast() {
        Lawn lawn = new Lawn(5, 5);
        Position initialPosition = new Position(0, 0);
        Mower m = new Mower(lawn, initialPosition, Direction.NORTH);
        m.mowItNow("D");
        Mower expected = new Mower(lawn, initialPosition, Direction.EAST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void theRightOfEastShouldBeSouth() {
        Lawn lawn = new Lawn(5, 5);
        Position initialPosition = new Position(0, 0);
        Mower m = new Mower(lawn, initialPosition, Direction.EAST);
        m.mowItNow("D");
        Mower expected = new Mower(lawn, initialPosition, Direction.SOUTH);
        Assert.assertEquals(expected, m);
    }


    @Test
    public void theRightOfSouthShouldBeWest() {
        Lawn lawn = new Lawn(5, 5);
        Position initialPosition = new Position(0, 0);
        Mower m = new Mower(lawn, initialPosition, Direction.SOUTH);
        m.mowItNow("D");
        Mower expected = new Mower(lawn, initialPosition, Direction.WEST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void theRightOfWestShouldBeNorth() {
        Lawn lawn = new Lawn(5, 5);
        Position initialPosition = new Position(0, 0);
        Mower m = new Mower(lawn, initialPosition, Direction.WEST);
        m.mowItNow("D");
        Mower expected = new Mower(lawn, initialPosition, Direction.NORTH);
        Assert.assertEquals(expected, m);
    }


    @Test
    public void towTimesLiftOfNorthShouldBeSouth() {
        Lawn lawn = new Lawn(5, 5);
        Position initialPosition = new Position(0, 0);
        Mower m = new Mower(lawn, initialPosition, Direction.NORTH);
        m.mowItNow("GG");
        Mower expected = new Mower(lawn, initialPosition, Direction.SOUTH);
        Assert.assertEquals(expected, m);
    }
}

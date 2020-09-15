import org.junit.Assert;
import org.junit.Test;
import treatment.Direction;
import treatment.Lawn;
import treatment.Mower;
import treatment.Position;

public class MowerDirectionTest {
    Lawn lawn = new Lawn(5, 5);
    Position initialPosition = new Position(0, 0);
    @Test
    public void theInitialPositionShouldBeZeroZero() {
        Mower m = new Mower(lawn, initialPosition, Direction.NORTH);
        m.changeDirection("");
        Mower expected = new Mower(lawn, initialPosition, Direction.NORTH);
        Assert.assertEquals(expected, m);

    }

    @Test
    public void theLiftOfNorthShouldBeWest() {
        Mower m = new Mower(lawn, initialPosition, Direction.NORTH);
        m.changeDirection("G");
        Mower expected = new Mower(lawn, initialPosition, Direction.WEST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void theLiftOfWestShouldBeSouth() {
        Mower m = new Mower(lawn, initialPosition, Direction.WEST);
        m.changeDirection("G");
        Mower expected = new Mower(lawn, initialPosition, Direction.SOUTH);
        Assert.assertEquals(expected, m);
    }


    @Test
    public void theLiftOfSouthShouldBeEast() {
        Mower m = new Mower(lawn, initialPosition, Direction.SOUTH);
        m.changeDirection("G");
        Mower expected = new Mower(lawn, initialPosition, Direction.EAST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void theLiftOfEasthouldBeNorth() {
        Mower m = new Mower(lawn, initialPosition, Direction.EAST);
        m.changeDirection("G");
        Mower expected = new Mower(lawn, initialPosition, Direction.NORTH);
        Assert.assertEquals(expected, m);
    }


    @Test
    public void theRightOfNorthShouldBeEast() {
        Mower m = new Mower(lawn, initialPosition, Direction.NORTH);
        m.changeDirection("D");
        Mower expected = new Mower(lawn, initialPosition, Direction.EAST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void theRightOfEastShouldBeSouth() {
        Mower m = new Mower(lawn, initialPosition, Direction.EAST);
        m.changeDirection("D");
        Mower expected = new Mower(lawn, initialPosition, Direction.SOUTH);
        Assert.assertEquals(expected, m);
    }


    @Test
    public void theRightOfSouthShouldBeWest() {

        Mower m = new Mower(lawn, initialPosition, Direction.SOUTH);
        m.changeDirection("D");
        Mower expected = new Mower(lawn, initialPosition, Direction.WEST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void theRightOfWestShouldBeNorth() {
        Mower m = new Mower(lawn, initialPosition, Direction.WEST);
        m.changeDirection("D");
        Mower expected = new Mower(lawn, initialPosition, Direction.NORTH);
        Assert.assertEquals(expected, m);
    }


    @Test
    public void towTimesLiftOfNorthShouldBeSouth() {
        Mower m = new Mower(lawn, initialPosition, Direction.NORTH);
        m.changeDirection("GG");
        Mower expected = new Mower(lawn, initialPosition, Direction.SOUTH);
        Assert.assertEquals(expected, m);
    }
    @Test
    public void towTimesRightOfNorthShouldBeSouth() {
        Mower m = new Mower(lawn, initialPosition, Direction.NORTH);
        m.changeDirection("DD");
        Mower expected = new Mower(lawn, initialPosition, Direction.SOUTH);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void threeTimesLiftOfNorthShouldBeEast() {
        Mower m = new Mower(lawn, initialPosition, Direction.NORTH);
        m.changeDirection("GGG");
        Mower expected = new Mower(lawn, initialPosition, Direction.EAST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void fourTimesLiftOfNorthShouldBeNorth() {
        Mower m = new Mower(lawn, initialPosition, Direction.NORTH);
        m.changeDirection("GGGG");
        Mower expected = new Mower(lawn, initialPosition, Direction.NORTH);
        Assert.assertEquals(expected, m);
    }


}

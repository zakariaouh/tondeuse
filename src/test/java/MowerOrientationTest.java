import org.junit.Assert;
import org.junit.Test;
import treatment.Orientation;
import treatment.Lawn;
import treatment.Mower;
import treatment.Position;

public class MowerOrientationTest {
    Lawn lawn = new Lawn(5, 5);
    Position initialPosition = new Position(0, 0);
    @Test
    public void theInitialPositionShouldBeZeroZero() {
        Mower m = new Mower(lawn, initialPosition, Orientation.NORTH);
        m.changeOrientation("");
        Mower expected = new Mower(lawn, initialPosition, Orientation.NORTH);
        Assert.assertEquals(expected, m);

    }

    @Test
    public void theLiftOfNorthShouldBeWest() {
        Mower m = new Mower(lawn, initialPosition, Orientation.NORTH);
        m.changeOrientation("G");
        Mower expected = new Mower(lawn, initialPosition, Orientation.WEST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void theLiftOfWestShouldBeSouth() {
        Mower m = new Mower(lawn, initialPosition, Orientation.WEST);
        m.changeOrientation("G");
        Mower expected = new Mower(lawn, initialPosition, Orientation.SOUTH);
        Assert.assertEquals(expected, m);
    }


    @Test
    public void theLiftOfSouthShouldBeEast() {
        Mower m = new Mower(lawn, initialPosition, Orientation.SOUTH);
        m.changeOrientation("G");
        Mower expected = new Mower(lawn, initialPosition, Orientation.EAST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void theLiftOfEasthouldBeNorth() {
        Mower m = new Mower(lawn, initialPosition, Orientation.EAST);
        m.changeOrientation("G");
        Mower expected = new Mower(lawn, initialPosition, Orientation.NORTH);
        Assert.assertEquals(expected, m);
    }


    @Test
    public void theRightOfNorthShouldBeEast() {
        Mower m = new Mower(lawn, initialPosition, Orientation.NORTH);
        m.changeOrientation("D");
        Mower expected = new Mower(lawn, initialPosition, Orientation.EAST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void theRightOfEastShouldBeSouth() {
        Mower m = new Mower(lawn, initialPosition, Orientation.EAST);
        m.changeOrientation("D");
        Mower expected = new Mower(lawn, initialPosition, Orientation.SOUTH);
        Assert.assertEquals(expected, m);
    }


    @Test
    public void theRightOfSouthShouldBeWest() {

        Mower m = new Mower(lawn, initialPosition, Orientation.SOUTH);
        m.changeOrientation("D");
        Mower expected = new Mower(lawn, initialPosition, Orientation.WEST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void theRightOfWestShouldBeNorth() {
        Mower m = new Mower(lawn, initialPosition, Orientation.WEST);
        m.changeOrientation("D");
        Mower expected = new Mower(lawn, initialPosition, Orientation.NORTH);
        Assert.assertEquals(expected, m);
    }


    @Test
    public void towTimesLiftOfNorthShouldBeSouth() {
        Mower m = new Mower(lawn, initialPosition, Orientation.NORTH);
        m.changeOrientation("GG");
        Mower expected = new Mower(lawn, initialPosition, Orientation.SOUTH);
        Assert.assertEquals(expected, m);
    }
    @Test
    public void towTimesRightOfNorthShouldBeSouth() {
        Mower m = new Mower(lawn, initialPosition, Orientation.NORTH);
        m.changeOrientation("DD");
        Mower expected = new Mower(lawn, initialPosition, Orientation.SOUTH);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void threeTimesLiftOfNorthShouldBeEast() {
        Mower m = new Mower(lawn, initialPosition, Orientation.NORTH);
        m.changeOrientation("GGG");
        Mower expected = new Mower(lawn, initialPosition, Orientation.EAST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void fourTimesLiftOfNorthShouldBeNorth() {
        Mower m = new Mower(lawn, initialPosition, Orientation.NORTH);
        m.changeOrientation("GGGG");
        Mower expected = new Mower(lawn, initialPosition, Orientation.NORTH);
        Assert.assertEquals(expected, m);
    }


}

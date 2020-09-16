package treatment;

import org.junit.Assert;
import org.junit.Test;
import treatment.Mower;
import treatment.Orientation;
import treatment.Position;

public class MowerOrientationTest {

    Position initialPosition = new Position(0, 0);


    @Test
    public void theLeftOfNorthShouldBeWest() {
        Mower m = new Mower(initialPosition, Orientation.NORTH);
        m.changeOrientation('G');
        Mower expected = new Mower(initialPosition, Orientation.WEST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void theLeftOfWestShouldBeSouth() {
        Mower m = new Mower(initialPosition, Orientation.WEST);
        m.changeOrientation('G');
        Mower expected = new Mower(initialPosition, Orientation.SOUTH);
        Assert.assertEquals(expected, m);
    }


    @Test
    public void theLeftOfSouthShouldBeEast() {
        Mower m = new Mower(initialPosition, Orientation.SOUTH);
        m.changeOrientation('G');
        Mower expected = new Mower(initialPosition, Orientation.EAST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void theLeftOfEastShouldBeNorth() {
        Mower m = new Mower(initialPosition, Orientation.EAST);
        m.changeOrientation('G');
        Mower expected = new Mower(initialPosition, Orientation.NORTH);
        Assert.assertEquals(expected, m);
    }


    @Test
    public void theRightOfNorthShouldBeEast() {
        Mower m = new Mower(initialPosition, Orientation.NORTH);
        m.changeOrientation('D');
        Mower expected = new Mower(initialPosition, Orientation.EAST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void theRightOfEastShouldBeSouth() {
        Mower m = new Mower(initialPosition, Orientation.EAST);
        m.changeOrientation('D');
        Mower expected = new Mower(initialPosition, Orientation.SOUTH);
        Assert.assertEquals(expected, m);
    }


    @Test
    public void theRightOfSouthShouldBeWest() {

        Mower m = new Mower(initialPosition, Orientation.SOUTH);
        m.changeOrientation('D');
        Mower expected = new Mower(initialPosition, Orientation.WEST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void theRightOfWestShouldBeNorth() {
        Mower m = new Mower(initialPosition, Orientation.WEST);
        m.changeOrientation('D');
        Mower expected = new Mower(initialPosition, Orientation.NORTH);
        Assert.assertEquals(expected, m);
    }


    @Test
    public void twoTimesRightOfNorthShouldBeSouth() {
        Mower m = new Mower(initialPosition, Orientation.NORTH);
        m.run("DD");
        Mower expected = new Mower(initialPosition, Orientation.SOUTH);
        Assert.assertEquals(expected, m);


    }

    @Test
    public void threeTimesLeftOfNorthShouldBeEast() {
        Mower m = new Mower(initialPosition, Orientation.NORTH);
        m.run("GGG");
        Mower expected = new Mower(initialPosition, Orientation.EAST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void fourTimesLeftOfNorthShouldBeNorth() {
        Mower m = new Mower(initialPosition, Orientation.NORTH);
        m.run("GGGG");
        Mower expected = new Mower(initialPosition, Orientation.NORTH);
        Assert.assertEquals(expected, m);
    }


}

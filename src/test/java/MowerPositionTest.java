import org.junit.Assert;
import org.junit.Test;
import treatment.Orientation;
import treatment.Lawn;
import treatment.Mower;
import treatment.Position;

public class MowerPositionTest {
    Lawn lawn = new Lawn(5, 5);


    @Test
    public void moveOnceToNorthShouldIncrementYByOne() {

        Mower m = new Mower(lawn, new Position(0, 0), Orientation.NORTH);
        m.moveForward();
        Mower expected = new Mower(lawn, new Position(0, 1), Orientation.NORTH);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void moveOnceToEastShouldIncrementXByOne() {

        Mower m = new Mower(lawn, new Position(0, 0), Orientation.EAST);
        m.moveForward();
        Mower expected = new Mower(lawn, new Position(1, 0), Orientation.EAST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void moveTwiceToNorthShouldIncrementYByTow() {

        Mower m = new Mower(lawn, new Position(0, 0), Orientation.NORTH);
        m.run("AA");
        Mower expected = new Mower(lawn, new Position(0, 2), Orientation.NORTH);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void moveTwiceToEastShouldIncrementXByTow() {

        Mower m = new Mower(lawn, new Position(0, 0), Orientation.EAST);
        m.run("AA");
        Mower expected = new Mower(lawn, new Position(2, 0), Orientation.EAST);
        Assert.assertEquals(expected, m);
    }

    //Si la position après mouvement est en dehors de la pelouse, la tondeuse ne bouge pas,
    //conserve son orientation et traite la commande suivante.
    @Test
    public void theNextPositionInTheNorthIsOutsideTheLawnTheMowerShouldNotMove() {

        Mower m = new Mower(lawn, new Position(0, 0), Orientation.NORTH);
        m.run("AAAAAA");
        Mower expected = new Mower(lawn, new Position(0, 5), Orientation.NORTH);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void theNextPositionInTheEastIsOutsideTheLawnTheMowerShouldNotMove() {

        Mower m = new Mower(lawn, new Position(0, 0), Orientation.EAST);
        m.run("AAAAAA");
        Mower expected = new Mower(lawn, new Position(5, 0), Orientation.EAST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void moveOnceToWestShouldDecrementXByOne() {

        Mower m = new Mower(lawn, new Position(1, 1), Orientation.WEST);
        m.moveForward();
        Mower expected = new Mower(lawn, new Position(0, 1), Orientation.WEST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void moveTwiceToWestShouldDecrementXByTow() {

        Mower m = new Mower(lawn, new Position(2, 2), Orientation.WEST);
        m.run("AA");
        Mower expected = new Mower(lawn, new Position(0, 2), Orientation.WEST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void theNextPositionInTheWestIsOutsideTheLawnTheMowerShouldNotMove() {

        Mower m = new Mower(lawn, new Position(2, 2), Orientation.WEST);
        m.run("AAAAAA");
        Mower expected = new Mower(lawn, new Position(0, 2), Orientation.WEST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void moveOnceToSouthShouldDecrementXByOne() {

        Mower m = new Mower(lawn, new Position(1, 1), Orientation.SOUTH);
        m.moveForward();
        Mower expected = new Mower(lawn, new Position(1, 0), Orientation.SOUTH);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void moveTwiceToSouthShouldDecrementXByTow() {

        Mower m = new Mower(lawn, new Position(2, 2), Orientation.SOUTH);
        m.run("AA");
        Mower expected = new Mower(lawn, new Position(2, 0), Orientation.SOUTH);
        Assert.assertEquals(expected, m);
    }


    @Test
    public void theNextPositionInTheSouthIsOutsideTheLawnTheMowerShouldNotMove() {

        Mower m = new Mower(lawn, new Position(2, 2), Orientation.SOUTH);
        m.run("AAAAAA");
        Mower expected = new Mower(lawn, new Position(2, 0), Orientation.SOUTH);
        Assert.assertEquals(expected, m);
    }
}

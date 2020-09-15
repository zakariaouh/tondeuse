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

    //Si la position après mouvement est en dehors de la pelouse, la tondeuse ne bouge pas,
    //conserve son orientation et traite la commande suivante.
    @Test
    public void theNextPositionInTheNorthIsOutsideTheLawnTheMowerShouldNotMove() {
        Lawn lawn = new Lawn(5, 5);
        Mower m = new Mower(lawn, new Position(0, 0), Direction.NORTH);
        m.moveForward("AAAAAA");
        Mower expected = new Mower(lawn, new Position(0, 5), Direction.NORTH);
        Assert.assertEquals(expected, m);
    }
    @Test
    public void theNextPositionInTheEastIsOutsideTheLawnTheMowerShouldNotMove() {
        Lawn lawn = new Lawn(5, 5);
        Mower m = new Mower(lawn, new Position(0, 0), Direction.EAST);
        m.moveForward("AAAAAA");
        Mower expected = new Mower(lawn, new Position(5, 0), Direction.EAST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void moveOnceToWestShouldDecrementXByOne() {
        Lawn lawn = new Lawn(5, 5);
        Mower m = new Mower(lawn, new Position(1, 1), Direction.WEST);
        m.moveForward("A");
        Mower expected = new Mower(lawn, new Position(0, 1), Direction.WEST);
        Assert.assertEquals(expected, m);
    }
    @Test
    public void moveTwiceToWestShouldDecrementXByTow() {
        Lawn lawn = new Lawn(5, 5);
        Mower m = new Mower(lawn, new Position(2, 2), Direction.WEST);
        m.moveForward("AA");
        Mower expected = new Mower(lawn, new Position(0, 2), Direction.WEST);
        Assert.assertEquals(expected, m);
    }
    @Test
    public void theNextPositionInTheWestIsOutsideTheLawnTheMowerShouldNotMove() {
        Lawn lawn = new Lawn(5, 5);
        Mower m = new Mower(lawn, new Position(2, 2), Direction.WEST);
        m.moveForward("AAAAAA");
        Mower expected = new Mower(lawn, new Position(0, 2), Direction.WEST);
        Assert.assertEquals(expected, m);
    }

}

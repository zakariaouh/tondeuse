package treatment;

import org.junit.Assert;
import org.junit.Test;
import treatment.Lawn;
import treatment.Mower;
import treatment.Orientation;
import treatment.Position;

public class MowerMultipleMovesAndOrientationsTest {


    @Test
    public void moveRightAndMoveForwardShouldIncrementXAndChangeOrientation() {
        Lawn lawn = new Lawn(5, 5);
        Mower m = new Mower(lawn, new Position(2, 2), Orientation.NORTH);
        m.run("DA");
        Mower expected = new Mower(lawn, new Position(3, 2), Orientation.EAST);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void moveLeftAndMoveForwardShouldDecrementXAndChangeOrientation() {
        Lawn lawn = new Lawn(5, 5);
        Mower m = new Mower(lawn, new Position(2, 2), Orientation.NORTH);
        m.run("GA");
        Mower expected = new Mower(lawn, new Position(1, 2), Orientation.WEST);
        Assert.assertEquals(expected, m);
    }


    @Test
    public void givenLaw5x5MowerAtPosition1x2WhenRunThen() {
        Lawn lawn = new Lawn(5, 5);
        Mower m = new Mower(lawn, new Position(1, 2), Orientation.NORTH);
        m.run("GAGAGAGAA");
        Mower expected = new Mower(lawn, new Position(1, 3), Orientation.NORTH);
        Assert.assertEquals(expected, m);
    }

    @Test
    public void givenLaw3x3MowerAtPosition1x2WhenRunThen() {
        Lawn lawn = new Lawn(3, 3);
        Mower m = new Mower(lawn, new Position(1, 2), Orientation.NORTH);
        m.run("AADAADADDA");
        Mower expected = new Mower(lawn, new Position(3, 3), Orientation.NORTH);
        Assert.assertEquals(expected, m);
    }



}

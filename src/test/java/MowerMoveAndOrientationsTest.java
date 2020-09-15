import org.junit.Assert;
import org.junit.Test;
import treatment.Lawn;
import treatment.Mower;
import treatment.Orientation;
import treatment.Position;

public class MowerMoveAndOrientationsTest {


    @Test
    public void moveLiftAndMoveForwardShouldIncrementXAndChangeOrientation() {
        Lawn lawn = new Lawn(5, 5);
        Mower m = new Mower(lawn, new Position(2, 2), Orientation.NORTH);
        m.run("DA");
        Mower expected = new Mower(lawn, new Position(3, 2), Orientation.EAST);
        Assert.assertEquals(expected, m);
    }



    @Test
    public void qsd() {
        Lawn lawn = new Lawn(5, 5);
        Mower m = new Mower(lawn, new Position(1, 2), Orientation.NORTH);
        m.run("GAGAGAGAA");
        Mower expected = new Mower(lawn, new Position(1, 3), Orientation.NORTH);
        Assert.assertEquals(expected, m);
    }







}

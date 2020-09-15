import org.junit.Assert;
import org.junit.Test;
import treatment.Lawn;
import treatment.Mower;
import treatment.Orientation;
import treatment.Position;

public class MowerMoveAndOrientationsTest {


    @Test
    public void moveLiftAndMoveForwardShouldIncrimentXandChangeOrientation() {
        Lawn lawn = new Lawn(5, 5);
        Mower m = new Mower(lawn, new Position(2, 2), Orientation.NORTH);
        m.run("DA");
        Mower expected = new Mower(lawn, new Position(3, 2), Orientation.EAST);
        Assert.assertEquals(expected, m);
    }

}

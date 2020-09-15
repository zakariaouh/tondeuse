import org.junit.Assert;
import org.junit.Test;
import treatment.*;

import java.io.IOException;
import java.util.List;

public class MowerTestUsingDataFile {
    @Test
    public void givenDataFromFileMowerShouldFollowTheSpecifiedPath() throws IOException {
        //Given
        MowerMonitor mowerManager = new MowerMonitor();
        mowerManager.load();
        Lawn lawn = mowerManager.getLawn();
        List<Mower> mowers = mowerManager.getMowers();
        List<String> instructions = mowerManager.getInstructions();

        Lawn expectedLawn = new Lawn(5, 5);
        Assert.assertEquals(expectedLawn, lawn);


        Mower mower1 = mowers.get(0);
        //when
        mower1.run(instructions.get(0));
        Mower expected = new Mower(new Position(1, 3), Orientation.NORTH);
        //then
        Assert.assertEquals(expected, mower1);

        Mower mower2 = mowers.get(1);
        //when
        mower2.run(instructions.get(1));
        //then
        expected = new Mower(new Position(5, 1), Orientation.EAST);

        Assert.assertEquals(expected, mower2);


    }
}

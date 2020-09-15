package treatment;

import parser.LawnParser;
import parser.MowerParser;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MowerMonitor {
    String[] fileData;


    public void load() throws IOException {
        fileData = FileUtils.loadTestFile().split("\n");
    }


    public Lawn getLawn() {
        return LawnParser.parse(fileData[0]);
    }

    public List<Mower> getMowers() {
        Lawn lawn = getLawn();
        return
                Arrays.asList(
                        MowerParser.parse(lawn, fileData[1]),
                        MowerParser.parse(lawn, fileData[3])
                );
    }

    public List<String> getInstructions() {
        return Arrays.asList(fileData[2], fileData[4]);
    }
}

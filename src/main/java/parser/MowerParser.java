package parser;

import treatment.Lawn;
import treatment.Mower;
import treatment.Orientation;
import treatment.Position;

public class MowerParser {
    private static final String SEPARATOR = " ";
    private static final String PATTERN = "^\\d+ \\d+ [N|E|W|S]$";

    private MowerParser() {

    }
    public static Mower parse(final Lawn lawn, final String source) {
        if (source.matches(PATTERN)) {
            String[] fields = source.split(SEPARATOR);
            int x = Integer.parseInt(fields[0]);
            int y = Integer.parseInt(fields[1]);
            Orientation orientation = Orientation.findByValue(fields[2]);

            return new Mower(lawn, new Position(x, y), orientation);
        }
        return null;
    }

}

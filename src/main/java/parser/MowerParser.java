package parser;

import treatment.Lawn;
import treatment.Mower;
import treatment.Orientation;
import treatment.Position;

public class MowerParser {
    private static final String SEPARATOR = " ";
    private static final String PATTERN = "^\\d+ \\d+ [N|E|W|S]$";

    public static Mower parse(final Lawn lawn, final String source) {
        source.matches(PATTERN);
        String[] fildes = source.split(SEPARATOR);
        int x = Integer.valueOf(fildes[0]);
        int y = Integer.valueOf(fildes[1]);
        Orientation orientation = Orientation.findByValue(fildes[2]);

        return new Mower(lawn, new Position(x, y), orientation);
    }

}

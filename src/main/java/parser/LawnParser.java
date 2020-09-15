package parser;

import treatment.Lawn;

public class LawnParser {
    private static final String SEPARATOR = " ";
    private static final String PATTERN = "^\\d+ \\d+$";


    public static Lawn parse(final String source) {
        source.matches(PATTERN);
        String[] fildes = source.split(SEPARATOR);
        return new Lawn(Integer.valueOf(fildes[0]), Integer.valueOf(fildes[1]));
    }

}

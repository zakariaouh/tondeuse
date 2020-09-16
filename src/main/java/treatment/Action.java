package treatment;

public class Action {
    private char name;
    public static final char GAUCHE = 'G';
    private static final char DROITE = 'D';

    public Action(char name) {
        this.name = name;
    }

    public char getName() {
        return name;
    }

    public boolean isMovement() {
        return !isOrientation();
    }

    public boolean isOrientation() {
        return GAUCHE == name || DROITE == name;
    }
}

package treatment;

public class Action {
    private char action;
    public static final char GAUCHE = 'G';
    private static final char DROITE = 'D';

    public Action(char action) {
        this.action = action;
    }

    public char getAction() {
        return action;
    }

    public boolean isMovement() {
        return !isOrientation();
    }

    public boolean isOrientation() {
        return GAUCHE == action || DROITE == action;
    }
}

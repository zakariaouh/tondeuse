package treatment;

import java.util.Objects;

public class Lawn {
    private int width;
    private int length;

    public Lawn(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lawn lawn = (Lawn) o;
        return width == lawn.width &&
                length == lawn.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length);
    }

    @Override
    public String toString() {
        return "Lawn{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }
}

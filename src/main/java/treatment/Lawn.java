package treatment;

import java.util.Objects;

public class Lawn {
    private int with;
    private int length;

    public Lawn(int with , int length) {
        this.with = with;
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lawn lawn = (Lawn) o;
        return with == lawn.with &&
                length == lawn.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(with, length);
    }

    @Override
    public String toString() {
        return "Lawn{" +
                "with=" + with +
                ", length=" + length +
                '}';
    }
}

package lec_7.classwork.point_9;

import java.io.Serializable;

public class Friend implements Serializable {
    private static final long serialVersionUID = -2718393844448403867L;

    private boolean hasDog;

    public Friend(boolean hasDog) {
        this.hasDog = hasDog;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "hasDog=" + hasDog +
                '}';
    }
}

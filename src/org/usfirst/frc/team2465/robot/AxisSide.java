package org.usfirst.frc.team2465.robot;

public class AxisSide {
    public final int value;
    static final int RIGHT = -1,
                     LEFT = 1;
    public static final AxisSide right = new AxisSide(RIGHT);
    public static final AxisSide left = new AxisSide(LEFT);

    private AxisSide(int value) {
        this.value = value;
    }
}

package org.usfirst.frc.team2465.robot;

public class Axis {
	public final int value;
    static final int TRIGGERS = 3,
                     DPAD_HORIZONTAL = 6;
    public static final Axis triggers = new Axis(TRIGGERS);
    public static final Axis dPadHorizontal = new Axis(DPAD_HORIZONTAL);

    private Axis(int value) {
        this.value = value;
    }
}

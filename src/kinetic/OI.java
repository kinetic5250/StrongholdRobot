package kinetic;

import edu.wpi.first.wpilibj.Joystick;

public class OI {
	public static Joystick stick1;
    public static void init() {
		stick1 = new Joystick(0);
    };
}


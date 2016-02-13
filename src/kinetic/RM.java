package kinetic;

import edu.wpi.first.wpilibj.Relay;

public class RM {
	public static Relay r1;
	public static Relay r2;
	public static Relay r3;
	public static Relay r4;
    
	public static void init() {
    	r1 = new Relay(0);
    	r2 = new Relay(1);
    	r3 = new Relay(2);
    	r4 = new Relay(3);
    }
}

package kinetic;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;

public class RM {
	public static RobotDrive myDrive;
	public static Talon frontLeft;
	public static Talon frontRight;
	public static Talon rearLeft;
	public static Talon rearRight;
    
    
	public static void init() {
		frontLeft = new Talon(1);
		frontRight = new Talon (2);
		rearRight= new Talon(3);
		rearLeft = new Talon(4);
		myDrive = new RobotDrive(frontLeft, rearRight, frontLeft, frontRight);
			
    }
}

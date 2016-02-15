package kinetic;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;

public class RM {
	static Joystick driveStick;
	static RobotDrive myDrive;
	static Talon frontLeft;
	static Talon frontRight;
	static Talon rearLeft;
	static Talon rearRight;
    
    
	public static void init() {
		frontLeft = new Talon(1);
		frontRight = new Talon (2);
		rearRight= new Talon(3);
		rearLeft = new Talon(4);
		myDrive = new RobotDrive(frontLeft, rearRight, frontLeft, frontRight);
		
		driveStick = new Joystick(1);
			
    }
}

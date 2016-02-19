package kinetic;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.CANTalon;

public class RM {
	public static RobotDrive myDrive;
	public static CANTalon frontLeft;
	public static CANTalon frontRight;
	public static CANTalon rearLeft;
	public static CANTalon rearRight;
    
    
	public static void init() {
		frontLeft = new CANTalon(21);
		frontRight = new CANTalon (22);
		rearRight= new CANTalon(23);
		rearLeft = new CANTalon(24);
		myDrive = new RobotDrive(frontLeft, frontRight, rearLeft, rearRight);
		
	}
}
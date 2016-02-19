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
		frontLeft = new CANTalon(1);
		frontRight = new CANTalon (2);
		rearRight= new CANTalon(3);
		rearLeft = new CANTalon(4);
		myDrive = new RobotDrive(frontLeft, rearRight, frontLeft, frontRight);
		
			
	}
}
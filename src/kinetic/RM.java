package kinetic;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.CANTalon;

public class RM {
	
	//DriveTrain motors and RobotDrive(which is the controller)
	public static CANTalon frontLeft;
	public static CANTalon frontRight;
	public static CANTalon rearLeft;
	public static CANTalon rearRight;
	public static RobotDrive robotDrive;
	
	//CANJaguars that control linear actuators
	public static CANJaguar frontLeftSuspension;
	public static CANJaguar frontRightSuspension;
	public static CANJaguar rearLeftSuspension;
	public static CANJaguar rearRightSuspension;
    
	public static void init() {
		frontLeft = new CANTalon(21);
		frontRight = new CANTalon (22);
		rearRight= new CANTalon(23);
		rearLeft = new CANTalon(24);
		
		frontLeftSuspension = new CANJaguar(25);
		frontRightSuspension = new CANJaguar(26);
		rearLeftSuspension = new CANJaguar(27);
		rearRightSuspension = new CANJaguar(28);
		
		frontLeftSuspension.setInverted(false);
		frontRightSuspension.setInverted(false);
		rearLeftSuspension.setInverted(false);
		rearRightSuspension.setInverted(false);
		
		frontLeftSuspension.setPositionMode(CANJaguar.kPotentiometer, 0.1, 0.001, 0.0);
		frontRightSuspension.setPositionMode(CANJaguar.kPotentiometer, 0.1, 0.001, 0.0);
		rearLeftSuspension.setPositionMode(CANJaguar.kPotentiometer, 0.1, 0.001, 0.0);
		rearRightSuspension.setPositionMode(CANJaguar.kPotentiometer, 0.1, 0.001, 0.0);
		
		/*
		frontLeftSuspension.enableControl();
		frontRightSuspension.enableControl();
		rearLeftSuspension.enableControl();
		rearRightSuspension.enableControl();
		*/
		
		robotDrive = new RobotDrive(frontLeft, frontRight, rearLeft, rearRight);
	}
}
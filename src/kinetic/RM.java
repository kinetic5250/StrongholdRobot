package kinetic;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;

public class RM {
	
	//DriveTrain motors and RobotDrive(which is the controller)
	public static CANTalon frontLeft;
	public static CANTalon frontRight;
	public static CANTalon rearLeft;
	public static CANTalon rearRight;
	public static RobotDrive robotDrive;
	
	public static CANJaguar motor;	// the motor to directly control with a joystick
    public static CANJaguar motor2;
    public static CANJaguar motor3;
    public static CANJaguar motor4;
	
	
	public static void init() {
		rearRight = new CANTalon(41);
		rearLeft = new CANTalon (42);
		frontLeft = new CANTalon(43);
		frontRight = new CANTalon(44);
		
		motor = new CANJaguar(25);		// initialize the motor as a Talon on channel 0
        motor2 = new CANJaguar(26);
        motor3 = new CANJaguar(27);
        motor4 = new CANJaguar(28);
        
        motor.setPositionMode(CANJaguar.kPotentiometer, -2000, -0, -0.0);
        motor2.setPositionMode(CANJaguar.kPotentiometer, -2000, -0, -0.0);
        motor3.setPositionMode(CANJaguar.kPotentiometer, 2000, 0, 0);
        motor4.setPositionMode(CANJaguar.kPotentiometer, -2000, -0, -0);
        
        motor.enableControl();
        motor2.enableControl();
        motor3.enableControl();
        motor4.enableControl();
		
		rearRight.setInverted(true);
		rearLeft.setInverted(true);
		frontLeft.setInverted(true);
		frontRight.setInverted(true);
		
		
		
		robotDrive = new RobotDrive(frontLeft, rearLeft, frontRight, rearRight);
	}
}
package kinetic;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Scheduler;
public class Robot extends IterativeRobot {
	
	//The initialization files are 
	
    //This runs first when the robot is turn on
	//Initialize Mappings, Interfaces, and Dashboard
	public static Joystick stick1;
	public static Joystick stick2;
    public static CameraServer server;
    
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
  	
    public void robotInit() {
		stick1 = new Joystick(0);
		stick2 = new Joystick(1);
		
		server = CameraServer.getInstance();
        server.setQuality(50);
        //the camera name (ex "cam0") can be found through the roborio web interface
        server.startAutomaticCapture("cam0");
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
    };
	
    public void disabledInit(){

    }
	
	public void disabledPeriodic() {
		//Scheduler.getInstance().run();
	}

    public void autonomousInit() {
    }

    public void autonomousPeriodic() {
        //Scheduler.getInstance().run();
    }

    public void teleopInit() {
    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        //Takes stick1 and runs DriveTrain
        robotDrive.arcadeDrive(stick1, false);
        //Sets suspension position to pre-calculated positions.
        //The following calculation is based on the potentiometer table.
        motor.set(stick2.getY()*0.060+.497);
    	motor2.set(stick2.getY()*0.060+.349);
    	motor3.set(stick2.getY()*-0.060+0.625);
    	motor4.set(stick2.getY()*0.060+0.278);
        //Dashboard.run();
    }
    
    public void testPeriodic() {
    }
}

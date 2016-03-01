package kinetic;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Scheduler;
public class Robot extends IterativeRobot {
	
    public static Joystick stick1;
	public static Joystick stick2;
    public static CameraServer server;
    
    //DriveTrain motors and RobotDrive(which is the controller)
  	public static CANTalon frontLeft;
  	public static CANTalon frontRight;
  	public static CANTalon rearLeft;
  	public static CANTalon rearRight;
  	public static RobotDrive robotDrive;
  	
  	public static CANJaguar sus1;	// the motor to directly control with a joystick
  	public static CANJaguar sus2;
  	public static CANJaguar sus3;
  	public static CANJaguar sus4;
  	
  	//This runs first when the robot is turn on
  	//Initialize Mappings, Interfaces, and Dashboard
  	public void robotInit() {
  		
  		
  		//Joysticks
		stick1 = new Joystick(0);
		stick2 = new Joystick(1);
		
		
		//Camera
		server = CameraServer.getInstance();
        server.setQuality(50);
        server.startAutomaticCapture("cam1");
        
        
        //DriveTrain
        rearRight = new CANTalon(41);
  		rearLeft = new CANTalon (42);
  		frontLeft = new CANTalon(43);
  		frontRight = new CANTalon(44);
  		
  		//All the motors are inverted based on empirical results
  		rearRight.setInverted(true);
  		rearLeft.setInverted(true);
  		frontLeft.setInverted(true);
  		frontRight.setInverted(true);
  		
  		robotDrive = new RobotDrive(frontLeft,
  				rearLeft, frontRight, rearRight);
  		
  		
  		//Suspension
  		sus1 = new CANJaguar(25);
  		sus2 = new CANJaguar(26);
  		sus3 = new CANJaguar(27);
  		sus4 = new CANJaguar(28);
  		
  		//Again, based on measurements, The PID for the suspension is calibrated
  		//See https://wpilib.screenstepslive.com/s/4485/m/13809/l/230372-jaguar-speed-controllers
  		//"Using Position Control"
  		sus1.setPositionMode(CANJaguar.kPotentiometer, -2000, -0, -0.0);
  		sus2.setPositionMode(CANJaguar.kPotentiometer, -2000, -0, -0.0);
  		sus3.setPositionMode(CANJaguar.kPotentiometer, 2000, 0, 0);
  		sus4.setPositionMode(CANJaguar.kPotentiometer, -2000, -0, -0);
      
  		sus1.enableControl();
  		sus2.enableControl();
  		sus3.enableControl();
  		sus4.enableControl();
	
  	};
	
    public void disabledInit(){

    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
    }

    public void teleopPeriodic() {
    	//Currently, this does nothing
        Scheduler.getInstance().run();
        
        //Takes stick1 and runs DriveTrain
        robotDrive.arcadeDrive(stick1, false);
        
        //Sets suspension position to pre-calculated positions.
        //The following calculation is based on the potentiometer table.
        sus1.set(stick2.getY()*0.060+.497);
    	sus2.set(stick2.getY()*0.060+.349);
    	sus3.set(stick2.getY()*-0.060+0.625);
    	sus4.set(stick2.getY()*0.060+0.278);
    }
    
    public void testPeriodic() {
    }
}

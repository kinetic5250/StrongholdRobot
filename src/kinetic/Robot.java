package kinetic;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;

public class Robot extends IterativeRobot {
	
	Joystick driveStick;
	RobotDrive myDrive;
	Talon frontLeft, frontRight, rearLeft, rearRight;
    
	
    //This runs first when the robot is turn on
	//Initialize Mappings, Interfaces, and Dashboard
	public void robotInit() {
		
		
		frontLeft = new Talon(1);
		frontRight = new Talon (2);
		rearRight= new Talon(3);
		rearLeft = new Talon(4);
		myDrive = new RobotDrive(frontLeft, frontRight, rearRight, rearLeft);
		
		driveStick = new Joystick(1);
		//RobotMap
    	//RM.init();
    	//OperatorInterface
		//OI.init();
		//Dashboard
		//Dashboard.init();
		
	}
	
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
        //Scheduler.getInstance().run();
        //Dashboard.run();
    	myDrive.arcadeDrive(driveStick);
    }
    
    public void testPeriodic() {
    }
}

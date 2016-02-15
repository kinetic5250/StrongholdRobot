package kinetic;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;

public class Robot extends IterativeRobot {
	
	
	
    //This runs first when the robot is turn on
	//Initialize Mappings, Interfaces, and Dashboard
	public void robotInit() {
		//RobotMap
    	RM.init();
    	//OperatorInterface
		OI.init();
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
    	RM.myDrive.arcadeDrive(RM.driveStick);
    }
    
    public void testPeriodic() {
    }
}

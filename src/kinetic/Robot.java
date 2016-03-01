package kinetic;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
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
        Scheduler.getInstance().run();
        RM.robotDrive.arcadeDrive(OI.stick1, false);
        RM.motor.set(OI.stick2.getY()*0.060+.497);
    	RM.motor2.set(OI.stick2.getY()*0.060+.349);
    	RM.motor3.set(OI.stick2.getY()*-0.060+0.625);
    	RM.motor4.set(OI.stick2.getY()*0.060+0.278);
        //Dashboard.run();
    }
    
    public void testPeriodic() {
    }
}

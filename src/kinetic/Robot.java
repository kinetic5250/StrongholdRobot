package kinetic;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import kinetic.commands.DriveCommand;

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
    	Scheduler.getInstance().add(new DriveCommand());
    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        //Dashboard.run();
    }
    
    public void testPeriodic() {
    }
}

package kinetic.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import kinetic.RM;
import kinetic.commands.SuspensionCommand;

public class Suspension extends Subsystem {
	
	protected void initDefaultCommand() {
		//setDefaultCommand(new SuspensionCommand(2.5,2.5,2.5,2.5));
	}
	
	public void setFrontLeft(double position) {
		RM.frontLeftSuspension.set(position);
	}
	
	public void setFrontRight(double position) {
		RM.frontRightSuspension.set(position);
	}
	
	public void setRearLeft(double position) {
		RM.rearLeftSuspension.set(position);
	}
	
	public void setRearRight(double position) {
		RM.rearRightSuspension.set(position);
	}
}

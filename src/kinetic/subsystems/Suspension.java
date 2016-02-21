package kinetic.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import kinetic.RM;
import kinetic.commands.SuspensionCommand;

public class Suspension extends Subsystem {
	
	protected void initDefaultCommand() {
		setDefaultCommand(new SuspensionCommand());
	}
	
	public void setFrontLeft(double position) {
		RM.frontLeftSuspension.setSetpoint(position);
	}
	
	public void setFrontRight(double position) {
		RM.frontRightSuspension.setSetpoint(position);
	}
	
	public void setRearLeft(double position) {
		RM.rearLeftSuspension.setSetpoint(position);
	}
	
	public void setRearRight(double position) {
		RM.rearRightSuspension.setSetpoint(position);
	}
}

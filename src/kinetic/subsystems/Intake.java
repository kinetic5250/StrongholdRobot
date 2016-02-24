package kinetic.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import kinetic.commands.IntakeCommand;

public class Intake extends Subsystem {
	
	public void initDefaultCommand() {
		setDefaultCommand(new IntakeCommand());
	}
	
	
}
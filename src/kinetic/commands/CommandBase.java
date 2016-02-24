package kinetic.commands;

import edu.wpi.first.wpilibj.command.Command;
import kinetic.subsystems.DriveTrain;
import kinetic.subsystems.Intake;

public abstract class CommandBase extends Command {
	DriveTrain driveTrain = new DriveTrain();
	Intake intake = new Intake();
}

package kinetic.commands;

import edu.wpi.first.wpilibj.command.Command;
import kinetic.subsystems.DriveTrain;

public abstract class CommandBase extends Command {
	DriveTrain driveTrain = new DriveTrain();
}

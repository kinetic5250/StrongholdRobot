package kinetic.commands;

import edu.wpi.first.wpilibj.command.Command;
import kinetic.subsystems.DriveTrain;
import kinetic.subsystems.Suspension;

public abstract class CommandBase extends Command {
	DriveTrain driveTrain = new DriveTrain();
	Suspension suspension = new Suspension();
}

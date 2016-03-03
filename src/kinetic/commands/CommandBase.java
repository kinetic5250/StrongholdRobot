package kinetic.commands;

import edu.wpi.first.wpilibj.command.Command;
import kinetic.subsystems.Intake;;

public abstract class CommandBase extends Command {
	Intake intake = new Intake();
}

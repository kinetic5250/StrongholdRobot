package kinetic.commands;

//import not needed, for future reference/buttons
import kinetic.OI;

public class IntakeCommand extends CommandBase {

	public IntakeCommand() {
		requires(intake);
	}
	
	protected void initialize() {

	}
	
	protected void execute() {
		
	}
	
	protected boolean isFinished() {
		return false;
	}
	
	protected void end() {
	}

	protected void interrupted() {
	}
}

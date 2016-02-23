package kinetic.commands;

public class SuspensionCommand extends CommandBase {
	double frontLeftPos;
	double frontRightPos;
	double rearLeftPos;
	double rearRightPos;
	
	//read the constructor order. Note that -1 is used to inidicate no change.
	//exmaple: new SuspensionCommand(-1,-1,1.5,-1)
    public SuspensionCommand(double frontLeftPos, double frontRightPos, double rearLeftPos, double rearRightPos) {
        // Use requires() here to declare subsystem dependencies
        requires(suspension);
        if(frontLeftPos != -1){
        	this.frontLeftPos = frontLeftPos;
        }
        if(frontRightPos != -1){
        	this.frontRightPos = frontRightPos;
        }
        if(rearLeftPos != -1){
        	this.rearLeftPos = rearLeftPos;
        }
        if(rearRightPos != -1){
        	this.rearRightPos = rearRightPos;
        }
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	suspension.setFrontLeft(frontLeftPos);
    	suspension.setFrontRight(frontRightPos);
    	suspension.setRearLeft(rearRightPos);
    	suspension.setRearRight(rearRightPos);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

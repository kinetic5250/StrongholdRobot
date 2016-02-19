package kinetic.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import kinetic.commands.DriveCommand;

public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        setDefaultCommand(new DriveCommand());
    }
}


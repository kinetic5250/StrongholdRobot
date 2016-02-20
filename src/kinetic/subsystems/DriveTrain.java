package kinetic.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import kinetic.RM;
import kinetic.commands.DriveCommand;

public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        setDefaultCommand(new DriveCommand());
    }
    
    public void arcadeDrive(Joystick stick) {
    	RM.robotDrive.arcadeDrive(stick);
    }
    
    public void arcadeDrive(Joystick stick, boolean isSquared) {
    	RM.robotDrive.arcadeDrive(stick, isSquared);
    }
    
}


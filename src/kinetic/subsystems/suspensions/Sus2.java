package kinetic.subsystems.suspensions;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import kinetic.RM;

public class Sus2 extends Subsystem {
    
	public void initDefaultCommand() {
    }
    
    public static void setForward() {
    	RM.r2.set(Relay.Value.kForward);
    }
    
    public static void setReverse() {
    	RM.r2.set(Relay.Value.kReverse);
    };
    
    public static void stop() {
    	RM.r2.set(Relay.Value.kOff);
    }
}


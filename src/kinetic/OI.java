package kinetic;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Joystick;

public class OI {
	public static Joystick stick1;
	public static Joystick stick2;
    public static CameraServer server;
    
    public static void init() {
		stick1 = new Joystick(0);
		stick2 = new Joystick(1);
		
		server = CameraServer.getInstance();
        server.setQuality(50);
        //the camera name (ex "cam0") can be found through the roborio web interface
        server.startAutomaticCapture("cam0");
    };
}


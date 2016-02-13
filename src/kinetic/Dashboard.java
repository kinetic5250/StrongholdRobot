package kinetic;

import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class Dashboard {
	static NetworkTable networkTable;

	public static void init() {
		networkTable = NetworkTable.getTable("table");
	}

	public static void run() {
		//Testing network table
		networkTable.putNumber("table", 1);
	}
}
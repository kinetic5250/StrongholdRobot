package kinetic;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends IterativeRobot {

 public static Joystick stick1, stick2, stick3;
 public static CameraServer server;

 //DriveTrain motors and RobotDrive(which is the controller)
 public static CANTalon frontLeft, frontRight, rearLeft, rearRight;
 public static RobotDrive robotDrive;

 public static CANJaguar sus1, sus2, sus3, sus4;

 public static CANJaguar shooter, arm, intake;

 //This runs first when the robot is turn on
 //Initialize Mappings, Interfaces, and Dashboard
 public void robotInit() {


  //Joysticks
  stick1 = new Joystick(0);
  stick2 = new Joystick(1);
  stick3 = new Joystick(2);

  //Camera
  server = CameraServer.getInstance();
  server.setQuality(50);
  server.startAutomaticCapture("cam1");


  //DriveTrain
  rearRight = new CANTalon(41);
  rearLeft = new CANTalon(42);
  frontLeft = new CANTalon(43);
  frontRight = new CANTalon(44);

  //All the motors are inverted based on empirical results
  rearRight.setInverted(true);
  rearLeft.setInverted(true);
  frontLeft.setInverted(true);
  frontRight.setInverted(true);

  robotDrive = new RobotDrive(frontLeft,
   rearLeft, frontRight, rearRight);


  //Suspension
  sus1 = new CANJaguar(25);
  sus2 = new CANJaguar(26);
  sus3 = new CANJaguar(27);
  sus4 = new CANJaguar(28);

  //Again, based on measurements, The PID for the suspension is calibrated
  //See https://wpilib.screenstepslive.com/s/4485/m/13809/l/230372-jaguar-speed-controllers
  //"Using Position Control"
  sus1.setPositionMode(CANJaguar.kPotentiometer, -2000, -0, -0.0);
  sus2.setPositionMode(CANJaguar.kPotentiometer, -2000, -0, -0.0);
  sus3.setPositionMode(CANJaguar.kPotentiometer, 2000, 0, 0);
  sus4.setPositionMode(CANJaguar.kPotentiometer, -2000, -0, -0);

  sus1.enableControl();
  sus2.enableControl();
  sus3.enableControl();
  sus4.enableControl();


  shooter = new CANJaguar(29);
  arm = new CANJaguar(30);
  intake = new CANJaguar(31);
 };

 public void disabledInit() {

 }

 public void disabledPeriodic() {
  Scheduler.getInstance().run();
 }

 public void autonomousInit() {}

 public void autonomousPeriodic() {
  Scheduler.getInstance().run();
 }

 public void teleopInit() {}

 public void teleopPeriodic() {
  //Currently, this does nothing
  Scheduler.getInstance().run();

  //Takes stick1 and runs DriveTrain
  robotDrive.arcadeDrive(stick1, false);

  //Sets suspension position to pre-calculated positions.
  //The following calculation is based on the potentiometer table.
  sus1.set(stick2.getY() * 0.060 + .497);
  sus2.set(stick2.getY() * 0.060 + .349);
  sus3.set(stick2.getY() * -0.060 + 0.625);
  sus4.set(stick2.getY() * 0.060 + 0.278);

  shooter.set(stick2.getThrottle());
  arm.set(stick3.getRawAxis(1));
  intake.set(stick1.getThrottle());
 }

 public void testPeriodic() {}
}

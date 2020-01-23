// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package frc.robot;

import edu.wpi.first.hal.FRCNetComm.tInstances;
import edu.wpi.first.hal.FRCNetComm.tResourceType;
import edu.wpi.first.hal.HAL;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.Climber;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in 
 * the project.
 */
public class Robot extends TimedRobot {
    private static final String kRightAuto = "Right Auto";
    private static final String kLeftAuto = "Left Auto";
    private static final String kMiddleAuto = "Middle Auto"; 
    private String m_autoSelected;
    private SendableChooser<String> auto_chooser = new SendableChooser<>();

    public static OI oi;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static DriveTrain driveTrain;
    public static Intake intake;
    public static Shooter shooter;
    public static Climber climber;
    NetworkTableEntry centerXEntry;
    

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    @Override
    public void robotInit() {
        auto_chooser.addDefault("Middle Auto", kMiddleAuto);
        auto_chooser.addOption("Right Auto", kRightAuto);
        auto_chooser.addOption("Left Auto", kLeftAuto);
        SmartDashboard.putData("Auto Selection", auto_chooser);
        NetworkTableInstance  inst = NetworkTableInstance.getDefault();
        NetworkTable table = inst.getTable("pi");
        
      
        
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrain = new DriveTrain();
        intake = new Intake();
        shooter = new Shooter();
        climber = new Climber();
        
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        // OI must be constructed after subsystems. If the OI creates Commands
        //(which it very likely will), subsystems are not guaranteed to be
        // constructed yet. Thus, their requires() statements may grab null
        // pointers. Bad news. Don't move it.
        oi = new OI();

        HAL.report(tResourceType.kResourceType_Framework, tInstances.kFramework_RobotBuilder);

        // Add commands to Autonomous Sendable Chooser
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS

        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
        
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    @Override
    public void disabledInit(){

    }
   

    @Override
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void autonomousInit() {
       m_autoSelected = auto_chooser.getSelected();
       
       System.out.println("Auto selected: " + m_autoSelected);
       
       switch (m_autoSelected){

           case "Middle Auto":

           case "Left Auto":

           case "Right Auto":

       }
    }

    /**
     * This function is called periodically during autonomous
     */
    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        
    }

    @Override
    public void teleopInit() {

    }
        
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
      

    /**
     * This function is called periodically during operator control
     */
    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        System.out.println(centerXEntry);
        // if (oi.getLeftJoystickY() != 0 || oi.getLeftJoystickX() != 0){
        //     driveTrain.runMecanumDrive(oi.getLeftJoystickY(), oi.getLeftJoystickX(), 0);
        // } else {
        //     driveTrain.runMecanumDrive(0, 0, 0);
           
        // }
        
        
        if (oi.getAButton()){
            intake.runIntake(1);
            System.out.println("Running at 100% speed.");
        } else  if (oi.getBButton()){
            intake.runIntake(0.75);
            System.out.println("Running at 75% speed.");
        } else if (oi.getYButton()){
            intake.runIntake(0.5);
            System.out.println("Running at 50% speed.");
        } else if (oi.getXButton()){
            intake.runIntake(0.25);
            System.out.println("Running at 25% speed.");
        } else {
            intake.runIntake(0);
        }
        
       
    }
}

// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package frc.robot.subsystems.drivetrain;

import edu.wpi.first.wpilibj.SlewRateLimiter;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotConstants;
import frc.robot.controls.OI;



// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private Victor leftFront;
    private Victor leftRear;
    private Victor rightFront;
    private Victor rightRear;
    private MecanumDrive mecanumDrive;
    private final double kDriveTick2Feet = 0.0; 
    public static OI oi;
   
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public DriveTrain() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        leftFront = new Victor(RobotConstants.leftFrontMotorPWM);
        addChild("LeftFront", leftFront);
        leftFront.setInverted(false);
        
        leftRear = new Victor(RobotConstants.leftRearMotorPWM);
        addChild("LeftRear", leftRear);
        leftRear.setInverted(false);

        rightFront = new Victor(RobotConstants.rightFrontMotorPWM);
        addChild("RightFront", rightFront);
        rightFront.setInverted(false);

        rightRear = new Victor(RobotConstants.rightRearMotorPWM);
        addChild("RightRear", rightRear);
        rightRear.setInverted(false);

        mecanumDrive = new MecanumDrive(leftFront, leftRear, rightFront, rightRear);
        addChild("Mecanum Drive", mecanumDrive);
        mecanumDrive.setSafetyEnabled(true);
        mecanumDrive.setExpiration(0.1);
        mecanumDrive.setMaxOutput(0.6);

        mecanumDrive.setDeadband(0.075);
        mecanumDrive.setRightSideInverted(false);
       
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
   

    }
    public void runPeriodic(double xSpeed, double ySpeed, double rot){
       
        SmartDashboard.putNumber("xSpeed", xSpeed);
        SmartDashboard.putNumber("ySpeed", ySpeed);
        SmartDashboard.putNumber("rotSpeed", rot);
        runMecanumDrive(rot, ySpeed, xSpeed);
    }
    public void runMecanumDrive(double ySpeed, double xSpeed, double zRotation) {
        mecanumDrive.driveCartesian(ySpeed, xSpeed, zRotation);
    
     
        
    }
    public void runLeftRear(double speed){
        leftRear.setSpeed(speed);
    }
    public void runRightRear(double speed){
        rightRear.setSpeed(speed);
    }
    public void runLeftFront(double speed){
        leftFront.setSpeed(speed);
    }
    public void runrightFront(double speed){
        rightFront.setSpeed(speed);
    }
   

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}
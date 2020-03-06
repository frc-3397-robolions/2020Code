package frc.robot.subsystems.drivetrain;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.core.RobotConstants;

public class DriveTrainBase {
    private Victor leftFront;
    private Victor leftRear;
    private Victor rightFront;
    private Victor rightRear;
    private MecanumDrive mecanumDrive;

    public DriveTrainBase(){
        leftFront = new Victor(RobotConstants.PWMConstants.LEFT_FRONT_MOTOR_PWM);
        leftFront.setInverted(false);
        
        leftRear = new Victor(RobotConstants.PWMConstants.LEFT_REAR_MOTOR_PWM);
        leftRear.setInverted(false);

        rightFront = new Victor(RobotConstants.PWMConstants.RIGHT_FRONT_MOTOR_PWM);
        rightFront.setInverted(false);

        rightRear = new Victor(RobotConstants.PWMConstants.RIGHT_REAR_MOTOR_PWM);
        rightRear.setInverted(false);

        mecanumDrive = new MecanumDrive(leftFront, leftRear, rightFront, rightRear);

        mecanumDrive.setSafetyEnabled(true);
        mecanumDrive.setExpiration(0.1);
        mecanumDrive.setMaxOutput(0.6);

        mecanumDrive.setDeadband(0.075);
        mecanumDrive.setRightSideInverted(false);


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
    public void runRightFront(double speed){
        rightFront.setSpeed(speed);
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
   
    
}
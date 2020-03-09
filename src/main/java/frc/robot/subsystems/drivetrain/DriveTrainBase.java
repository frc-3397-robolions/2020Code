package frc.robot.subsystems.drivetrain;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.robot.core.RobotConstants;

public class DriveTrainBase {
    private Victor leftFrontM;
    private Victor leftRearM;
    private Victor rightFrontM;
    private Victor rightRearM;
    private MecanumDrive mecanumDrive;
    private Encoder leftFrontE;
    private Encoder leftRearE;
    private Encoder rightFrontE;
    private Encoder rightRearE;

    public DriveTrainBase(){
        leftFrontM = new Victor(RobotConstants.MotorConstants.LEFT_FRONT_MOTOR_PWM);
        leftFrontM.setInverted(false);
        
        leftRearM = new Victor(RobotConstants.MotorConstants.LEFT_REAR_MOTOR_PWM);
        leftRearM.setInverted(false);

        rightFrontM = new Victor(RobotConstants.MotorConstants.RIGHT_FRONT_MOTOR_PWM);
        rightFrontM.setInverted(false);

        rightRearM = new Victor(RobotConstants.MotorConstants.RIGHT_REAR_MOTOR_PWM);
        rightRearM.setInverted(false);

        mecanumDrive = new MecanumDrive(leftFrontM, leftRearM, rightFrontM, rightRearM);

        mecanumDrive.setSafetyEnabled(true);
        mecanumDrive.setExpiration(0.1);
        mecanumDrive.setMaxOutput(0.6);

        mecanumDrive.setDeadband(0.075);
        mecanumDrive.setRightSideInverted(false);

        leftFrontE = new Encoder(0, 1);
        leftRearE = new Encoder(, sourceB)
    }

    

    public void runLeftRear(double speed){
        leftRearM.setSpeed(speed);
        
    }
    public void runRightRear(double speed){
        rightRearM.setSpeed(speed);
    }
    public void runLeftFront(double speed){
        leftFrontM.setSpeed(speed);
    }
    public void runRightFront(double speed){
        rightFrontM.setSpeed(speed);
    }
    public void runMecanumDrive(double ySpeed, double xSpeed, double zRotation) {
        mecanumDrive.driveCartesian(ySpeed, xSpeed, zRotation);
    
    }

   
    
}
package frc.robot.subsystems.drivetrain;

import com.kauailabs.navx.frc.AHRS;

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
    private AHRS ahrs; 

    public DriveTrainBase(){
        leftFrontM = new Victor(RobotConstants.MotorConstants.LEFT_FRONT_MOTOR_PWM);
        leftRearM = new Victor(RobotConstants.MotorConstants.LEFT_REAR_MOTOR_PWM);
        rightFrontM = new Victor(RobotConstants.MotorConstants.RIGHT_FRONT_MOTOR_PWM);
        rightRearM = new Victor(RobotConstants.MotorConstants.RIGHT_REAR_MOTOR_PWM);

        mecanumDrive = new MecanumDrive(leftFrontM, leftRearM, rightFrontM, rightRearM);
        ahrs = new AHRS();
        
        mecanumDrive.setSafetyEnabled(true);
        mecanumDrive.setDeadband(0.1);
        mecanumDrive.setRightSideInverted(true);
        mecanumDrive.setMaxOutput(0.7);
        

        // leftFrontE = new Encoder(RobotConstants.MotorConstants.LEFT_FRONT_MOTOR_PORT[0], RobotConstants.MotorConstants.LEFT_FRONT_MOTOR_PORT[1]);
        // leftRearE = new Encoder(RobotConstants.MotorConstants.LEFT_REAR_MOTOR_PORT[0], RobotConstants.MotorConstants.LEFT_REAR_MOTOR_PORT[1]);
        // rightFrontE = new Encoder(RobotConstants.MotorConstants.RIGHT_FRONT_MOTOR_PORT[0], RobotConstants.MotorConstants.RIGHT_FRONT_MOTOR_PORT[1]);
        rightRearE = new Encoder(RobotConstants.MotorConstants.RIGHT_REAR_MOTOR_PORT1, RobotConstants.MotorConstants.RIGHT_REAR_MOTOR_PORT2);
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
    public Encoder getRightRearEncoder(){

        return rightRearE;
    }
    public AHRS getAHRS(){
        return ahrs;
    }

   
    
}
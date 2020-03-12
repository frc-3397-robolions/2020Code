package frc.robot.subsystems.drivetrain;

import edu.wpi.first.wpilibj.SlewRateLimiter;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.controls.OI;

public class DriveTrainOperator {
    private OI oi;
    private DriveTrainBase base;
    private SlewRateLimiter ySpeedLimiter;
    private SlewRateLimiter xSpeedLimiter;
    private SlewRateLimiter zRotationLimiter;
    private double ySpeed;
    private double xSpeed;
    private double zRotation;
    public DriveTrainOperator(){
        oi = new OI();
        base = new DriveTrainBase();
        ySpeedLimiter = new SlewRateLimiter(1);
        xSpeedLimiter = new SlewRateLimiter(1);
        zRotationLimiter = new SlewRateLimiter(1);
       
    }
   
    public void autoRun(){
        
    }
    public void teleopInit(){
        
    }
    public void teleopRun(){
        ySpeed = xSpeedLimiter.calculate(oi.xBox().getLeftJoystickX()); 
        xSpeed =  -ySpeedLimiter.calculate(oi.xBox().getLeftJoystickY());
        zRotation = zRotationLimiter.calculate(oi.xBox().getRightJoystickX());
        base.runMecanumDrive(ySpeed, xSpeed, zRotation);
       
        SmartDashboard.putNumber("RREncoder", base.getRightRearEncoder().getRaw());
        SmartDashboard.putNumber("Robot Angle", base.getAHRS().getRoll());
        
    }
    public void testRun(){
    /*
      ====Single Motor Tests=== 
    ~ Xbox Controller -> Motors ~ 
        Button A = Right Rear
        Button B = Right Front
        Button Y = Left Rear
        Button X = Left Front 
    */
        if (oi.xBox().getAButton()){
            base.runRightRear(1);
        } else {
            base.runRightRear(0);
        }
        if (oi.xBox().getBButton()){
            base.runRightFront(1);
         } else {
             base.runRightFront(0);
         }
         
        if (oi.xBox().getYButton()){
            base.runLeftFront(1);
        } else {
            base.runLeftFront(0);
        }
        if (oi.xBox().getXButton()){
            base.runLeftRear(1);
        } else {
            base.runLeftRear(0);
        }
    }
}
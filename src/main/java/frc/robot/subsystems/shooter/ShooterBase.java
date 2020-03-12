package frc.robot.subsystems.shooter;

import edu.wpi.first.wpilibj.Victor;
import frc.robot.core.RobotConstants;

public class ShooterBase{
    private Victor motor1;
    private Victor motor2; 
    public ShooterBase() {
        motor1 = new Victor(RobotConstants.MotorConstants.SHOOTER_MOTOR_PWM1);
        motor2 = new Victor(RobotConstants.MotorConstants.SHOOTER_MOTOR_PWM2);
    }
    public void runLeft(double speed){
        motor1.set(speed);
        
    }
    public void runRight(double speed){
        motor2.set(speed);
    }
    public void runBothMotor(double speed1, double speed2){
        motor1.set(speed1);
        motor2.set(speed2);
    }
    public void trenchShot(){
        motor1.set(1);
        motor2.set(1);
    }
    public void lineShot(){
        motor1.set(.49);
        motor2.set(.49);
    }
    public void stopShooter(){
        motor1.set(0);
        motor2.set(0);
    }

}
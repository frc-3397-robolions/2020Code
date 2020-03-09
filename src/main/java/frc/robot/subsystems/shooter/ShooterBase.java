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
    public void runMotor1(int speed){
        motor1.set(speed);
        
    }
    public void runMotor2(int speed){
        motor2.set(speed);
    }
    public void runBothMotor(int speed1, int speed2){
        motor1.set(speed1);
        motor2.set(speed2);
    }

}
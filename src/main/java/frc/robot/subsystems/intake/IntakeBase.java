package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj.Victor;
import frc.robot.core.RobotConstants;

public class IntakeBase {
    private static Victor motor1;
    private static Victor motor2;

    public IntakeBase() {
        motor1 = new Victor(RobotConstants.PWMConstants.INTAKE_MOTOR_PWM1);
        motor2 = new Victor(RobotConstants.PWMConstants.INTAKE_MOTOR_PWM2);

    }

    public void runMotor1(double speed) {
        motor1.set(speed);
    }

    public void runMotor2(double speed) {
        motor2.set(speed);
    }

    public void runBothMotor(double speed1, double speed2) {
        motor1.set(speed1);
        motor2.set(speed2);

    }

    public static double getMotorSpeed() {
        return motor1.getSpeed();
    }
    

    
}
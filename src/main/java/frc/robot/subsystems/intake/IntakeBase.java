package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj.Victor;
import frc.robot.core.RobotConstants;

public class IntakeBase {
    private static Victor intakeMotor;
    private static Victor elevatorMotor;

    public IntakeBase() {
        intakeMotor = new Victor(RobotConstants.MotorConstants.INTAKE_MOTOR_PWM1);
        elevatorMotor = new Victor(RobotConstants.MotorConstants.INTAKE_MOTOR_PWM2);

    }

    public void runMotor1(double speed) {
        intakeMotor.set(speed);
    }

    public void runMotor2(double speed) {
        elevatorMotor.set(speed);
    }

    public void runBothMotor(double speed1, double speed2) {
        intakeMotor.set(speed1);
        elevatorMotor.set(speed2);

    }
    public void inTake(){
        intakeMotor.set(-0.75);
    }
    public void outTake(){
        intakeMotor.set(0.75);
    }
    public static double getMotorSpeed() {
        return intakeMotor.getSpeed();
    }
    

    
}
package frc.robot.subsystems.climber;

import edu.wpi.first.wpilibj.VictorSP;
import frc.robot.core.RobotConstants;

public class ClimberBase {
    private VictorSP motor1; 
    private VictorSP motor2;
    

    public ClimberBase() {
       motor1 = new VictorSP(RobotConstants.MotorConstants.CLIMBER_MOTOR_PWM1);
       motor2 = new VictorSP(RobotConstants.MotorConstants.CLIMBER_MOTOR_PWM2);
    }

   

    

}


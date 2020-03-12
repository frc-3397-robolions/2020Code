package frc.robot.core;
public final class RobotConstants{

        
    public static final class MotorConstants{
         // Drive PWMs
        public static int LEFT_FRONT_MOTOR_PWM = 3;
        public static int LEFT_REAR_MOTOR_PWM = 0;
        public static int RIGHT_FRONT_MOTOR_PWM = 1;
        public static int RIGHT_REAR_MOTOR_PWM = 2;

        // Drive Encoders
        public static int LEFT_FRONT_MOTOR_PORT1 = 4;
        public static int LEFT_FRONT_MOTOR_PORT2 = 5; 
        public static int LEFT_REAR_MOTOR_PORT1 = 2;
        public static int LEFT_REAR_MOTOR_PORT2 = 3;
        
        public static int RIGHT_FRONT_MOTOR_PORT1 = 6;
        public static int RIGHT_FRONT_MOTOR_PORT2 = 7;
        public static int RIGHT_REAR_MOTOR_PORT1 = 0;
        public static int RIGHT_REAR_MOTOR_PORT2 = 1;

        
       
       

        // Climber PWMs
        public static int CLIMBER_MOTOR_PWM1;
        public static int CLIMBER_MOTOR_PWM2; 

        // Shooter PWMs
        public static int SHOOTER_MOTOR_PWM1 = 6;
        public static int SHOOTER_MOTOR_PWM2 = 7;

        // Intake PWMs
        public static int INTAKE_MOTOR_PWM1 = 8;
        public static int INTAKE_MOTOR_PWM2 = 9;

        // ColorWheel PWM
        public static int COLORWHEEL_MOTOR_PWM;

        



    }

    
    public static final class OIConstants{

        //Control Ports

        public static int XBOX_CONTROLLER_PORT;
        public static int FIGHT_STICK_PORT;

        //Fight Stick 
    
    }
    

}
package frc.robot.subsystems.shooter;

import edu.wpi.first.wpilibj.Victor;

public class ShooterBase{
    private Victor motor1;
    private Victor motor2; 
    public ShooterBase(int port1, int port2) {
        motor1 = new Victor(port1);
        motor2 = new Victor(port2);
    }

}
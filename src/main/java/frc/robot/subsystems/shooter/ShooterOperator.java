package frc.robot.subsystems.shooter;

import edu.wpi.first.wpilibj.Timer;
import frc.robot.controls.OI;

public class ShooterOperator{
    ShooterBase base;
    Timer shooterTimer;
    OI oi;
    public ShooterOperator(){
        base = new ShooterBase();
        shooterTimer = new Timer();
        oi = new OI();
    }
    public void autoRun(){

    }
    public void teleopRun(){
        if(oi.xBox().getRightTrigger() > 0){
            
        }
    }
    public void testRun(){
        
    }


}
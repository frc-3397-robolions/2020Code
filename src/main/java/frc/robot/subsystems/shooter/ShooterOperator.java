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
        if(oi.fightStick().getXButton()){
            base.runBothMotor(.4, .4);
        } else {
            base.runBothMotor(0, 0);
        }
    }
    public void testRun(){
        if(oi.xBox().getRightTrigger() > 0.1){
            
            base.runRight(.5);
        } else {
            base.runRight(0);
        }
        if(oi.xBox().getLeftTrigger() > 0.1){
            base.runLeft(.5);
        } else {
            base.runLeft(0);
        }
    }


}
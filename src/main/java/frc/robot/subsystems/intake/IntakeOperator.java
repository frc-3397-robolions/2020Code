package frc.robot.subsystems.intake;

import frc.robot.controls.OI;

public class IntakeOperator{
    OI oi;
    IntakeBase base;

    public IntakeOperator(){
        oi = new OI();
        base = new IntakeBase();
    }
    
    public void autoRun(){

    }
    public void teleopRun(){
        if(oi.fightStick().getAButton()){
            base.runElevator(-.2);
        } else {
            base.runElevator(0);
        }
    }
    public void testRun(){
        if(oi.xBox().getStartButton()){
            base.runElevator(-.3);
        } else if(oi.xBox().getBackButton()){
            base.runElevator(.3);
        } else {
            base.runElevator(0);
        }
        
    }


}
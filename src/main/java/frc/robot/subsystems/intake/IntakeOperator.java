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
        if(oi.fightStick().getYButton()){
            base.runElevator(-.3);
        } else {
            base.runElevator(0);
        }
        if(oi.xBox().getLeftTrigger() > 0.1){
            base.runElevator(.4);
        } else if (oi.xBox().getRightTrigger() > 0.1){
            base.runElevator(-.4);
        } else {
            base.runElevator(0);
        }
        if(oi.xBox().getAButton()){
            base.runIntake(-.5);
        } else if(oi.xBox().getBButton()){
            base.runIntake(.5);
        } else {
            base.runIntake(0);
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
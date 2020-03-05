package frc.robot.subsystems.drivetrain;

import frc.robot.controls.OI;

public class DriveTrainOperator {
    private OI oi;
    private DriveTrainBase base;
    public DriveTrainOperator(){
        oi = new OI();
        base = new DriveTrainBase();
        
    }
   
    public void autoRun(){

    }
    public void teleopRun(){

    }
    public void testRun(){
    /*
      ====Single Motor Tests=== 
    ~ Xbox Controller -> Motors ~ 
        Button A = Right Rear
        Button B = Right Front
        Button Y = Left Rear
        Button X = Left Front 
    */
        if (oi.xBox().getAButton()){
            base.runRightRear(1);
        } else {
            base.runRightRear(0);
        }
        if (oi.xBox().getBButton()){
            base.runRightFront(1);
         } else {
             base.runRightFront(0);
         }
         
        if (oi.xBox().getYButton()){
            base.runLeftFront(1);
        } else {
            base.runLeftFront(0);
        }
        if (oi.xBox().getXButton()){
            base.runLeftRear(1);
        } else {
            base.runLeftRear(0);
        }
    }
}
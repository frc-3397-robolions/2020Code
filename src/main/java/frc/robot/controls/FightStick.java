package frc.robot.controls;

import edu.wpi.first.wpilibj.Joystick;

public class FightStick {
    private Joystick fightStick;
    public FightStick(int port){
        fightStick = new Joystick(port);
    }

    //Joystick
    public double getVerticalStick(){
        return fightStick.getRawAxis(1);
    }
    public double getHorizontalStick(){
        return fightStick.getRawAxis(0);
    }

    //Triggers
    public double getLeftTrigger(){
        return fightStick.getRawAxis(2);
    }
    public double getRightTrigger(){
        return fightStick.getRawAxis(3);
    }
    //Buttons
    public boolean getXButton(){
        return fightStick.getRawButton(2);
    }
    public boolean getAButton(){
        return fightStick.getRawButton(0);
    }
    public boolean getYButton(){
        return fightStick.getRawButton(3);
    }
    public boolean getBButton(){
        return fightStick.getRawButton(1);
    }
    public boolean getLBButton(){
        return fightStick.getRawButton(4);
    }
    public boolean getRBButton(){
        return fightStick.getRawButton(5);
    }
    public boolean getShareButton(){
        return fightStick.getRawButton(6);
    }
    public boolean getOptionsButton(){
        return fightStick.getRawButton(7);
    }
    public boolean getSLButton(){
        return fightStick.getRawButton(8);
    }
    public boolean getSRButton(){
        return fightStick.getRawButton(9);
    }

    

    
}
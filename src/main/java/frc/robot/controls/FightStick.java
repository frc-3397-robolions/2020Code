package frc.robot.controls;

import edu.wpi.first.wpilibj.Joystick;

public class FightStick {
    private Joystick fightStick;
    public FightStick(int port){
        fightStick = new Joystick(port);
    }
    public double getFSVerticalStick(){
        return fightStick.getRawAxis(1);
    }
    public double getFSHorizontalStick(){
        return fightStick.getRawAxis(0);
    }
    public boolean getFSXButton(){
        return fightStick.getRawButton(2);
    }
    public boolean getFSAButton(){
        return fightStick.getRawButton(0);
    }
    public boolean getFSYButton(){
        return fightStick.getRawButton(3);
    }
    public boolean getFSBButton(){
        return fightStick.getRawButton(1);
    }
    

    
}
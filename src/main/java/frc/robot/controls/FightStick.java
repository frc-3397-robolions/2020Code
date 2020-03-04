package frc.robot.controls;

import edu.wpi.first.wpilibj.Joystick;

public class FightStick {
    private Joystick fightStick;
    public FightStick(int port){
        fightStick = new Joystick(port);
    }


    
}
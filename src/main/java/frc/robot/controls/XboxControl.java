package frc.robot.controls;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.GenericHID.RumbleType;

public class XboxControl{

    private XboxController xboxController;

    public XboxControl(int port){
        xboxController = new XboxController(port);
    }
    
    // Button X
    public boolean getXButton(){
        return xboxController.getXButton();
    }
    public boolean getXButtonPressed(){
        return xboxController.getXButtonPressed();
    }
    public boolean getXButtonReleased(){
        return xboxController.getXButtonReleased();
    }

    // Button Y
    public boolean getYButton(){
        return xboxController.getYButton();
    }
    public boolean getYButtonPressed(){
        return xboxController.getYButtonPressed();
    }
    public boolean getYButtonReleased(){
        return xboxController.getYButtonReleased();
    }

    // Button B
    public boolean getBButton(){
        return xboxController.getBButton();
    }
    public boolean getBButtonPressed(){
        return xboxController.getBButtonPressed();
    }
    public boolean getBButtonReleased(){
        return xboxController.getBButtonReleased();
    }

    // Button A
    public boolean getAButton(){
        return xboxController.getAButton();
    }
    public boolean getAButtonPressed(){
        return xboxController.getAButtonPressed();
    }
    public boolean getAButtonReleased(){
        return xboxController.getAButtonReleased();
    }

    //Start Button
    public boolean getStartButton(){
        return xboxController.getStartButton();
    }
    public boolean getStartButtonPressed(){
        return xboxController.getStartButtonPressed();
    }
    public boolean getStartButtonReleased(){
        return xboxController.getStartButtonReleased();
    }

    //Back Button
    public boolean getBackButton(){
        return xboxController.getBackButton();
    }
    public boolean getBackButtonPressed(){
        return xboxController.getBackButtonPressed();
    }
    public boolean getBackButtonReleased(){
        return xboxController.getBackButtonReleased();
        
    }

    //Bumpers
    public boolean getLeftBumper(){
        return xboxController.getBumper(Hand.kLeft);
    }
    public boolean getLeftBumperPressed(){
        return xboxController.getBumperPressed(Hand.kLeft);
    }
    public boolean getLeftBumperReleased(){
        return xboxController.getBumperReleased(Hand.kLeft);
    }
    public boolean getRightBumper(){
        return xboxController.getBumper(Hand.kRight);
    }
    public boolean getRightBumperPressed(){
        return xboxController.getBumperPressed(Hand.kRight);
    }
    public boolean getRightBumperReleased(){
        return xboxController.getBumperReleased(Hand.kRight);
    } 

    //Stick Buttons
    public boolean getLeftStickButton(){
        return xboxController.getStickButton(Hand.kLeft);
    }
    public boolean getLeftStickButtonPressed(){
        return xboxController.getStickButton(Hand.kLeft);
    }
    public boolean getLeftStickButtonReleased(){
        return xboxController.getStickButton(Hand.kLeft);
    }

    // Triggers
    public double getLeftTrigger(){
        return xboxController.getTriggerAxis(Hand.kLeft); 
    }
    public double getRightTrigger(){
        return xboxController.getTriggerAxis(Hand.kRight);
    }

    // JoySticks
    public double getLeftJoystickY(){
        return xboxController.getRawAxis(1);
    }
    public double getLeftJoystickX(){
        return xboxController.getRawAxis(0);
    }
    public double getRightJoystickY(){
        return xboxController.getRawAxis(5);
    }
    public double getRightJoystickX(){
        return xboxController.getRawAxis(4);
    }

    // Rumble 
    public void rumble(int value){
        xboxController.setRumble(RumbleType.kLeftRumble, value);
        xboxController.setRumble(RumbleType.kRightRumble, value);
    }



    
    
}

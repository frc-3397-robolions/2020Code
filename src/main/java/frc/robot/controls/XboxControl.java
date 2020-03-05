package frc.robot.controls;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;

public class XboxControl{
    private XboxController xboxController;
    public XboxControl(int port){
        xboxController = new XboxController(port);
    }
    
    public boolean getXButton() {
        
        return xboxController.getXButton();
    }
    public boolean getYButton() {
        return xboxController.getYButton();
    }
    public boolean getBButton(){
        return xboxController.getBButton();
    }
    public boolean getAButton(){
        return xboxController.getAButton();
    }
    public boolean getAPressed(){
        return xboxController.getAButtonPressed();
    }
    public double getLeftTrigger(){
        return xboxController.getTriggerAxis(Hand.kLeft);
        
    }
    public double getRightTrigger(){
        return xboxController.getTriggerAxis(Hand.kRight);
    }
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
    
    
}

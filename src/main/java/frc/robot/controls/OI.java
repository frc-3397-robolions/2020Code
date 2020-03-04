// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package frc.robot.controls;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
public XboxController xboxController;
public Joystick fightStick;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

fightStick = new Joystick(1);

xboxController = new XboxController(0);



        // SmartDashboard Buttons
       

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
public XboxController getXboxController() {
    return xboxController;
    }

public Joystick getFightStick() {
    return fightStick;
    }

// Xbox Controls
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




// FightStick Controls 
public double getFSVerticalStick(){
    return fightStick.getRawAxis(1);
}
public double getFSHorizontalStick(){
    return fightStick.getRawAxis(0);
}
public boolean getFSXButton(){
    return fightStick.getRawButtonPressed(2);
}
public boolean getFSAButton(){
    return fightStick.getRawButtonPressed(0);
}
public boolean getFSYButton(){
    return fightStick.getRawButtonPressed(3);
}
public boolean getFSBButton(){
    return fightStick.getRawButtonPressed(1);
}

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}



package frc.robot.core;

import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import frc.robot.subsystems.drivetrain.DriveTrainBase;

public class SmartDB{
    private DriveTrainBase dTB;
    Sendable runLeftFront = new SendableChooser<>(){
    
        
    };
    public SmartDB(){

        dTB = new DriveTrainBase();
    }
    protected void execute(){
        
    }
}
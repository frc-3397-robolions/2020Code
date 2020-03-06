package frc.robot.core;

import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.smartdashboard.SendableBuilder;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.drivetrain.DriveTrainBase;
import frc.robot.subsystems.drivetrain.DriveTrainOperator;

public class SmartDB{
    private DriveTrainBase dTB;
    Sendable runLeftFront = new SendableChooser<>(){
    
        
    };
    public SmartDB(){

        dTB = new DriveTrainBase();
    }
    protected void execute(){
        SmartDashboard.putData("LeftFrontMotor", dTB.runLeftFront(1));
    }
}
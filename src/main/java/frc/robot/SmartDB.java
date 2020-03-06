package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.drivetrain.DriveTrainBase;
import frc.robot.subsystems.drivetrain.DriveTrainOperator;

public class SmartDB{
    private DriveTrainBase dTB;
    public SmartDB(){
        dTB = new DriveTrainBase();
    }
    protected void execute(){
        SmartDashboard.putData("LeftFrontMotor", dTB.runLeftFront(1));
    }
}
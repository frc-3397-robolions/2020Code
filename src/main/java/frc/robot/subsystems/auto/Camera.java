package frc.robot.subsystems.auto;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Camera extends Subsystem {
    NetworkTableEntry centerXEntry;
    public Camera(){
        NetworkTableInstance  inst = NetworkTableInstance.getDefault();
        NetworkTable table = inst.getTable("pi");
        centerXEntry = table.getEntry("centerX");
        
    }

    @Override
    protected void initDefaultCommand() {
        // TODO Auto-generated method stub

    }
}
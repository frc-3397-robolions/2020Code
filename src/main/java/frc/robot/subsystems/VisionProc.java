package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.command.Subsystem;

public class VisionProc extends Subsystem {
    NetworkTableEntry centerXEntry;
    public VisionProc(){
        NetworkTableInstance  inst = NetworkTableInstance.getDefault();
        NetworkTable table = inst.getTable("pi");
        centerXEntry = table.getEntry("centerX");
    }

    @Override
    protected void initDefaultCommand() {
        // TODO Auto-generated method stub

    }
}
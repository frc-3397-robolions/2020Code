package frc.robot.subsystems.auto;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class Camera {
    NetworkTableEntry centerXEntry;
    public Camera(){
        NetworkTableInstance  inst = NetworkTableInstance.getDefault();
        NetworkTable table = inst.getTable("pi");
        centerXEntry = table.getEntry("centerX");
        
    }

    
}
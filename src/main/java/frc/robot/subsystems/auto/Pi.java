package frc.robot.subsystems.auto;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class Pi {
    NetworkTableEntry centerXEntry;
    NetworkTableInstance inst;
    NetworkTable table;
    
    public Pi(){
        inst = NetworkTableInstance.getDefault();
        table = inst.getTable("pi");
        centerXEntry = table.getEntry("centerX");
        
    }
    public double getCenterX(){
        return centerXEntry.getDouble(0);
    }
    public double getArea(){
        return 0;
    }

    
}
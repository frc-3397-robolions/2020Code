package frc.robot;

import edu.wpi.first.wpilibj.PowerDistributionPanel;

public class PDP{
    PowerDistributionPanel pdp;
    public PDP(){
        pdp = new PowerDistributionPanel();
        
    }
    public double getBatteryLevel(){
        return pdp.getTotalPower();
    }
    
}
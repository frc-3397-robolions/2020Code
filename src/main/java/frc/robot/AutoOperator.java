package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class AutoOperator {
    private SendableChooser<String> auto_chooser = new SendableChooser<>();
    private static final String kRightAuto = "Right Auto";
    private static final String kLeftAuto = "Left Auto";
    private static final String kMiddleAuto = "Middle Auto"; 
    private String m_autoSelected;
    public AutoOperator(){
        auto_chooser.setDefaultOption("Middle Auto", kMiddleAuto);
        auto_chooser.addOption("Right Auto", kRightAuto);
        auto_chooser.addOption("Left Auto", kLeftAuto);
        SmartDashboard.putData("Auto Selection", auto_chooser);
    }
    public void autoInit(){
        m_autoSelected = auto_chooser.getSelected();
       
        System.out.println("Auto selected: " + m_autoSelected);
        
       
     }
    
    public void run(){
        switch (m_autoSelected){
 
            case "Middle Auto":
            


            case "Left Auto":
 



            case "Right Auto":
 



        }
    }

}
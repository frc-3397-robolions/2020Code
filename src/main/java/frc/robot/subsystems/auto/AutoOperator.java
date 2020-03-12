package frc.robot.subsystems.auto;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.shooter.ShooterBase;

public class AutoOperator {
    private SendableChooser<String> auto_chooser = new SendableChooser<>();
    private static final String kRightAuto = "Right Auto";
    private static final String kLeftAuto = "Left Auto";
    private static final String kMiddleAuto = "Middle Auto"; 
    private ShooterBase sBase;
    private String m_autoSelected;
    private Timer autoTimer;
    private boolean STAGE1;
    private boolean STAGE2; 
    public AutoOperator(){
        auto_chooser.setDefaultOption("Middle Auto", kMiddleAuto);
        auto_chooser.addOption("Right Auto", kRightAuto);
        auto_chooser.addOption("Left Auto", kLeftAuto);
        SmartDashboard.putData("Auto Selection", auto_chooser);

    }
    public void autoInit(){
        STAGE1 = true;
        STAGE2 = false;
        m_autoSelected = auto_chooser.getSelected();
        autoTimer = new Timer();
        sBase = new ShooterBase();
        autoTimer.start();

        System.out.println("Auto selected: " + m_autoSelected);
        
       
     }
    
    public void run(){
        if(STAGE1){
            sBase.lineShot();
            if(autoTimer.get() > 5 && autoTimer.get() < 10){

            }
        }
        if(STAGE2){
            
        }
       

        
        // switch (m_autoSelected){
 
        //     case "Middle Auto":
            
            


        //     case "Left Auto":
 



        //     case "Right Auto":
 



        // }
    }

}
package frc.robot.core;

import edu.wpi.first.hal.FRCNetComm.tInstances;
import edu.wpi.first.hal.FRCNetComm.tResourceType;
import edu.wpi.first.hal.HAL;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.controls.OI;
import frc.robot.subsystems.auto.AutoOperator;
import frc.robot.subsystems.climber.ClimberOperator;
import frc.robot.subsystems.colorwheel.ColorWheelOperator;
import frc.robot.subsystems.drivetrain.DriveTrainOperator;
import frc.robot.subsystems.intake.IntakeOperator;
import frc.robot.subsystems.shooter.ShooterOperator;

public class Robot extends TimedRobot {

    private OI oi;
    private DriveTrainOperator driveTrain;
    private IntakeOperator intake;
    private ShooterOperator shooter;
    private ClimberOperator climber;
    private PowerDistributionPanel pdp;
    private ColorWheelOperator cWheel;
    private AutoOperator auto;


    @Override
    public void robotInit() {

        driveTrain = new DriveTrainOperator();
        intake = new IntakeOperator();
        shooter = new ShooterOperator();
        // climber = new ClimberOperator();
        // cWheel = new ColorWheelOperator();
        auto = new AutoOperator();
        oi = new OI();
        pdp = new PowerDistributionPanel();
        HAL.report(tResourceType.kResourceType_Framework, tInstances.kFramework_RobotBuilder);

    }

    @Override
    public void disabledInit() {

    }

    @Override
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void autonomousInit() {
        auto.autoInit();
    }

    @Override
    public void autonomousPeriodic() {
        auto.run();
        Scheduler.getInstance().run();

    }

    @Override
    public void teleopInit() {
      

    }


    @Override
    public void teleopPeriodic() {
        driveTrain.teleopRun();
        intake.teleopRun();
        shooter.teleopRun();
        // climber.teleopRun();
        // cWheel.teleopRun();
        
    }

    @Override
    public void testPeriodic() {
        driveTrain.testRun();
        intake.testRun();
        shooter.testRun();
        // climber.testRun();
        // cWheel.testRun();

    }

}

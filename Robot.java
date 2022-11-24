package frc.robot;
 
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
 
public class Robot extends TimedRobot {
 private DifferentialDrive m_myRobot;
 
 private final MotorController m_leftMotor = new PWMSparkMax(0);
 private final MotorController m_rightMotor = new PWMSparkMax(1);
 
 @Override
 public void robotInit() {
   m_rightMotor.setInverted(true);
 
   m_myRobot = new DifferentialDrive(m_leftMotor, m_rightMotor);
  } 
 
 @Override
 public void autonomousPeriodic() {
   m_myRobot.tankDrive(-1.0, 1.0);
 
  }
}

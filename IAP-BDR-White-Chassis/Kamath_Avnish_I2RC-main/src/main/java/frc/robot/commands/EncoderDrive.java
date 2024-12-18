package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;

public class EncoderDrive extends Command{
    Drivetrain dt;
    double setpoint;

    public EncoderDrive(Drivetrain dt, double setpoint){
    
    this.dt = dt;
    this.setpoint = setpoint;
    addRequirements(dt);

}

@Override
public void initialize(){
    dt.tankDrive(0.0, 0.0);

}
@Override
public void execute(){
dt.tankDrive(0.8, 0.8);

}
@Override
public void end(boolean interrupted){
dt.tankDrive(0.0, 0.0);
}
@Override
public boolean isFinished(){
if(dt.getMeters() >= setpoint) {

    return true;
} else { 
    return false;



}
}
}
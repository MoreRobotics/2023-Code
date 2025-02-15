// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;


import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.LEDs;

public class PurpleLED extends CommandBase {

    LEDs leds; 
    /** Creates a new DriveForward. */
    public PurpleLED(LEDs leds) {
      // Use addRequirements() here to declare subsystem dependencies.
      this.leds = leds;
      addRequirements(leds);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
      leds.setColor(120,0,120);
      SmartDashboard.putBoolean("isDefault", false);
      SmartDashboard.putBoolean("isPurple", true);
      SmartDashboard.putBoolean("isYellow", false);
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {}

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {}

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }
}   

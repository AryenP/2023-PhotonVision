// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.commands.PhotonInfo;
import frc.robot.subsystems.PhotonVision;

public class RobotContainer {
 
 
  public RobotContainer() {
    
    //pv.setDefaultCommand(new DistanceFromTag());
    configureBindings();
  }

  private void configureBindings(){
     
  } 


  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }


}

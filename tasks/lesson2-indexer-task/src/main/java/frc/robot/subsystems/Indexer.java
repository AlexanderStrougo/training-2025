// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Indexer extends SubsystemBase {
  private boolean indexing;

  /** Creates a new Indexer subsystem. */
  public Indexer() {}

  /** Starts the indexing process. */
  public void startIndexing() {
    indexing = true;
  }

  /** Stops the indexing process. */
  public void stopIndexing() {
    indexing = false;
  }

  /**
   * Returns whether the indexer is currently running.
   *
   * @return true if indexing, false otherwise
   */
  public boolean isIndexing() {
    return indexing;
  }

  // TODO: Implement indexForSeconds() command factory
  public Command indexForSeconds(double seconds) {
    return Commands.runOnce(() -> startIndexing(), this)
      .andThen(Commands.waitSeconds(seconds))
      .andThen(Commands.runOnce(() -> stopIndexing()));
  }

  @Override
  public void periodic() {
    // This method will always be called once per scheduler run
    System.out.println("Indexer is " + (isIndexing() ? "running" : "idle"));
  }

  @Override
  public void simulationPeriodic() {
    // This method will always be called once per scheduler run during simulation
  }
}

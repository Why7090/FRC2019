// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6872.FRC2019.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc6872.FRC2019.Robot;
import org.usfirst.frc6872.FRC2019.subsystems.Tower;

/**
 *
 */
public class ControlWinch extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public ControlWinch() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        // if (Robot.tower.isEnabled()) {
        //     int pov = Robot.oi.gamepad.getPOV();
            
        //     switch (pov) {
        //         case 0: // up
        //             Robot.tower.setSetpoint(Tower.Disk3);
        //             break;
        //         case 90: // right
        //             Robot.tower.setSetpoint(Tower.Disk2);
        //             break;
        //         case 180: // down
        //             Robot.tower.setSetpoint(Tower.Disk1);
        //             break;                    
        //         case 270: // left
        //             Robot.tower.setSetpoint(Tower.DiskLoad);
        //             break;
        //     }
        // }
        // else {
        //     double speed = -Robot.oi.gamepad.getRawAxis(5);
        //     Robot.tower.moveManually(speed);
        // }
        double speed = -Robot.oi.gamepad2.getRawAxis(5);
        Robot.tower.moveManually(speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
        Robot.tower.stopMotor();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
        Robot.tower.stopMotor();
    }
}

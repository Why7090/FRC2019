// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc6872.FRC2019.subsystems;

import org.usfirst.frc6872.FRC2019.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS
    public static final double turnRate = 0.7;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private VictorSP frontLeft;
    private VictorSP rearLeft;
    private SpeedControllerGroup left;
    private VictorSP frontRight;
    private PWMVictorSPX rearRight;
    private SpeedControllerGroup right;
    private DifferentialDrive drive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public DriveTrain() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        frontLeft = new VictorSP(0);
        addChild("Front Left",frontLeft);
        frontLeft.setInverted(false);
        
        rearLeft = new VictorSP(1);
        addChild("Rear Left",rearLeft);
        rearLeft.setInverted(false);
        
        left = new SpeedControllerGroup(frontLeft, rearLeft  );
        addChild("Left",left);
        
        
        frontRight = new VictorSP(2);
        addChild("Front Right",frontRight);
        frontRight.setInverted(false);
        
        rearRight = new PWMVictorSPX(3);
        addChild("Rear Right",rearRight);
        rearRight.setInverted(false);
        
        right = new SpeedControllerGroup(frontRight, rearRight  );
        addChild("Right",right);
        
        
        drive = new DifferentialDrive(left, right);
        addChild("Drive",drive);
        drive.setSafetyEnabled(true);
        drive.setExpiration(0.1);
        drive.setMaxOutput(1.0);

        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new DriveWithJoysticks());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    public void drive(double y, double x) {
        drive.curvatureDrive(y, x * turnRate, true);
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

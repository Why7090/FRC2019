// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6872.FRC2019;

import org.usfirst.frc6872.FRC2019.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc6872.FRC2019.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton disablePIDButton;
    public JoystickButton loadDiskButton;
    public JoystickButton unloadDiskButton;
    public JoystickButton intakePullButton;
    public JoystickButton intakePushButton;
    public JoystickButton pushTowerButton;
    public JoystickButton pullTowerButton;
    public Joystick gamepad2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        SmartDashboard.putNumber("Drive Speed Factor", 0.5);
        SmartDashboard.setPersistent("Drive Speed Factor");

        SmartDashboard.putNumber("Turn Factor", 0.5);
        SmartDashboard.setPersistent("Turn Factor");

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        gamepad2 = new Joystick(0);
        
        pullTowerButton = new JoystickButton(gamepad2, 1);
        pullTowerButton.whenPressed(new SetPiston(false));
        pushTowerButton = new JoystickButton(gamepad2, 4);
        pushTowerButton.whenPressed(new SetPiston(true));
        intakePushButton = new JoystickButton(gamepad2, 3);
        intakePushButton.whileHeld(new SetIntake(true));
        intakePullButton = new JoystickButton(gamepad2, 2);
        intakePullButton.whileHeld(new SetIntake(false));
        unloadDiskButton = new JoystickButton(gamepad2, 8);
        unloadDiskButton.whenPressed(new MoveWinchTimed(Tower.unloadDiskDuration));
        loadDiskButton = new JoystickButton(gamepad2, 6);
        loadDiskButton.whenPressed(new MoveWinchTimed(Tower.loadDiskDuration));
        disablePIDButton = new JoystickButton(gamepad2, 9);
        disablePIDButton.whenPressed(new DisableTowerPID());


        // SmartDashboard Buttons
        SmartDashboard.putData("Charge Pneumatics", new ChargePneumatics());
        SmartDashboard.putData("Disable Tower PID", new DisableTowerPID());
        SmartDashboard.putData("Move Winch Timed", new MoveWinchTimed());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getGamepad2() {
        return gamepad2;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}


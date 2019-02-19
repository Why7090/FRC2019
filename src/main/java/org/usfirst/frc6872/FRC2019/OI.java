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
    public JoystickButton pushTowerButton;
    public JoystickButton pullTowerButton;
    public JoystickButton frontLiftButton;
    public JoystickButton rearLiftButton;
    public JoystickButton loadDiskButton;
    public JoystickButton disablePIDButton;
    public JoystickButton intakePullButton;
    public JoystickButton intakePushButton;
    public Joystick joystick;
    public JoystickButton ballLevel1Button;
    public JoystickButton ballLevel2Button;
    public JoystickButton ballLevel3Button;
    public JoystickButton ballExchangeButton;
    public JoystickButton towerChassisButton;
    public JoystickButton towerGroundButton;
    public JoystickButton disablePIDButton2;
    public Joystick gamepad;
    public JoystickButton frontLiftButton2;
    public JoystickButton rearLiftButton2;
    public JoystickButton disablePIDButton3;
    public JoystickButton loadDiskButton2;
    public JoystickButton intakePullButton2;
    public JoystickButton intakePushButton2;
    public JoystickButton togglePistonButton;
    public Joystick gamepad2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        gamepad2 = new Joystick(2);
        
        togglePistonButton = new JoystickButton(gamepad2, 1);
        togglePistonButton.whileHeld(new TogglePiston());
        intakePushButton2 = new JoystickButton(gamepad2, 3);
        intakePushButton2.whenPressed(new SetIntake(true));
        intakePullButton2 = new JoystickButton(gamepad2, 2);
        intakePullButton2.whenPressed(new SetIntake(false));
        loadDiskButton2 = new JoystickButton(gamepad2, 4);
        loadDiskButton2.whenPressed(new LoadDisk());
        disablePIDButton3 = new JoystickButton(gamepad2, 9);
        disablePIDButton3.whileHeld(new DisableTowerPID());
        rearLiftButton2 = new JoystickButton(gamepad2, 6);
        rearLiftButton2.whenPressed(new ToggleRearLift());
        frontLiftButton2 = new JoystickButton(gamepad2, 5);
        frontLiftButton2.whenPressed(new ToggleFrontLift());
        gamepad = new Joystick(1);
        
        disablePIDButton2 = new JoystickButton(gamepad, 9);
        disablePIDButton2.whenPressed(new DisableTowerPID());
        towerGroundButton = new JoystickButton(gamepad, 8);
        towerGroundButton.whenPressed(new SetLevel(Tower.Ground));
        towerChassisButton = new JoystickButton(gamepad, 6);
        towerChassisButton.whenPressed(new SetLevel(Tower.Robot));
        ballExchangeButton = new JoystickButton(gamepad, 3);
        ballExchangeButton.whenPressed(new SetLevel(Tower.BallLoad));
        ballLevel3Button = new JoystickButton(gamepad, 4);
        ballLevel3Button.whenPressed(new SetLevel(Tower.Ball3));
        ballLevel2Button = new JoystickButton(gamepad, 1);
        ballLevel2Button.whenPressed(new SetLevel(Tower.Ball2));
        ballLevel1Button = new JoystickButton(gamepad, 2);
        ballLevel1Button.whenPressed(new SetLevel(Tower.Ball1));
        joystick = new Joystick(0);
        
        intakePushButton = new JoystickButton(joystick, 5);
        intakePushButton.whileHeld(new SetIntake(true));
        intakePullButton = new JoystickButton(joystick, 3);
        intakePullButton.whileHeld(new SetIntake(false));
        disablePIDButton = new JoystickButton(joystick, 2);
        disablePIDButton.whenPressed(new DisableTowerPID());
        loadDiskButton = new JoystickButton(joystick, 1);
        loadDiskButton.whenPressed(new LoadDisk());
        rearLiftButton = new JoystickButton(joystick, 12);
        rearLiftButton.whenPressed(new ToggleRearLift());
        frontLiftButton = new JoystickButton(joystick, 10);
        frontLiftButton.whenPressed(new ToggleFrontLift());
        pullTowerButton = new JoystickButton(joystick, 11);
        pullTowerButton.whenPressed(new SetPiston(false));
        pushTowerButton = new JoystickButton(joystick, 9);
        pushTowerButton.whenPressed(new SetPiston(true));


        // SmartDashboard Buttons
        SmartDashboard.putData("Charge Pneumatics", new ChargePneumatics());
        SmartDashboard.putData("Initialize Tower", new InitializeTower());
        SmartDashboard.putData("Disable Tower PID", new DisableTowerPID());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        SmartDashboard.putNumber("Drive Speed Factor", 1);
        SmartDashboard.setPersistent("Drive Speed Factor");

        SmartDashboard.putNumber("Turn Factor", 0.7);
        SmartDashboard.setPersistent("Turn Factor");
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick() {
        return joystick;
    }

    public Joystick getGamepad() {
        return gamepad;
    }

    public Joystick getGamepad2() {
        return gamepad2;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}


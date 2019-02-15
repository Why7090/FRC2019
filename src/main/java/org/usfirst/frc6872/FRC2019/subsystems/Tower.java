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

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.VictorSP;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/**
 *
 */
public class Tower extends PIDSubsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS
    public static final double Ground = 0.5;
    public static final double Robot = 1;
    public static final double BallLoad = 2;
    public static final double Ball1 = 1;
    public static final double Ball2 = 2;
    public static final double Ball3 = 3;
    public static final double DiskLoad = 1;
    public static final double Disk1 = 1;
    public static final double Disk2 = 2;
    public static final double Disk3 = 3;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    private boolean isPistonExtended = false;

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private VictorSP winch;
    private DoubleSolenoid solenoid;
    private Ultrasonic receiver;
    private Ultrasonic transmitter;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    private double averageHeight = 0;
    private double smooth = 2.0 / (30 + 1);
    private long counter = 0;

    public void setPiston(boolean extended) {
        solenoid.set(extended ? Value.kForward : Value.kReverse);
        isPistonExtended = extended;
    }

    public boolean getPistonState() {
        //return solenoid.get() == Value.kForward;
        return isPistonExtended;
    }

    // Initialize your subsystem here
    public Tower() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PID
        super("Tower", 0.001, 0.001, 0.005);
        setAbsoluteTolerance(0.2);
        getPIDController().setContinuous(false);
        getPIDController().setName("Tower", "PIDSubsystem Controller");
        LiveWindow.add(getPIDController());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PID
        
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        winch = new VictorSP(6);
        addChild("Winch",winch);
        winch.setInverted(false);
        
        solenoid = new DoubleSolenoid(0, 2, 1);
        addChild("Solenoid",solenoid);
        
        
        receiver = new Ultrasonic(0, 1);
        addChild("Receiver",receiver);
        
        
        transmitter = new Ultrasonic(2, 3);
        addChild("Transmitter",transmitter);
        
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        solenoid.set(isPistonExtended ? Value.kForward : Value.kReverse);

        receiver.setAutomaticMode(true);
        transmitter.setAutomaticMode(true);


        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
    }

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
    /*
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SOURCE
        return receiver.pidGet();

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SOURCE
    */
        return averageHeight;
    }

    @Override
    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=OUTPUT
        winch.pidWrite(output);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=OUTPUT
    }

    @Override
    public void periodic() {
        counter++;
        double height = receiver.getRangeMM();
        averageHeight = averageHeight * (smooth / counter) + height * (1 - smooth / counter);
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

}

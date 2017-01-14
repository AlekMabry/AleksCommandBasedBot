// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6190.AleksCommandBasedBot;

import java.net.DatagramSocket;
import java.net.SocketException;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainleftCIM;
    public static SpeedController driveTrainrightCIM;
    public static RobotDrive driveTrainDriveBase;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    public static DatagramSocket serverSocket;
    
    public static ADXRS450_Gyro SPIGyro;

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainleftCIM = new Victor(0);
        LiveWindow.addActuator("DriveTrain", "leftCIM", (Victor) driveTrainleftCIM);
        
        driveTrainrightCIM = new Victor(1);
        LiveWindow.addActuator("DriveTrain", "rightCIM", (Victor) driveTrainrightCIM);
        
        driveTrainDriveBase = new RobotDrive(driveTrainleftCIM, driveTrainrightCIM);
        
        driveTrainDriveBase.setSafetyEnabled(true);
        driveTrainDriveBase.setExpiration(0.1);
        driveTrainDriveBase.setSensitivity(0.5);
        driveTrainDriveBase.setMaxOutput(1.0);


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        SPIGyro = new ADXRS450_Gyro();
        
        try {
			serverSocket = new DatagramSocket(9876);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
}

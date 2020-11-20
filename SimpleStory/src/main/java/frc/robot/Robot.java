/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import java.util.ArrayList;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;



import frc.robot.storyparts.JulianStory;


import frc.robot.storyparts.EthanStoryPart;

import frc.robot.storyparts.JacobStoryPart;



//import frc.robot.storyparts.MrZStoryPart;
import frc.robot.storyparts.SamarthStoryPart;



//import frc.robot.storyparts.MrZStoryPart;
import frc.robot.storyparts.MarcusStoryPart;
 

// MarcusStoryPart
//import frc.robot.storyparts.MrZStoryPart;
import frc.robot.storyparts.MarcusStoryPart;





//import frc.robot.storyparts.MrZStoryPart;
import frc.robot.storyparts.MarcusStoryPart;
import frc.robot.storyparts.MrZPart2StoryPart;

//import frc.robot.storyparts.MrZStoryPart;
import frc.robot.storyparts.JoeyPStoryPart;
import frc.robot.storyparts.LucasStoryPart;
import frc.robot.storyparts.MrZStoryPartClass;

import frc.robot.storyparts.Sanjanastorypartclass;


import frc.robot.storyparts.SravaniStoryPart;
import frc.robot.storyparts.SamarthStoryPart;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends TimedRobot {
  private final DifferentialDrive m_robotDrive
      = new DifferentialDrive(new PWMVictorSPX(0), new PWMVictorSPX(1));
  private final Joystick m_stick = new Joystick(0);
  private final Timer m_timer = new Timer();
  private final ArrayList<StoryPart> storyParts = new ArrayList<>();

  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {
    buildStoryParts();
  }

  /**
   * EXAMPLE
   */
  private void buildStoryParts() {
    // make sure we add the story parts to our ArrayList


    storyParts.add(new JulianStory());


    storyParts.add(new SamarthStoryPart());



    storyParts.add(new EthanStoryPart());

    storyParts.add(new LucasStoryPart());
    //storyParts.add(new MrZStoryPart());

    //storyParts.add(new MrZStoryPart());


    storyParts.add(new MarcusStoryPart());



    storyParts.add(new MarcusStoryPart());
// MarcusStoryPart
    storyParts.add(new MarcusStoryPart());

// JoeyPStoryParts

    storyParts.add(new JoeyPStoryPart());

    storyParts.add(new MrZStoryPartClass());


    storyParts.add(new Sanjanastorypartclass());

    storyParts.add(new SravaniStoryPart());
    storyParts.add(new MarcusStoryPart());

    storyParts.add(new JoeyPStoryPart());

    storyParts.add(new MrZStoryPartClass());
    storyParts.add(new MrZPart2StoryPart());
// JacobStoryPart
    storyParts.add(new JacobStoryPart());


  }

  /**
   * This function is run once each time the robot enters autonomous mode.
   */
  @Override
  public void autonomousInit() {
    m_timer.reset();
    m_timer.start();
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
    // Drive for 2 seconds
    if (m_timer.get() < 2.0) {
      m_robotDrive.arcadeDrive(0.5, 0.0); // drive forwards half speed
    } else {
      m_robotDrive.stopMotor(); // stop robot
    }
  }

  /**
   * This function is called once each time the robot enters teleoperated mode.
   */
  @Override
  public void teleopInit() {
  }

  /**
   * This function is called periodically during teleoperated mode.
   */
  @Override
  public void teleopPeriodic() {
    m_robotDrive.arcadeDrive(m_stick.getY(), m_stick.getX());
  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
    // StoryPart: iterate over the ArrayList, dumping each part of the story to the console.
    // This runs lots when the Test mode is enabled
    System.out.println();
    System.out.println("-------------------------------------");
    for (int i = 0; i < storyParts.size(); i ++) {
      System.out.println(storyParts.get(i).getMyPart());
    }
    System.out.println("-------------------------------------");
    System.out.println();
  }
}

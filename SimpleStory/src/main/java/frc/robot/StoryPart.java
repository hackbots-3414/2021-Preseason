/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * Simple interface to allow different implementations of StoryPart.
 * The important thing is, an implementing class supply a method, getMyPart(), 
 * that returns a String for the story.
 */
public interface StoryPart {
    /**
     * @return the text for this part of the story
     */
    String getMyPart();
}

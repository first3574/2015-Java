package org.usfirst.frc.team2465.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.buttons.Button;
import org.usfirst.frc.team2465.robot.*;

public class JoystickTrigger extends Button {
	GenericHID m_joystick;
    int m_axisNumber;
    int m_axisSide;

    /**
     * Create a joystick button for triggering commands
     *
     * @param joystick The GenericHID object that has the button (e.g. Joystick,
     * KinectStick, etc)
     * }
     */
    public JoystickTrigger(GenericHID joystick, Axis axis, AxisSide side) {
        m_joystick = joystick;
        m_axisNumber = axis.value;
        m_axisSide = side.value;
    }
    
    /**
     * Gets the value of the joystick button
     * @return The value of the joystick button
     */
    public boolean get() {
        
        if (m_joystick.getRawAxis(m_axisNumber) >= 0.5 && m_axisSide == AxisSide.left.value) {
            return true;
        } else if (m_joystick.getRawAxis(m_axisNumber) <= -0.5 && m_axisSide == AxisSide.right.value){
            return true;
        } else {
            return false;
        }
    }
    
    public double getValue() {
    	
    	return m_joystick.getRawAxis(m_axisNumber);
    }
}

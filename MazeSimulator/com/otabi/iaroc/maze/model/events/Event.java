package com.otabi.iaroc.maze.model.events;

import com.otabi.iaroc.maze.model.Robot;
import com.otabi.iaroc.maze.model.states.State;

public abstract class Event
{
	protected Robot robot;

	public Event(Robot robot)
	{
		this.robot = robot;
	}
	
	public abstract State execute();
}

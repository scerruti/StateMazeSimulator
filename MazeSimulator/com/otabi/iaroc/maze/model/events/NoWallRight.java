package com.otabi.iaroc.maze.model.events;

import com.otabi.iaroc.maze.model.Robot;
import com.otabi.iaroc.maze.model.states.State;
import com.otabi.iaroc.maze.model.states.TurnRight;

public class NoWallRight extends Event
{

	public NoWallRight(Robot robot)
	{
		super(robot);
	}

	@Override
	public State execute()
	{
		return new TurnRight(robot);
	}

}

package com.otabi.iaroc.maze.model.events;

import com.otabi.iaroc.maze.model.Robot;
import com.otabi.iaroc.maze.model.states.State;
import com.otabi.iaroc.maze.model.states.TurnLeft;

public class NoWallLeft extends Event
{

	public NoWallLeft(Robot robot)
	{
		super(robot);
	}

	@Override
	public State execute()
	{
		return new TurnLeft(robot);
	}

}

package com.otabi.iaroc.maze.model.events;

import com.otabi.iaroc.maze.model.Robot;
import com.otabi.iaroc.maze.model.states.Move;
import com.otabi.iaroc.maze.model.states.State;

public class NoWallFront extends Event
{
	public NoWallFront(Robot robot)
	{
		super(robot);
	}


	@Override
	public State execute()
	{
		return new Move(robot);
	}
}

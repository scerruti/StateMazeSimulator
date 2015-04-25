package com.otabi.iaroc.maze.model.events;

import com.otabi.iaroc.maze.model.Robot;
import com.otabi.iaroc.maze.model.states.End;
import com.otabi.iaroc.maze.model.states.State;

public class AtEnd extends Event
{

	public AtEnd(Robot robot)
	{
		super(robot);
	}

	@Override
	public State execute()
	{
		return new End(robot);
	}
	
}

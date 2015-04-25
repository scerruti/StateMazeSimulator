package com.otabi.iaroc.maze.model.events;

import com.otabi.iaroc.maze.model.Robot;
import com.otabi.iaroc.maze.model.states.State;
import com.otabi.iaroc.maze.model.states.TurnAround;

public class DeadEnd extends Event
{

	public DeadEnd(Robot robot)
	{
		super(robot);
	}

	@Override
	public State execute()
	{
		// TODO Auto-generated method stub
		return new TurnAround(robot);
	}

}

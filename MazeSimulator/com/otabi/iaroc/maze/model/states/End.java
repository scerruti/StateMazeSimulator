package com.otabi.iaroc.maze.model.states;

import com.otabi.iaroc.maze.model.Robot;
import com.otabi.iaroc.maze.model.events.Event;


public class End extends State
{


	public End(Robot r)
	{
		super(r);
	}

	@Override
	public State nextState(Event e)
	{
		return null;
	}

}

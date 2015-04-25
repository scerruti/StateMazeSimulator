package com.otabi.iaroc.maze.model.states;

import com.otabi.iaroc.maze.model.Robot;
import com.otabi.iaroc.maze.model.events.Event;


public class Start extends State
{
	public Start(Robot r)
	{
		super(r);
	}

	@Override
	public State nextState(Event e)
	{
		return new Decide(r);
	}

}

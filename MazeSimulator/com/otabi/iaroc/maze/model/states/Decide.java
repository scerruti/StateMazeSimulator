package com.otabi.iaroc.maze.model.states;

import com.otabi.iaroc.maze.model.Robot;
import com.otabi.iaroc.maze.model.events.Event;

public class Decide extends State
{

	public Decide(Robot r)
	{
		super(r);
	}

	@Override
	public State nextState(Event e)
	{
		return e.execute();
	}

}

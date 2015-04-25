package com.otabi.iaroc.maze.model.states;

import com.otabi.iaroc.maze.model.Robot;
import com.otabi.iaroc.maze.model.events.Event;

public abstract class State
{
	protected Robot r;

	public State(Robot r)
	{
		this.r = r;
	}

	public abstract State nextState(Event e);
}
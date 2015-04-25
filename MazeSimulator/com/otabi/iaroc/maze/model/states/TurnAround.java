package com.otabi.iaroc.maze.model.states;

import com.otabi.iaroc.maze.model.Robot;
import com.otabi.iaroc.maze.model.events.Event;


public class TurnAround extends State
{

	public TurnAround(Robot r)
	{
		super(r);
	}

	@Override
	public State nextState(Event e)
	{
		r.turnLeft();
		r.turnLeft();
		return new Move(r);
	}

}

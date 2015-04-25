package com.otabi.iaroc.maze.model.states;

import com.otabi.iaroc.maze.model.Robot;
import com.otabi.iaroc.maze.model.events.Event;


public class TurnLeft extends State
{

	public TurnLeft(Robot r)
	{
		super(r);
	}

	@Override
	public State nextState(Event e)
	{
		r.turnLeft();
		return new Move(r);
	}

}

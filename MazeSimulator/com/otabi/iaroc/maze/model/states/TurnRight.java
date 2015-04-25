package com.otabi.iaroc.maze.model.states;

import com.otabi.iaroc.maze.model.Robot;
import com.otabi.iaroc.maze.model.events.Event;


public class TurnRight extends State
{


	public TurnRight(Robot r)
	{
		super(r);
	}

	@Override
	public State nextState(Event e)
	{
		r.turnRight();
		return new Move(r);
	}

}

package com.otabi.iaroc.maze.model.states;

import com.otabi.iaroc.maze.model.MazeNotBuiltException;
import com.otabi.iaroc.maze.model.Robot;
import com.otabi.iaroc.maze.model.RobotHitsWallException;
import com.otabi.iaroc.maze.model.events.Event;


public class Move extends State
{

	public Move(Robot r)
	{
		super(r);
	}

	@Override
	public State nextState(Event e)
	{
		try
		{
			r.move();
		} catch (RobotHitsWallException e1)
		{
			System.out.println("The robot hit a wall.");
		} catch (MazeNotBuiltException e1)
		{
			System.out.println("The maze was not built.");
		}
		return new Decide(r);
	}

}

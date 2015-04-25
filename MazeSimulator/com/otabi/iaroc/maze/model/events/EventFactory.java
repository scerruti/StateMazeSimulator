package com.otabi.iaroc.maze.model.events;

import com.otabi.iaroc.maze.model.MazeNotBuiltException;
import com.otabi.iaroc.maze.model.Robot;

public class EventFactory
{
	protected static Robot r;

	public static void setRobot(Robot robot)
	{
		r = robot;
	}

	public static Event create() throws MazeNotBuiltException
	{
		if (r.isAtEnd())
		{
			return new AtEnd(r);
		}

		if (!r.isWallRight())
		{
			return new NoWallRight(r);
		}

		if (!r.isWallFront())
		{
			return new NoWallFront(r);
		}
		
		if (!r.isWallLeft())
		{
			return new NoWallLeft(r);
		}

		return new DeadEnd(r);

	}

}

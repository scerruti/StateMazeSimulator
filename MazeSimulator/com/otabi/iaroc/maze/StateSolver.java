package com.otabi.iaroc.maze;

import java.util.concurrent.LinkedBlockingQueue;

import com.otabi.iaroc.maze.model.Maze;
import com.otabi.iaroc.maze.model.MazeNotBuiltException;
import com.otabi.iaroc.maze.model.Robot;
import com.otabi.iaroc.maze.model.events.Event;
import com.otabi.iaroc.maze.model.states.End;
import com.otabi.iaroc.maze.model.states.Move;
import com.otabi.iaroc.maze.model.states.Start;
import com.otabi.iaroc.maze.model.states.State;


public class StateSolver extends Solver
{

	@Override
	public int solve(Maze maze) throws MazeNotBuiltException, Exception
	{
		LinkedBlockingQueue<Event> eventQueue = new LinkedBlockingQueue<Event>();
		Robot myRobot = new Robot(maze);
		myRobot.setQueue(eventQueue);
		int moves = 0;

		State state = new Start(myRobot);
		while (!(state instanceof End))
		{
			state.nextState(eventQueue.take());
			if (state instanceof Move)
			{
				moves++;
			}
		}
		System.out.println("Solved in " + moves + " moves.");
		return moves;
	}

}

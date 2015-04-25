package com.otabi.iaroc.maze;

import com.otabi.iaroc.maze.model.Maze;
import com.otabi.iaroc.maze.model.MazeNotBuiltException;

public abstract class Solver
{
    protected static final int MAXMOVES = 3000;
	public abstract int solve(Maze maze) throws MazeNotBuiltException, Exception;
	
}

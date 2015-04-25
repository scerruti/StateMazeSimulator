package com.otabi.iaroc.maze.model;

import java.util.concurrent.LinkedBlockingQueue;

import com.otabi.iaroc.maze.model.events.Event;

/**
 * Created by Stephen on 5/31/2014.
 */
public class Robot {
    private Orientation currentOrientation = Orientation.EAST;
    private Position currentPosition = null;
    private Maze maze;
	private LinkedBlockingQueue<Event> queue;

    public Robot() {
        this(new Maze());
    }

    public Robot(Maze maze) {
        this.maze = maze;
        this.currentPosition = maze.getStartPostion();
    }

    public void move() throws RobotHitsWallException, MazeNotBuiltException {
        //System.out.println("@"+currentPosition+" Move "+currentOrientation);
        if (maze.isWall(currentPosition, currentOrientation)) {
            throw new RobotHitsWallException();
        }
        currentPosition.move(currentOrientation);
        if (queue != null) {
        	// Send event to the queue
        	if (isWallRight()) {
        	queue.add(new )
        }
    }

    public boolean isWallLeft() throws MazeNotBuiltException {
        return maze.isWall(currentPosition, currentOrientation.turnLeft());
    }

    public boolean isWallRight() throws MazeNotBuiltException {
        return maze.isWall(currentPosition, currentOrientation.turnRight());
    }

    public boolean isWallFront() throws MazeNotBuiltException {
        return maze.isWall(currentPosition, currentOrientation);
    }

    public void turnRight() {
        currentOrientation = currentOrientation.turnRight();
        System.out.print("R-");
    }

    public void turnLeft() {
        currentOrientation = currentOrientation.turnLeft();
        System.out.print("L-");
    }

    public boolean isAtEnd() {
        return maze.atEnd(currentPosition);
    }

	public void setQueue(LinkedBlockingQueue<Event> eventQueue)
	{
		this.queue = eventQueue;
		
	}
}

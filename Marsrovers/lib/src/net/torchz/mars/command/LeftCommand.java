package net.torchz.mars.command;

import net.torchz.mars.entity.Rover;
import net.torchz.mars.util.Direction;

public class LeftCommand implements ICommand{
    @Override
    public void execute(Rover rover) {
        int degree = (rover.getCurrentDirection().getDegree() + 270) % 360;
        Direction direction = new Direction(degree);
        rover.setCurrentDirection(direction);
    }
}

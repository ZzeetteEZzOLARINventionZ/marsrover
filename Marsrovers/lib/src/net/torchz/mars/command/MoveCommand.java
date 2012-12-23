package net.torchz.mars.command;

import net.torchz.mars.entity.Rover;

public class MoveCommand implements ICommand{
    @Override
    public void execute(Rover rover) {
        rover.moveForward(1);
    }
}

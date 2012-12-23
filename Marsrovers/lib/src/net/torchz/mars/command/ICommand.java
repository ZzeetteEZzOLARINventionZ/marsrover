package net.torchz.mars.command;

import net.torchz.mars.entity.Rover;

public interface ICommand {
    void execute(Rover rover);
}

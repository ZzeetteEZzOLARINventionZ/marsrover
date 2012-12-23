package net.torchz.mars.test;

import net.torchz.mars.command.LeftCommand;
import net.torchz.mars.command.MoveCommand;
import net.torchz.mars.command.RightCommand;
import net.torchz.mars.entity.Rover;
import net.torchz.mars.util.Coords;
import net.torchz.mars.util.Direction;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: tcz
 * Date: 12-12-20
 * Time: 上午11:39
 * To change this template use File | Settings | File Templates.
 */
public class RoverTest {
    Rover rover;

    @Before
    public void setUp() throws Exception {
        Coords startCoords = new Coords(1, 2);
        Direction startDirection = new Direction("North");
        rover = new Rover(startCoords, startDirection);
    }

    @Test
    public void testMove() throws Exception {
        rover.movement(new MoveCommand());
        assert rover.getCurrentDirection().getDegree() == 0 && rover.getCurrentDirection().getCompass().equals("North");
        assert rover.getCurrentCoords().getX() == 1 && rover.getCurrentCoords().getY() == 3;
    }

    @Test
    public void testLeft() throws Exception {
        rover.movement(new LeftCommand());
        assert rover.getCurrentDirection().getDegree() == 270 && rover.getCurrentDirection().getCompass().equals("West");
        assert rover.getCurrentCoords().getX() == 1 && rover.getCurrentCoords().getY() == 2;
    }

    @Test
    public void testRight() throws Exception {
        rover.movement(new RightCommand());
        assert rover.getCurrentDirection().getDegree() == 90 && rover.getCurrentDirection().getCompass().equals("East");
        assert rover.getCurrentCoords().getX() == 1 && rover.getCurrentCoords().getY() == 2;
    }
}

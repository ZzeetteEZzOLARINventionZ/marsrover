package net.torchz.mars.test;

import net.torchz.mars.Command;
import net.torchz.mars.Coords;
import net.torchz.mars.Direction;
import net.torchz.mars.Rover;
import org.junit.After;
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
    Command move, left, right;

    @Before
    public void setUp() throws Exception {
        move = Command.MOVE;
        left = Command.LEFT;
        right = Command.RIGHT;
        Coords startCoords = new Coords(1, 2);
        Direction startDirection = new Direction("North");
        rover = new Rover(startCoords, startDirection);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testMovement() throws Exception {
        assert rover.getCurrentCoords().getX() == 1 && rover.getCurrentCoords().getY() == 2;
        assert rover.getCurrentDirection().getDegree() == 0 && rover.getCurrentDirection().getCompass().equals("North");
        rover.movement(move);
        assert rover.getCurrentCoords().getX() == 1 && rover.getCurrentCoords().getY() == 3;
        assert rover.getCurrentDirection().getDegree() == 0 && rover.getCurrentDirection().getCompass().equals("North");
        rover.movement(right);
        assert rover.getCurrentCoords().getX() == 1 && rover.getCurrentCoords().getY() == 3;
        assert rover.getCurrentDirection().getDegree() == 90 && rover.getCurrentDirection().getCompass().equals("East");
        rover.movement(left);
        assert rover.getCurrentCoords().getX() == 1 && rover.getCurrentCoords().getY() == 3;
        assert rover.getCurrentDirection().getDegree() == 0 && rover.getCurrentDirection().getCompass().equals("North");
        rover.movement(left);
        assert rover.getCurrentCoords().getX() == 1 && rover.getCurrentCoords().getY() == 3;
        assert rover.getCurrentDirection().getDegree() == 270 && rover.getCurrentDirection().getCompass().equals("West");
        rover.movement(move);
        assert rover.getCurrentCoords().getX() == 0 && rover.getCurrentCoords().getY() == 3;
        assert rover.getCurrentDirection().getDegree() == 270 && rover.getCurrentDirection().getCompass().equals("West");
    }
}

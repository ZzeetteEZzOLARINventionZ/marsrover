package net.torchz.mars.control;

import net.torchz.mars.entity.Plateau;
import net.torchz.mars.entity.Rover;
import net.torchz.mars.util.Coords;
import net.torchz.mars.util.Direction;

/**
 * Created with IntelliJ IDEA.
 * User: tcz
 * Date: 12-12-16
 * Time: 下午6:11
 * To change this template use File | Settings | File Templates.
 */
public class Navigator {

    public Navigator() {
        int x = 0, y = 0;
        String direction = "North";
        Direction startDirection;
        Plateau plateau = new Plateau("0 0", "5 5");
        Coords startCoords = new Coords(x, y);
        startDirection = new Direction(direction);
        Rover rover = new Rover(startCoords, startDirection);
    }
}

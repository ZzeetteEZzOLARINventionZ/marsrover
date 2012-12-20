package net.torchz.mars.control;

import net.torchz.mars.entity.Plateau;
import net.torchz.mars.entity.Rover;
import net.torchz.mars.util.Command;
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

    public Navigator(Plateau plateau, Rover rover,String commandString ) throws Exception {

        for (char a : commandString.toCharArray()) {
            Command command = null;
            switch (a) {
                case 'M':
                    command = Command.MOVE;
                    break;
                case 'L':
                    command = Command.LEFT;
                    break;
                case 'R':
                    command = Command.RIGHT;
                    break;
            }
            rover.movement(command);
            if (rover.isInPlateau(plateau)){
            System.out.println(rover.getCurrentCoords().toString());
            System.out.println(rover.getCurrentDirection().toString());}
            else throw new Exception("Rover out of range!");
        }
    }

    public static void main(String args[]) throws Exception {
        Plateau plateau =new Plateau("0,0","5,5");
        Coords startCoords = new Coords(0, 0);
        Direction startDirection= new Direction("North");
        Rover rover = new Rover(startCoords, startDirection);
        String commandString = "MRRRRMMMMMMMMMMMMMLLLLLL";
        Navigator navigator = new Navigator(plateau,rover,commandString);
    }
}

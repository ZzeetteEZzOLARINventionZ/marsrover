package net.torchz.mars;

import javax.smartcardio.CommandAPDU;

/**
 * Created with IntelliJ IDEA.
 * User: tcz
 * Date: 12-12-20
 * Time: 上午10:41
 * To change this template use File | Settings | File Templates.
 */
public class Rover {
    Coords currentCoords;
    Direction currentDirection;

    public Rover(Coords startCoords, Direction startDirection) {
        currentCoords = startCoords;
        currentDirection = startDirection;
    }

    public void movement(Command command) {
        if (command == Command.RIGHT) {
            currentDirection.setDegree((currentDirection.getDegree() + 90) % 360);
        } else if (command == Command.LEFT) {
            currentDirection.setDegree((currentDirection.getDegree() + 270) % 360);
        } else if (command == Command.MOVE) {
            switch (currentDirection.getDegree() % 360) {
                case 0:
                    currentCoords.setY(currentCoords.getY() + 1);break;
                case 90:
                    currentCoords.setX(currentCoords.getX()+1);break;
                case 180:
                    currentCoords.setY(currentCoords.getY() - 1);break;
                case 270:
                    currentCoords.setX(currentCoords.getX() - 1);break;
            }
        }
    }

    public Coords getCurrentCoords() {
        return currentCoords;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }
}

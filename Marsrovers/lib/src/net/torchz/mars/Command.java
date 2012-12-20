package net.torchz.mars;

/**
 * Created with IntelliJ IDEA.
 * User: tcz
 * Date: 12-12-20
 * Time: 上午10:49
 * To change this template use File | Settings | File Templates.
 */
public enum Command {
    LEFT("L"), RIGHT("R"), MOVE("M");
    private final String commandCode;

    Command(String commandCode) {
        this.commandCode = commandCode;
    }

    public String toString() {
        return commandCode;
    }
}

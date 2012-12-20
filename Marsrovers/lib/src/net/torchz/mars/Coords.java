package net.torchz.mars;

public class Coords {
    private int x, y;

    public Coords(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coords(String[] strings) {
        if (strings.length == 2) {
            this.x = Integer.parseInt(strings[0]);
            this.y = Integer.parseInt(strings[1]);
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}

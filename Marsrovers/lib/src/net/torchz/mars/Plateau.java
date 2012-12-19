package net.torchz.mars;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: tcz
 * Date: 12-12-19
 * Time: 上午10:25
 * To change this template use File | Settings | File Templates.
 */
public class Plateau {
    private Coords coords_bottom_left;
    private Coords coords_top_right;
    public Plateau(String bottom_left, String top_right){
        coords_bottom_left = new Coords(bottom_left.split(","));
        coords_top_right = new Coords(top_right.split(","));
    }

    public Coords getCoords_bottom_left() {
        return coords_bottom_left;
    }

    public Coords getCoords_top_right() {
        return coords_top_right;
    }
}

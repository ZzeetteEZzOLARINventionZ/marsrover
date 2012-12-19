package net.torchz.mars;

/**
 * Created with IntelliJ IDEA.
 * User: tcz
 * Date: 12-12-16
 * Time: 下午5:38
 * To change this template use File | Settings | File Templates.
 */
public class Direction {
    private int degree;
    private String compass;

    public Direction(int degree) {
        this.degree = degree % 360;
        this.compass = degreeToCompass(this.degree);
    }

    public Direction(String compass) {
        this.compass = compass;
        this.degree = compassToDegree(this.compass);
    }

    private int compassToDegree(String compass) {
        if (compass.equals("North")) {
            return 0;
        } else if (compass.equals("East")) {
            return 90;
        } else if (compass.equals("South")) {
            return 180;
        } else if (compass.equals("West")) {
            return 270;
        } else return 0;
    }

    private String degreeToCompass(int degree) {
        switch (degree % 360) {
            case 0:
                return "North";
            case 90:
                return "East";
            case 180:
                return "South";
            case 270:
                return "West";
            default:
                return "North";
        }
    }

    public void setDegree(int degree) {
        this.degree = degree;
        this.compass = degreeToCompass(this.degree);
    }

    public void setCompass(String compass) {
        this.compass = compass;
        this.degree = compassToDegree(this.compass);
    }

    public String getCompass() {
        return compass;
    }

    public int getDegree() {
        return degree;
    }

}

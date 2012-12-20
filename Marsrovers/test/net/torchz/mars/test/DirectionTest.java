package net.torchz.mars.test;

import net.torchz.mars.util.Direction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: tcz
 * Date: 12-12-19
 * Time: 上午11:07
 * To change this template use File | Settings | File Templates.
 */
public class DirectionTest {
    private Direction direction;

    @Before
    public void setUp() throws Exception {
        direction = new Direction(180);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testSetDegree() throws Exception {
        direction.setDegree(0);
        assert direction.getCompass().equals("North");
        direction.setDegree(90);
        assert direction.getCompass().equals("East");
        direction.setDegree(180);
        assert direction.getCompass().equals("South");
        direction.setDegree(270);
        assert direction.getCompass().equals("West");
    }

    @Test
    public void testSetCompass() throws Exception {
        direction.setCompass("North");
        assert direction.getDegree() == 0;
        direction.setCompass("East");
        assert direction.getDegree() == 90;
        direction.setCompass("South");
        assert direction.getDegree() == 180;
        direction.setCompass("West");
        assert direction.getDegree() == 270;
    }

    @Test
    public void testGetCompass() throws Exception {
        assert direction.getCompass().equals("South");
    }

    @Test
    public void testGetDegree() throws Exception {
        assert direction.getDegree() == 180;
    }
}

package net.torchz.mars.test;

import net.torchz.mars.entity.Plateau;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: tcz
 * Date: 12-12-19
 * Time: 下午1:11
 * To change this template use File | Settings | File Templates.
 */
public class PlateauTest {
    Plateau plateau;

    @Before
    public void setUp() throws Exception {
        plateau = new Plateau("1,2", "3,4");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetCoords_bottom_left() throws Exception {
        assert plateau.getCoords_bottom_left().getX() == 1;
        assert plateau.getCoords_bottom_left().getY() == 2;
    }

    @Test
    public void testGetCoords_top_right() throws Exception {
        assert plateau.getCoords_top_right().getX() == 3;
        assert plateau.getCoords_top_right().getY() == 4;
    }
}

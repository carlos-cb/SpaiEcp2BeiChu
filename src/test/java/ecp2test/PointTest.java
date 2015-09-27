package ecp2test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ecp2.Point;

public class PointTest {
    private Point pt;
    private Point pt2;

    @Before
    public void before() {
        pt = new Point(2, 3, 4);
        pt2 = new Point(2);
    }

    @Test
    public void testPointIntIntInt(){
        assertEquals( pt.getX(),2);
        assertEquals( pt.getY(),3);
        assertEquals( pt.getZ(),4);
    }

    @Test
    public void testPointInt() {
        assertEquals( pt2.getX(),2);
        assertEquals( pt2.getY(),2);
        assertEquals( pt2.getZ(),2);
    }

    @Test
    public void testPoint() {
        pt = new Point();
        assertEquals( pt.getX(),0);
        assertEquals( pt.getY(),0);
        assertEquals( pt.getZ(),0);
    }

    @Test
    public void testModule() {
        assertEquals(5.3851, pt.module(), 10e-5);
    }

    @Test
    public void testPhase() {
        assertEquals(0.9828, pt.phase(), 10e-5);
    }

    @Test
    public void testTranslateOrigin() {
        this.pt.translateOrigin(new Point(1, 1, 1));
        assertEquals( pt.getX(),1);
        assertEquals( pt.getY(),2);
        assertEquals( pt.getZ(),3);
    }

    @Test
    public void testGetX() {
        assertEquals( pt.getX(),2);
    }

    @Test
    public void testGetY() {
        assertEquals( pt.getY(),3);
    }

    @Test
    public void testToString() {
        assertEquals("Point["+pt.getX()+","+pt.getY()+","+pt.getZ()+"]","Point[2,3,4]");
    }

}
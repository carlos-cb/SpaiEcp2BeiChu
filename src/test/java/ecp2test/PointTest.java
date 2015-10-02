package ecp2test;

import static org.junit.Assert.*;
import ecp2.Point;

import org.junit.Before;
import org.junit.Test;


public class PointTest {
    private Point pt;
    private Point pt2;
    

    @Before
    public void before() {
        pt = new Point(2, 3, 4);
        pt2 = new Point(1);
       
    }

    @Test
    public void testPointIntIntInt(){
        assertEquals( pt.getX(),2);
        assertEquals( pt.getY(),3);
        assertEquals( pt.getZ(),4);
        assertEquals(pt2.getX(),1);
        assertEquals(pt2.getY(),1);
        assertEquals(pt2.getZ(),1);
    }

    @Test
    public void testPointInt() {
    	pt = new Point();
        assertEquals( pt.getX(),0);
        assertEquals(pt.getY(),0);
        assertEquals( pt.getZ(),0);
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
    	 assertEquals(pt.module(),5.3851, 10e-5);
    }

    @Test
    public void testPhase() {
    	assertEquals(pt.phase(),0.9828,10e-5);
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
    
    @Test
    public void TestLimit(){
    	pt = new Point(-2, 200, 0);
    	assertEquals(0, pt.getX());
    	assertEquals(100, pt.getY());
    }

}
package ecp2test;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ecp2.DecimalCollection;

public class DecimalCollectionTest {
    
    private DecimalCollection collec;
   
    
    @Before
    public void before() {
        collec = new DecimalCollection();       
    }

    @Test
    public void testAddSize() {
        assertEquals(collec.size(), 0);
        collec.add(0.1);
        assertEquals(collec.size(), 1);        
    }

    @Test
    public void testSum() {
        assertTrue(collec.sum()==0);
        collec.add(0.1);
        assertTrue(collec.sum()==0.1);
    }

    @Test
    public void testHigher() {
        collec.add(0.1);
        collec.add(0.6);
        collec.add(0.5);
        assertTrue(collec.higher()==0.6);
    }
    
    @Test
    public void testMenor() {
    	collec = new DecimalCollection();
    	collec.add(0.11);
    	collec.add(4.98);
    	assertEquals(0.11, collec.menor(), 0.01);
    }

}
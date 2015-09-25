package ecp2test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ecp2.Fraction;

public class FractionTest {
    private Fraction fra;

    @Before
    public void before() {
        fra = new Fraction(1, 2);
    }

    @Test
    public void testFractionIntInt() {
        assertEquals(fra.getNumerator(), 1);
        assertEquals(fra.getDenominator(), 2);
    }

    @Test
    public void testFraction() {
        fra = new Fraction();
        assertEquals(fra.getNumerator(), 1);
        assertEquals(fra.getDenominator(), 1);
    }

    @Test
    public void testDecimal() {
        assertTrue(fra.decimal() == 0.5);
    }

    @Test
    public void testGetNumerator() {
        assertEquals(fra.getNumerator(), 1);
    }

    @Test
    public void testGetDenominator() {
        assertEquals(fra.getDenominator(), 2);
    }

}
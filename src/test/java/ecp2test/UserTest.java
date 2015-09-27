package ecp2test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ecp2.User;



public class UserTest {
    
    private User usr;
    
    @Before 
    public void before(){
    	usr = new User(7, "Bei", "Chu" );
    }

    @Test
    public void testUser (){
    	assertEquals(usr.getName(),"Bei");
    	assertEquals(usr.getFamilyName(),"Chu");
    	assertEquals(usr.getNumber(), 7);
    }
    
    @Test
    public void testFullName(){
    	assertEquals(usr.fullName(),"Bei Chu");
    }
    
    @Test
    public void testInitials(){
    	assertEquals(usr.initials(),"B.");
    }
    	
}
    
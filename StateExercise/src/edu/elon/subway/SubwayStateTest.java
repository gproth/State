package edu.elon.subway;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SubwayStateTest {
  SubwayState states;

  @Before
  public void setUp() throws Exception {
    
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testPass() {
    states = new SubwayState();
    states.coin();
    states.pass();
    assertEquals(states.output, "passed");
  }

  @Test
  public void testCoin() {
    states = new SubwayState();
    states.coin();
    assertEquals(states.output, "coin accepted");
  }
  
  @Test
  public void testPassFail(){
    states = new SubwayState();
    states.pass();
    assertEquals(states.output, "Alarm");
  }
  
  @Test
  public void testExtraCoin(){
    states = new SubwayState();
    states.coin();
    states.coin();
    assertEquals(states.output, "Thank you");
  }

}

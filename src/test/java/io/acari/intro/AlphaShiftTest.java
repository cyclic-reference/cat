package io.acari.intro;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Forged in the flames of battle by alex.
 */
public class AlphaShiftTest {
  private AlphaShift alphaShift = new AlphaShift();

  @Test
  public void alphabeticShiftOne() throws Exception {
    assertEquals("dsbaz", alphaShift.alphabeticShift("crazy"));
  }

  @Test
  public void alphabeticShiftTwo() throws Exception {
    assertEquals("a", alphaShift.alphabeticShift("a"));
  }

}
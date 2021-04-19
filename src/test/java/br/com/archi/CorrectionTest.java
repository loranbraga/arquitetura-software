package br.com.archi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class CorrectionTest {
   /**
     * Rigorous Test :-)
     */

    @Test
    public void phospor()
    {
      Ground ground = new Ground(1, 8.59, 0.15, 5.76, 1.63, 3.67, 0.00, 5.35, 30.7);
      PhosporCorretion phosporCorrection = new PhosporCorretion(ground, 1, 10, 0.7, 12.00);
      assertEquals(51.25238095238096, phosporCorrection.correction(), 0);
    }

    @Test
    public void valueHecPhospor()
    {
      Ground ground = new Ground(1, 8.59, 0.15, 5.76, 1.63, 3.67, 0.00, 5.35, 30.7);
      PhosporCorretion phosporCorrection = new PhosporCorretion(ground, 1, 10, 0.7, 12.00);
      assertEquals(0.6150285714285715, phosporCorrection.getValueByHec(), 0);
    }
}

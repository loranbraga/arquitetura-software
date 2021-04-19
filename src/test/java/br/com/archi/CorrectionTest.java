package br.com.archi;

import static org.junit.Assert.assertEquals;
import br.com.archi.enums.Texture;

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
      Ground ground = new Ground(Texture.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.00, 5.35, 30.7);
      PhosporCorrection phosporCorrection = new PhosporCorrection(ground, 1, 10, 0.7, 12.00);
      assertEquals(51.25238095238096, phosporCorrection.correction(), 0);
    }

    @Test
    public void valueHecPhospor()
    {
      Ground ground = new Ground(Texture.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.00, 5.35, 30.7);
      PhosporCorrection phosporCorrection = new PhosporCorrection(ground, 1, 10, 0.7, 12.00);
      assertEquals(0.6150285714285715, phosporCorrection.amountHec(), 0);
    }

    @Test
    public void potassium()
    {
      Ground ground = new Ground(Texture.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.00, 5.35, 30.7);
      PotassiumCorrection potassiumCorrection = new PotassiumCorrection(ground, 1, 3.0, 10.0);
      assertEquals(440.15063267435335, potassiumCorrection.correction(), 0);
    }

    @Test
    public void valueHecPotassium()
    {
      Ground ground = new Ground(Texture.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.00, 5.35, 30.7);
      PotassiumCorrection potassiumCorrection =  new PotassiumCorrection(ground, 1, 3.0, 10.0);
      assertEquals(4.401506326743533, potassiumCorrection.amountHec(), 0);
    }
}

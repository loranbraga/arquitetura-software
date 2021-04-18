package br.com.archi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Test
    public void baseSaturation()
    {
        Ground ground = new Ground(1, 10.23, 0.15, 5.76, 1.63, 1.10, 0.00, 5.35);
        System.out.println(ground.baseSaturation());
        assertEquals( 58.494957331264544, ground.baseSaturation(), 0 );
    }
    
    @Test
    public void sumCmol()
    {
        Ground ground = new Ground(1, 10.23, 0.15, 5.76, 1.63, 1.10, 0.00, 5.35);
        assertEquals( 7.54, ground.sumCmol(), 0 );
    }

    @Test
    public void ctcCmol()
    {
        Ground ground = new Ground(1, 10.23, 0.15, 5.76, 1.63, 1.10, 0.00, 5.35);
        assertEquals( 12.89, ground.ctcCmol(), 0 );
    }

    @Test
    public void idealPhosphorTexture1()
    {
        Ground ground = new Ground();
        ground.setTexture(1);
        assertEquals( 9.0, ground.getIdealPhosphor(), 0 );
    }

    @Test
    public void idealPhosphorTexture2()
    {
        Ground ground = new Ground();
        ground.setTexture(2);
        assertEquals( 12.0, ground.getIdealPhosphor(), 0 );
    }

    @Test
    public void idealPotassiumTexture1()
    {
        Ground ground = new Ground();
        ground.setTexture(1);
        assertEquals( 0.35, ground.getIdealPotassium(), 0 );
    }

    @Test
    public void idealPotassiumTexture2()
    {
        Ground ground = new Ground();
        ground.setTexture(2);
        assertEquals( 0.25, ground.getIdealPotassium(), 0 );
    }

    @Test
    public void idealCalciumTexture1()
    {
        Ground ground = new Ground();
        ground.setTexture(1);
        assertEquals( 6.0, ground.getIdealCalcium(), 0 );
    }

    @Test
    public void idealCalciumTexture2()
    {
        Ground ground = new Ground();
        ground.setTexture(2);
        assertEquals( 4.0, ground.getIdealCalcium(), 0 );
    }

    @Test
    public void idealMagnesiumTexture1()
    {
        Ground ground = new Ground();
        ground.setTexture(1);
        assertEquals( 1.5, ground.getIdealMagnesium(), 0 );
    }

    @Test
    public void idealMagnesiumTexture2()
    {
        Ground ground = new Ground();
        ground.setTexture(2);
        assertEquals( 1.0, ground.getIdealMagnesium(), 0 );
    }

    @Test
    public void idealSulfurTexture1()
    {
        Ground ground = new Ground();
        ground.setTexture(1);
        assertEquals( 9.0, ground.getIdealSulfur(), 0 );
    }

    @Test
    public void idealSulfurTexture2()
    {
        Ground ground = new Ground();
        ground.setTexture(2);
        assertEquals( 6.0, ground.getIdealSulfur(), 0 );
    }

    @Test
    public void idealAluminium()
    {
        Ground ground = new Ground();
        ground.setTexture(2);
        assertEquals( 0, ground.getIdealAluminium(), 0 );
    }
}

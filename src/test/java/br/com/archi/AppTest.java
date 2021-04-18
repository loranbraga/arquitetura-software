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

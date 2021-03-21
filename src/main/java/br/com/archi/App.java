package br.com.archi;

import br.com.archi.Ground;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Ground ground = new Ground();
        ground.setTexture(2);
        System.out.println(ground.getTexture());
    }
}

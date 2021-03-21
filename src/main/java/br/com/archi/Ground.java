package br.com.archi;

public class Ground {
  private int texture;

  public void setTexture(int texture){
    this.texture = texture;
  }

  public int getTexture(){
    return this.texture;
  }

  public double getIdealPhosphor(){
    if (this.texture == 1) return 9.0;
    if (this.texture == 2) return 12.0;
    return 0.0;
  }
}

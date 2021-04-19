package br.com.archi;

public class Ground {
  private int texture;
  private double phospor;
  private double potassium;
  private double calcium;
  private double magnesium;
  private double sulfur;
  private double aluminuim;
  private double potencialAcid;
  private double mo;


  public Ground(int texture,  double phospor, double potassium, double calcium, double magnesium, double sulfur, double aluminuim, double potencialAcid, double mo) {
    this.texture = texture;
    this.phospor = phospor;
    this.potassium = potassium;
    this.calcium = calcium;
    this.magnesium = magnesium;
    this.sulfur = sulfur;
    this.aluminuim = aluminuim;
    this.potencialAcid = potencialAcid;
    this.mo = mo;
  }

  public Ground() {
    this.phospor = 0.0;
    this.potassium = 0.0;
    this.calcium = 0.0;
    this.magnesium = 0.0;
    this.sulfur = 0.0;
    this.aluminuim = 0.0;
    this.potencialAcid = 0.0;
    this.mo = 0.0;
  }

  public double sumCmol() {
    return this.calcium + this.potassium + this.magnesium;
  }

  public double getCarbon() {
    return moPercentual()/ 1.72*10;
  }

  public double moPercentual() {
    return mo/10;
  }

  public double ctcCmol() {
    return sumCmol() + this.potencialAcid;
  }

  public double baseSaturation() {
    return 100*sumCmol()/ctcCmol();
  }

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

  public double getIdealPotassium(){
    if (this.texture == 1) return 0.35;
    if (this.texture == 2) return 0.25;
    return 0.0;
  }

  public double getIdealCalcium(){
    if (this.texture == 1) return 6.0;
    if (this.texture == 2) return 4.0;
    return 0.0;
  }

  public double getIdealMagnesium(){
    if (this.texture == 1) return 1.5;
    if (this.texture == 2) return 1.0;
    return 0.0;
  }

  public double getIdealSulfur(){
    if (this.texture == 1) return 9.0;
    if (this.texture == 2) return 6.0;
    return 0.0;
  }

  public double getIdealAluminium(){
    return 0.0;
  }

  public double getPhospor(){
    return phospor;
  }

  public double getPotassium(){
    return potassium;
  }
}

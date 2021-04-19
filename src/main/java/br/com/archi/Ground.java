package br.com.archi;

import br.com.archi.enums.Texture;

public class Ground {
  private Texture texture;
  private double phospor;
  private double potassium;
  private double calcium;
  private double magnesium;
  private double sulfur;
  private double aluminuim;
  private double potencialAcid;
  private double mo;


  public Ground(Texture texture, double phospor, double potassium, double calcium, double magnesium, double sulfur, double aluminuim, double potencialAcid, double mo) {
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

  public Ground(Texture texture) {
    this.texture = texture;
    this.phospor = 0.0;
    this.potassium = 0.0;
    this.calcium = 0.0;
    this.magnesium = 0.0;
    this.sulfur = 0.0;
    this.aluminuim = 0.0;
    this.potencialAcid = 0.0;
    this.mo = 0.0;
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

  public double getIdealPhosphor(){
    switch(this.texture){
      case ARGILOSO:
          return 9.0;
      case TEXTURA_MEDIA:
          return 12.0;
      default:
          return 0.0;
    }
  }

  public double getIdealPotassium(){
    switch(this.texture){
      case ARGILOSO:
          return 0.35;
      case TEXTURA_MEDIA:
          return 0.25;
      default:
          return 0.0;
    }
  }

  public double getIdealCalcium(){
    switch(this.texture){
      case ARGILOSO:
          return 6.0;
      case TEXTURA_MEDIA:
          return 4.0;
      default:
          return 0.0;
    }
  }

  public double getIdealMagnesium(){
    switch(this.texture){
      case ARGILOSO:
          return 1.5;
      case TEXTURA_MEDIA:
          return 1.0;
      default:
          return 0.0;
    }
  }

  public double getIdealSulfur(){
    switch(this.texture){
      case ARGILOSO:
          return 9.0;
      case TEXTURA_MEDIA:
          return 6.0;
      default:
          return 0.0;
    }
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

package br.com.archi;

public class PotassiumCorrection {
  private Ground ground;
  private int source;
  private double goal;
  private double value; // R$/ton
  
  public PotassiumCorrection(Ground ground, int source, double goal, double value) {
    this.ground = ground;
    this.source = source;
    this.goal = goal;
    this.value = value;
  }

  public double getValueSource() {
    switch(this.source) {
        case 1: 
            return 58.0;
        case 2: 
            return 52.0;   
        case 3: 
            return 22.0; 
        default:
            return 0.0;
    }
  }
  
  public double correction() {
    return (((this.ground.getPotassium() * this.goal / this.ground.getPotassium()/this.ground.ctcCmol()*100) - this.ground.getPotassium()) * 1104 / getValueSource());
  }   
  
  public double amountHec() {
    return (this.value * this.correction() / 1000);
  }

}

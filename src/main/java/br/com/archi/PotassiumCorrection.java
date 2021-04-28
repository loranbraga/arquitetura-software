package br.com.archi;

public class PotassiumCorrection {
  private Ground ground;
  private int source;
  private double goal;
  private double value; // R$/ton
  private final double[] sourceValue = {58.0,52.0, 22.0};
  
  public PotassiumCorrection(Ground ground, int source, double goal, double value) {
    this.ground = ground;
    this.source = source;
    this.goal = goal;
    this.value = value;
  }

  public Nutrient[] getAdditionalsNutrients(){
    Nutrient nutrients[] = {};
    switch(source){
      case 1: 
        nutrients[0] = new Nutrient("Enxofre", this.correction() * 0.17);
        return nutrients;
      case 2:
        nutrients[0] = new Nutrient("Enxofre", this.correction() * 0.22);
        nutrients[1] = new Nutrient("Magnésio", this.correction() * 0.18);
        return nutrients;
      default:
        return nutrients;
    }
  }
  
  public double correction() {
    return (((this.ground.getPotassium() * this.goal / this.ground.getPotassium()/this.ground.ctcCmol()*100) - this.ground.getPotassium()) * 1104 / sourceValue[source-1]);
  }   
  
  public double amountHec() {
    return (this.value * this.correction() / 1000);
  }

}

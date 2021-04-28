package br.com.archi;

public class PhosporCorrection {
  private Ground ground;
  private int source;   
  private double goal;
  private double efficiency;
  private double value; // R$/ton
  private final double [] soucerValue = {18.0,41.0,48.0,45.0,18.0,33.0,29.0,32.0,24.0,18.5,52.0,18.0};

  public PhosporCorrection(Ground ground, int source, double goal, double efficiency, double value){
    this.ground = ground;
    this.source = source;
    this.goal = goal;
    this.efficiency = efficiency;
    this.value = value;
  }

  public Nutrient[] getAdditionalsNutrients(){
    Nutrient nutrients[] = {};
    switch(source){
      case 1: 
        nutrients[0] = new Nutrient("Calcio", this.correction() * 0.6776);
        nutrients[1] = new Nutrient("Magnesio", this.correction() * 0.1);
        return nutrients;
      case 2:
        nutrients[0] = new Nutrient("Calcio", this.correction() * 0.484);
        return nutrients;
      case 3:
        nutrients[0] = new Nutrient("Nitrogenio", this.correction() * 2.178);
        return nutrients;
      case 4:
        nutrients[0] = new Nutrient("Nitrogenio", this.correction() * 0.3872);
        return nutrients;
      case 5: 
        nutrients[0] = new Nutrient("Calcio", this.correction() * 0.6776);
        nutrients[1] = new Nutrient("Enxofre", this.correction() * 0.15);
        return nutrients;
      case 6:
        nutrients[0] = new Nutrient("Calcio", this.correction() * 1.2584);
        return nutrients;
      case 7: 
        nutrients[0] = new Nutrient("Calcio", this.correction() * 1.2584);
        return nutrients;
      case 8: 
        nutrients[0] = new Nutrient("Calcio", this.correction() * 1.089);
        return nutrients;
      case 9: 
        nutrients[0] = new Nutrient("Calcio", this.correction() * 0.6776);
        return nutrients;
      case 10: 
        nutrients[0] = new Nutrient("Calcio", this.correction() * 1.0678);
        return nutrients;
      case 12: 
        nutrients[0] = new Nutrient("Enxofre", this.correction() * 0.11);
        return nutrients;
      default: 
          return null;
    }
  }

  public double correction(){
    return ((this.goal - this.ground.getPhospor()) * 4.58 / this.efficiency * (100 / soucerValue[source-1]));
  }

  public double amountHec(){
    return (this.value * this.correction() / 1000) ;
  }

}

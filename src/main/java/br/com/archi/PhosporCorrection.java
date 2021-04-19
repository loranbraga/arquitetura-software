package br.com.archi;

public class PhosporCorrection {
  private Ground ground;
  private int source;   
  private double goal;
  private double efficiency;
  private double value; // R$/ton

  public PhosporCorrection(Ground ground, int source, double goal, double efficiency, double value){
    this.ground = ground;
    this.source = source;
    this.goal = goal;
    this.efficiency = efficiency;
    this.value = value;
  }

  public double getValueSource() {
    switch(this.source) {
        case 1: 
            return 18.0;
        case 2: 
            return 41.0;   
        case 3: 
            return 48.0; 
        case 4: 
            return 45.0; 
        case 5: 
            return 18.0; 
        case 6: 
            return 33.0; 
        case 7: 
            return 29.0;
        case 8: 
            return 32.0; 
        case 9: 
            return 24.0; 
        case 10: 
            return 18.5; 
        case 11: 
            return 52.0; 
        case 12: 
            return 18.0; 
        default:
            return 0.0;
    }
  }

  public double correction(){
    return ((this.goal - this.ground.getPhospor()) * 4.58 / this.efficiency * (100 / this.getValueSource()));
  }

  public double amountHec(){
    return (this.value * this.correction() / 1000) ;
  }

}

import java.awt.*;

public class Robot{
	String nom;
	private Point position; 
	int vitesse;
	private int niveau;
	
   public Robot(String MonRobot) {
        nom=MonRobot;
        position=new Point(0,0);
   }    
   public Robot(String MonRobot, int x, int y, int vitesse) {
        nom=MonRobot;
        position=new point(x,y);
        this.vitesse=vitesse;
   }
   public Robot(int niveau) {
        if (niveau >= 0 && niveau <= 100) {
            this.niveau = niveau;
        } else {
            System.out.println("Niveau de combustible invalide");
        }
   public void allerALEst(){
   	position.translate(vitesse,0);
	
   }
   public void allerOuest(){
   	position.translate(-vitesse,0);
   }
   public void allerAuNord(){
   	position.translate(0,vitesse);
   }
   public void allerAuSud(){
   	position.translate(0,-vitesse);
   }
   public void accelerer(){
   	if(vitesse<10)
   	vitesse++;
   }
   public void decelerer(){
   	vitesse--;
   	if(vitesse==0){
   		stop();
   	}
   }
   public void stop(){
   	vitesse=0;
   	}	
   public Point getPosition(){
   	return position;
   	}	
  public Point sePresenter(){
  	System.out.println("nom: " + nom + " position: "+position);
  }
  public void setNiveau(int n){
  	niveau=n;
  }
  public int getNiveau(){
  	return niveau;
  }
  public void sePromener(){
  	niveau=Math.random(){
  	do{
  	System.out.println("(0)"+ sePromener[0]+" (1)"+sePromener
	switch(sePromener({
	case 0:
	break;
	case 1:
	break;
	}
	}while();
	
      }
    }
}  
  private int nouveauCombustible;
  public Robot(int niveauCombustible)
  {
     this.niveauxCombustible=niveauCombustible;
  }
  public int getNiveauCombustible(){
     return niveauCombustible;
  
  }
  
  public void setniveauCombustible(int niveaucombustible) {
      this.nivaeuCombustible=niveauCombustible;
  } 
  public void setNiveau(int n){
    this.niveauCombustible=n;
  }
  public int getNiveau(){
    return niveauCombustible;
    if(niveauCombustible==0)
  System.out.println("le rebot ne peut plus ce deplacer");
  }
  
  
public void sePromener() {
  double direction = Math.random();
  if (direction < 0.25) {
     System.out.println("deplacement vers le haut");
  } else if (direction < 0.5) {
     System.out.println("deplacement vers la droite");
  } else if (direction < 0.75) {
     System.out.println("deplacement vers le bas");
  } else {
     System.out.println("deplacement vers la gauche");
  }  
  
  
  
  
  
}

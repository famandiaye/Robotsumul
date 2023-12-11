public class SimulRobot{
    public static void main(String [] args){
    	Robot robot1=new Robot("Djamil 2.0");
    	robot1.sePresenter();
    	robot1.accelerer();
    	robot1.accelerer();
    	robot1.allerAlEst();
    	robot1.sePresenter();
    	robot1.decelerer();
    	robot1.allerAlEst();
    	robot1.sePresenter();
    	
    Robot robot = new Robot(100);
    while (robot.getNiveauCombustible() > 0) {
      robot.sePromener();
      robot.setNiveauCombustible(robot.getNiveauCombustible() - 1);
    }
  }
}


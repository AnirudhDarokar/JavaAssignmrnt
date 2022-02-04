
public class IsAHasAUsesAProducesA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
		// creating objects
		
		GymGuys vijayBhoyar = new GymGuys(5.6f,72.6f,"ACTN3");
		vijayBhoyar.showGymGuysDetails();
		BuildMuscle muscle = vijayBhoyar.buildMuscle();
		muscle.showMuscleDetail();
		
		
		
		
		
	}

}
class Legs{
	Legs(){
	}
	
	void showLegs() {
		System.out.println("Left Leg and Right Leg");
	}
}

class Hands{
	Hands(){

	}
	void showHand() {
		System.out.println("Left Hand and Right Hand");
	}

}

class Human{//hasA
	
	float height;
	float weight;
	
	//human has hand and legs
	Hands humanHand = new Hands();
	Legs  humanLegs = new Legs();
	
	
	public Human(float height, float weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	
	public void  setHuman(float height, float weight) {
		this.height = height;
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	void showHumanData() {
		humanHand.showHand();
		humanLegs.showLegs();
		System.out.println("Height is :"+height);
		System.out.println("Weight is :"+weight);
	}
	
	
	
	
	
	
}

class Workout{//UsesA
	int reps;
	String time;
	String forDays;
	String movement;
	int weight;
	
	
	
	public Workout(int reps, String time, String forDays, int weight, String movement) {
		
		this.reps = reps;
		this.time = time;
		this.forDays = forDays;
		this.weight = weight;
		this.movement = movement;
	}
	
	public void WorkoutDetail() {
		System.out.println("Reps performing    : "+reps);
		System.out.println("Time taken         : "+time);
		System.out.println("How many days      : "+forDays);
		System.out.println("weight to lift     : "+weight);
		System.out.println("movement need to do: "+movement);
	}
}

class BuildMuscle{//ProducesA
	int width;
	int pump;
	String nameOfMuscle;
	
	
	public BuildMuscle(int width, int pump, String nameOfMuscle) {
		super();
		this.width = width;
		this.pump = pump;
		this.nameOfMuscle = nameOfMuscle;
	}
	
	void showMuscleDetail() {
		System.out.println("------Muscle---Detail------");
		System.out.println("name of muscle          : "+nameOfMuscle);
		System.out.println("width of muscle         : "+width);
		System.out.println("pump generate in muscle : "+pump);
		
	}
}

class GymGuys extends Human{
	
	String genetics;
	// gym guys used to do workout
	Workout legsWorkout = new Workout(15,"45 min","for minimum 19 days",20,"situps");
	
	
	//constructor
	public GymGuys(float height, float weight, String genetics) {
		super(height, weight);
		this.genetics = genetics;
	}
	
	//set methods setting the details
	public void  setGymGuys(float height, float weight, String genetics) {
		super.setHuman(height, weight);
		this.genetics = genetics;
	}
	
     // setter and getter methods
	public String getGenetics() {
		return genetics;
	}

	public void setGenetics(String genetics) {
		this.genetics = genetics;
	}
	
	public void showGymGuysDetails() {
		System.out.println("==============Gym Guys Detail==============");
		super.showHumanData();
		System.out.println("Genetics  :"+genetics);
		System.out.println("------w o r k o u t -- d e t a i l s------");
		legsWorkout.WorkoutDetail();
		System.out.println("==========================================");
		
	}
	
	    //Produces a result
	    BuildMuscle buildMuscle() {
		System.out.println("human is performing workout");
		BuildMuscle legMuscle = new BuildMuscle(23,5,"leg muscle");
		return legMuscle;
	    }
}

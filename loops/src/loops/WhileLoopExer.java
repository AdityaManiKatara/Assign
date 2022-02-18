package loops;

public class WhileLoopExer {
	
	
	private int player;
	
	
	WhileLoopExer (int player){
		
		this.player=player;
		
			
			
		}
		
		
		

	
	public int squareNumber() {
		
		int i =0;
		int j=0;
		int sum =0;
		
		while (i<this.player) {
			
			
			j=i*i;
			
			if(j<this.player) {
			System.out.print(i + " + ");
			System.out.println("Square upto nymber = " + j);
			
			
			}
			i++;
		}
		
		return sum;
	}
	
	
	
	public int cubeNumber() {
		
		
		int i =0;
		int j=0;
		int sum =0;
		
		while (i<this.player) {
			
			
			j=i*i*i;
			
			if(j<this.player) {
			System.out.print(i + " + ");
			System.out.println("Cube upto nymber = " + j);
			
			
			}
			i++; 
		}
		return sum;
	}
	
	
	
	
	

}

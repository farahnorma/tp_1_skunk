import java.util.Scanner;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;


public class Player {	
	String name;	
	int cummulativeScore;
	Scanner Input = new Scanner(System.in);
		
	
	public String getName() {
		return name;
	}	
	
	
	public void setName() {
		StdOut.println("Enter player name: ");
		Scanner Input = new Scanner(System.in);
        name = Input.nextLine();
		
		this.name = Input.toString();
	}	
	
	int getTotalScore(){
        return cummulativeScore;
    }
	
	public void setTotalScore(int turn){
        cummulativeScore += turn;
    }
		
	} 
 
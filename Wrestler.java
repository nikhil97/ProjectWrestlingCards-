package in.codecamp.TheGame;

public class Wrestler {

	
  public String name;
  public int rank;
  public double height;
  public double weight;
  private int matchesWon;
  private int matchesLost;
  private int totalmatches;
  
  
  public  Wrestler(String Name, int Rank, double Height, double Weight,int MatchesWon, int MatchesLost){
	  this.name = Name;
	  this.rank = Rank;
	  this.height = Height;
	  this.weight = Weight;
	  this.matchesWon=MatchesWon;
	  this.matchesLost=MatchesLost;
	  this.totalmatches=matchesWon+matchesLost;
	  
  }
  
  public String toString() {
	  return "Name: "+this.name+ "\n1-Rank:"+this.rank + "\n2-Height:"+this.height+ "\n3-Weight:"+this.weight+" \nMatchesWon:"+this.matchesWon+"\nMatchesLost:"+this.matchesLost+"\nTotalMatches:"+this.totalmatches;
  }
  
 public  static void Play(int choice,Wrestler temp1,Wrestler temp2){
	 
	 switch(choice)
	 {
	 case 1:if(temp1.rank<temp2.rank)
		          System.out.println("Player Won");
		     else
	        	   System.out.println("opponent won");
	        	 
	       break;
	           
	 case 2:if(temp1.height>temp2.height)
		           System.out.println( "player won");
		           
		    else  
		    	  System.out.println("opponent won");
	 
	     break;
	     
	 case 3: if(temp1.weight>temp2.weight)
		        System.out.println("Player Won");
	         else
	        	 System.out.println("opponent won");
	 
	         break;
	      
	 default : System.out.println("Please Enter A ");        
	        	   
		 
	 }
	          
	 }
 
   
 }


































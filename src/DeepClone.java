// A Java program to demonstrate deep copy 
// using clone() 
  

class Villian implements Cloneable{ 
	
    String sName;
    String attack; 
    
    public Object clone() throws CloneNotSupportedException { 
            
            Villian badguy = (Villian)super.clone();
            
            return badguy; 
    } 
} 















public class DeepClone{ 
	
    public static void main(String args[]) throws CloneNotSupportedException{ 
      
    	Villian Kira = new Villian(); 
    	Kira.sName = "[Killer Queen]"; 
    	Kira.attack = "[Sheer Heart Attack]"; 
  
     	Villian Kira2  = (Villian)Kira.clone(); 
     	// Creating a clone of Kira and passing it to Kira2 
       
     	Kira2.sName = "[Killer Queen Requiem]"; 
     	Kira2.attack = "[Bites The Dust]"; 
  

     	System.out.println("Yoshikage Kira's stand is " + Kira.sName + ". Its special attack is\n " + Kira.attack + "\n" ); 
     	System.out.println("Kosaku Kira's stand is " + Kira2.sName + ". Its special attack is\n " + Kira2.attack + "\n" ); 
    } 
} 

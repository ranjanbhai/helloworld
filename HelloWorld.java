//importing packages
import java.math.*;
import java.io.*;

class HelloWorld{
     public String randomGenerator(String name){ //function to generate random number and return with name
	int randomNum = 0; //initialize random number variable
        int range = 10;//15-6
        randomNum = (int)(Math.random()*range + 6); //typecasting float value from Math.random() function
	name += " "+randomNum; //padding random number with name
	return name; 
     }
      public static void main(String []args)throws IOException{
        HelloWorld ob = new HelloWorld(); //create HelloWorld object
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //stdin input
        String name = in.readLine(); //reading name from user from command line
        System.out.println(ob.randomGenerator(name)); //displaying output
	}
}

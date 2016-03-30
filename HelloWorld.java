import java.math.*;
import java.io.*;
class HelloWorld{
     public String randomGenerator(String name){
		int randomNum = 0;
        int range = 10;//15-6
        randomNum = (int)(Math.random()*range + 6); 
		name += " "+randomNum;
		return name;
	 }
	 public static void main(String []args)throws IOException{
        HelloWorld ob = new HelloWorld();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String name = in.readLine();
        System.out.println(ob.randomGenerator(name));
	}
}
package softwaretestlab1;
import java.util.*;

public class Stlab1 {
		/*public static void main (String[] args){
			Scanner out = new Scanner(System.in);
			float[]number = new float[3];
			for(int i=0;i<3;i++){
				number[i]=out.nextFloat();
			}
			float side1 = number[0];	
			float side2 = number[1];	
			float side3 = number[2];
			String answer = triangle(side1,side2,side3);
			System.out.println(answer);
		}*/
		
		public static String triangle(double side1,double side2,double side3){
			if (side1 + side2 > side3 && side1+ side3 > side2 && side2 + side3 > side1 && Math.abs(side1-side2)< side3 && Math.abs(side1-side3)<side2 && Math.abs(side2-side3)<side1){
				if(side1==side2&&side2==side3){
					return ("equilateral");
				}
				else if (side1==side2||side1==side3||side2==side3){
					return("isosceles");
				}
				else{
					return("scalene");
				}
			}
			else{
				return("not a triangle");
			}
		}
}

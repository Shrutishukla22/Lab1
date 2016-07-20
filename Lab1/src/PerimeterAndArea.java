import java.util.Scanner;
   

public class PerimeterAndArea {
	public float findArea(float len,float wid){
		float area = len*wid;
		return area;
	}
	public float findPerimeter(float len,float wid){
		float perimeter=len*2 + wid*2;
		return perimeter;
	}
	public float findVolume(float len,float wid,float high){
		float volume= len*wid*high;
		return volume;
	}

	public static void main(String[] args) {
		String next ="yes";
		Scanner userInput =new Scanner(System.in);
		 //define variables
		float length =0.0f;
		float width =0.0f;
		float hieght= 0.0f;
		
		while(next.equalsIgnoreCase("yes")){
   
	//prompt user to enter length
	System.out.println("please enter the length:");
	length = userInput.nextFloat();
	userInput.nextLine();
	
	//prompt user to enter width
	System.out.println("please enter the width:");
	width = userInput.nextFloat();
	userInput.nextLine();
	//prompt user to enter hieght
		System.out.println("please enter the hieght:");
		hieght = userInput.nextFloat();
		userInput.nextLine();
	//System.out.println(length);
	PerimeterAndArea paa = new PerimeterAndArea();
	System.out.println("area of the room is" + paa.findArea(length, width));
	System.out.println("perimeter of the room is" + paa.findPerimeter(length, width));
	System.out.println("perimeter of the room is" + paa.findVolume(length, width,hieght));
	
	//promt user for more input
	System.out.println("do you want to caculate more:enter yes or no");
	next = userInput.nextLine();
	
	System.out.println("you entered:"+next);
	}
		//closing scanner
		userInput.close();
		System.out.println("goodbye");
	}
}

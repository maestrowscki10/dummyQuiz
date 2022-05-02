import java.util.Scanner;

public class Qn2_iii {  
public static void main(String[] args) {  	
	int done=0, b, total=0;
	Scanner input=new Scanner(System.in);
	
	do{
	  b = done;
  	  total = done + total;
          //System.out.println("Inputs");
	  done=input.nextInt();

	}while(done!=b);

	System.out.println("Final sum is "+total);
	
	}
}


public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Saya");
		System.out.print("Suka");
		System.out.println("Saya");
		System.out.printf("Makan");
		System.out.println("----------");
		System.out.println("Saya");
		System.out.println();
		
		
		
		System.out.println(" Multiplication Table \n");
		  
		  // Display the number title
		  System.out.print("    ");
		  for (int j = 1; j <= 9; j++)
			  System.out.print("   " + j);
		  System.out.println("\n � � � � � � � � � � � � � � � � � � � �");
		
		  for (int i = 1; i <= 9; i++) { 
			  System.out.print(i + " | ");
			   for (int j = 1; j <= 9; j++) { 
			   // Display the product and align properly
			   System.out.printf("%4d", i * j);
			   }
			   System.out.println();
			   }

	}

}

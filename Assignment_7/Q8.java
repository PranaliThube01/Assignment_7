import java.util.Scanner;
class Demo{
        public static void main (String [] args){
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the Rows:");
            int rows = sc.nextInt();
           
	    char letter = 'A';
           for(int i=0;i<rows;i++){
                  for(int j=0;j<rows;j++){
                         System.out.print(letter + " ");
			 letter++;
                  }
                 System.out.println();
           }
        }
}

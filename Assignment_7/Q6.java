import java.util.Scanner;
class Demo{
        public static void main (String [] args){
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the Rows:");
            int rows = sc.nextInt();

           for(int i=1;i<=rows;i++){
                  for(int j=1;j<=rows;j++){
                         System.out.print(j + " ");
                  }
                 System.out.println();
           }
        }
}

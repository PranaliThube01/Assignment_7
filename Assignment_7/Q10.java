import java.util.Scanner;
class Demo{
        public static void main (String [] args){
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the Rows:");
            int rows = sc.nextInt();

           for(int i=0;i<rows;i++){
                  for(int j=0;j<rows;j++){
                         System.out.print((j+1) + "" +(char)('a'+j) + " " );
                  }
                 System.out.println();
           }
        }
}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //first question

        String name[] = new String[]{"Saleh", "khalid", "majed"};
         try {
              System.out.println(name[6]);
          }  catch(Exception e){
             System.out.println("this is out of range ");

          }
        System.out.println("-----------------------");

         //question2

        try {
            divideebyfive(7);
        } catch(ArithmeticException e){

            System.out.println("the number cant be divided");
        }



        }






    public static void divideebyfive(int a) throws ArithmeticException{
        if (a/5==0) {
            System.out.println("the number can be divided");

        }
        else {
            throw new ArithmeticException("demo");

        }

}


}
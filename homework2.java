public class Main {
    public static void main(String[] args) {

        System.out.println(primenumber(6));
        System.out.println(calctax(130));

    }

    public static String primenumber(int a) {

        if (a <= 1)
        {
            return "is not prime number";
        }

        for (int i = 2; i < a / 2; i++)
        {
            if ((a % i) == 0)
                return "is not prime";
        }
            return "its prime ";
        }

public static double calctax(double price) {
    if (price>=100&&price<=500){
        return price*15/100;
    }
    return 0 ;
}
    }


public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        //question1
        String name[] = new String[]{"Saleh", "khalid", "majed"};
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        System.out.println("----------------------");

        //question2
        for (int i = 0; i < 33; i++) {
            if (i % 5 == 0) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }System.out.println("------------");

        System.out.println("------------");

        //question3

        String val[] = new String[]{"ahmed", "sara", "lama", "hala", "saleh"};
        for (int i = 4; i > 0; i--) {
            System.out.print(val[i] + " ");
        }
        System.out.println("---------------------");

        System.out.println("---------------------");

        //question4
        String oop[] = new String[]{"hala ", "lama ", "sara ", "ahad ", "karam ", "mohamed ", "sara ", "reema ", "tota ", "ahmed "};
        for (int i = 0; i < 10; i++) {

            if ((oop[i].charAt(0)) == 'a') {
                continue;
            } else {
                System.out.print(oop[i]);
            }

        }
        System.out.println("---------------------");

        System.out.println("---------------------");

        //question5
        prinarr();
        System.out.println("---------------------");


        //question6
        int arre[] = three(5, 3, 4);
        System.out.println("---------------------");

        //question7

        String lo=mess(" muneera"," alweheibi");
        System.out.println(lo);
        System.out.println("---------------------");

        //question8
        System.out.println("the average is "+av(6,2,4,1));
        System.out.println("---------------------");

        //question9
        int [] pee=new int[]{10,9,2,5};
        System.out.println("the largest number in the array is "+ook(pee));




    }

    static void prinarr() {
        String lolo[] = new String[]{"hala", "maram", "jazi"};
        for (int i = 0; i < lolo.length; i++) {
            System.out.println(lolo[i]);
        }


    }

    public static int[] three(int a, int b, int c) {
        int[] num;
        num = new int[3];
        num[0] = a;
        num[1] = b;
        num[2] = c;

        return num;

    }
    public static String mess(String name,String last){
        String fin = " hello "+name+last;
        return fin;


    }
    public static int av(int a,int b,int c,int d){

        int sum=a+b+c+d;
        int aver=sum/2;
        return aver;


    }
    public static int ook(int b[]){
        int big=1;
        for (int i = 0; i < b.length; i++) {

            if (b[i]>big)
                big=b[i];

        }
        return big;

    }
}


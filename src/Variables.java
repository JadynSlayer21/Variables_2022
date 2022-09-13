public class Variables
{
    public static void main ( String[] args )
    {
        //define 1 variable of each of the
        //following data types
        //byte	short		int 		long
        //float	double
        //char      boolean	String

        //integer variables
        byte byteOne = 127;
        short a = 1;
        int num1 = a;
        long lnum = 1000;
        float f1 = (float) 5.8;
        double dnum = 105.6982;
        char ch = 'A';
        boolean school = true;
        String schoolName = "Lubbock High School";

        System.out.println("/////////////////////////////////");
        System.out.println("*Some Person            07/18/22*");
        System.out.println("*                               *");
        System.out.println("*        integer types          *");
        System.out.println("*                               *");
        System.out.println("*8 bit - byteOne = "+byteOne+"\t\t*");
        System.out.println(num1 + f1);
        System.out.println(ch + a);
        System.out.println("What school do you go to?"+schoolName+"");
        System.out.println("Do you actually go there?"+school+"");
        System.out.print(lnum-dnum);
        System.out.print("=long - double");
    }
}
// import java.util.Scanner;

public class bit_manipulation 
{
    public static void main(String[] args) 
    {

        // count bits form right to left, eg (0101) position
        // 0 and postion 2 has 1 and postion 1 and 3 has 0



        // get bit --- (1) perform bit mask: 1<<i (2) operation and (&)
        // int n = 5; // 0101 
        // int pos = 3;
        // int bitMask = 1 << pos;

        // if((bitMask & n) == 0)
        // {
        //     System.out.println("Bit was 0");
        // }
        // else
        // {
        //     System.out.println("Bit was 1");
        // }



        // set bit --- (1) perform bit mask: 1<<i (2) operation or(|)
        // int n = 5; // 0101
        // int pos = 1;
        // int bitMask = 1 << pos;

        // int newNumber = bitMask | n;
        // System.out.println(newNumber);



        // clear bit --- (1) perform bit mask: 1<<i (2) operation and with not
        // --- perform NOT for bit mask and then with the result perform AND with the original number
        // int n = 5; //0101
        // int pos = 2;
        // int bitMask = 1 << pos;
        // int notBitMask = ~(bitMask);

        // int newNumber = notBitMask & n;
        // System.err.println(newNumber);



        // update bit --- case(1)-- for 0 --(1) bit mask: 1<<i (2) operation: AND with NOT (basically clear bit)
        //            --- case(2)-- for 1 --(1) bit mask: 1<<i (2) operation: OR (basically set bit)
        // Scanner sc = new Scanner(System.in);
        // int oper = sc.nextInt();  // oper = 1: set ,, oper = 0: clear
        // int n = 5; // 0101
        // int pos = 1;
        // int bitMask = 1 << pos;

        // if(oper == 1)
        // {
        //     // set 
        //     int newNumber = bitMask | n;
        //     System.out.println(newNumber);
        // }
        // else
        // {
        //     // clear
        //     int newBitMask = ~(bitMask);
        //     int newNumber = newBitMask & n;
        //     System.out.println(newNumber);
        // }
        // sc.close();
    }    
}

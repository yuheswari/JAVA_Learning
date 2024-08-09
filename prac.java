import java.util.Scanner;
class prac{
    public static void main(String args[]){
        Scanner uk = new Scanner(System.in);
        String name=uk.nextLine();
        int age=uk.nextInt();
        uk.nextLine();
        String addr=uk.nextLine();
        System.out.println("My name is:"+name);
        System.out.println("My Age is:"+age);
        System.out.println("My address is:"+addr);

    }
}
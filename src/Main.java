import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //  System.out.println("Hello world!");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("san jazynyz ");
//        int a= scanner.nextInt();
//        int factorial=1;
//
//
//        for(int i =1;i<=a; i++){
//            factorial=factorial*i;
//
//        }
//        System.out.println("factorial  "+factorial);
  //      Scanner scanner=new Scanner(System.in);
// int san = scanner.nextInt();

//
     // System.out.printf("%d * %d=%d\n",san,a,san*a);  //таблица 1де 10го ;
 //}


        System.out.println(isPalindrome("kazak"));     }
    static boolean isPalindrome(String text){
        String s1= text.toUpperCase().replaceAll("a-a","");
        StringBuffer s2=new StringBuffer(s1).reverse();
        boolean otvet=true;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!=s2.charAt(i)){
                otvet=false;
                break;
            }
        }        return otvet;
}}
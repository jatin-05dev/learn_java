// import java.util.*; 
// class Inputin{
//      public static void main(String args[]){
//         Scanner obj=new  Scanner(System.in);
//         String name=obj.next();
//         System.out.println(name);
//      }
// }

// import java.util.*; 
// class Inputin{
//      public static void main(String args[]){
//         Scanner obj =new Scanner(System.in);
//          System.out.println("enter a num");
//            int a=obj.nextInt();
//       System.out.println("enter a num");
//    int b=obj.nextInt();
//    System.out.println(a+b);
//      }
// }



// import java.util.*;
// class Inputin{
//   public static void printname(String name){
        // System.out.println(name);
//   }
// 
    // public static void main(String args[]){
        // Scanner obj= new Scanner(System.in);
        // String name=obj.nextLine();
        // printname(name);
    // }
// }


// import java.util.*;
// class Inputin{
    //  public static int add(int a,int b){
        //  return a+b;
    // }
    // public static void main(String args[]){
        // Scanner obj = new Scanner(System.in);
        // int a= obj.nextInt();
        // int b= obj.nextInt();
        // System.out.println(add(a,b));
        // 
    // }
// }


import java.util.*;
class Inputin{
    public static int  fac( int number){
        int fac=1;
        for(int i=1;i<=number;i++){
             fac*=i;
        }
        return fac;
    }
    public static void main(String args[]){
        Scanner obj =new Scanner(System.in);
        int number=obj.nextInt();
        System.out.println(fac(number));
    }
}

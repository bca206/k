import java.util.*;
class arithamtic_test{
    int array[]={10,20,30,40};
    int num1=50,num2=10;{
    try{
        System.out.println(num1/num2);
        System.out.println("4th elements of array is"+array[4]);
        System.out.println("5th elements of array is"+array[5]);
    }
    catch (ArrayIndexOutOfBoundsException e){
        System.out.println(e);
    }
    catch (ArithmeticException e){
        System.out.println(e);
    }
    catch (Exception e){
        System.out.println(e);
    }
  }
}
public class lab11 {
    public static void main(String[] args) {
        arithamtic_test obj=new arithamtic_test();
        System.out.println("program over");
    }
}

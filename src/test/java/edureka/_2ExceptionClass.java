package edureka;

import org.testng.annotations.Test;

public class _2ExceptionClass {


    @Test(expectedExceptions = ArithmeticException.class)
    public void exceptionTest(){
        int a=10,b=0;
        int c=a/b;
    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void exceptionTest3(){
        int[]arr=new int[]{1,2,3};

        for (int i = 0; i <=arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}

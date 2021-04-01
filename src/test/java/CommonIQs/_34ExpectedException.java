package CommonIQs;

import org.testng.annotations.Test;

public class _34ExpectedException {

    @Test(expectedExceptions = ArithmeticException.class)
    public void expectedExceptionMethod1(){
        int a=10, b=0;
        int c=a/b;
    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void expectedExceptionMethod2(){
        int[]array=new int[]{1,2,3,45,5};
        for (int i = 0; i <=array.length; i++) {
            if(array[i]==5){
                System.out.println("Reached end...");
            }
        }
    }
}

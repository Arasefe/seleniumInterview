package CommonIQs;

import org.testng.annotations.Test;

public class _34ExpectedException {
    @Test(expectedExceptions = ArithmeticException.class)
    public void expectedExceptionMethod(){
        int a=10, b=0;
        int c=a/b;
    }
}

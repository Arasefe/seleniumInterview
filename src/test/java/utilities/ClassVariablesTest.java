package utilities;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ClassVariablesTest {
    private static int num;

    @Test
    public void test1(String str){
        num+=Integer.parseInt(str);
        System.out.println(num);
    }

    @Test
    public void test2(String str){
        num*=Integer.parseInt(str);
        System.out.println(num);
    }

    @Test
    public void test3(String str){
        num/=Integer.parseInt(str);
        System.out.println(num);
    }
}

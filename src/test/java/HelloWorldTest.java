import org.junit.Assert;
import org.junit.Test;

/**
 * Created by amit on 9/17/2016.
 */
public class HelloWorldTest {

    @Test
    public void shouldReturnMessage(){
        HelloWorld hello = new HelloWorld("Hello Amit");
        Assert.assertEquals("Hello Amit", hello.getMessage());
    }
}

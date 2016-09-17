/**
 * Created by amit on 9/17/2016.
 */
public class HelloWorld {
    private final String message;

    public static void main(String[] args) {
        System.out.println("HelloWorld");
    }

    public HelloWorld(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}

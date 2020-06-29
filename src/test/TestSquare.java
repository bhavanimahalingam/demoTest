import static org.junit.Assert.*;

public class SquareJunitTesting{
   public void test(){
	   main test=new main();
	   int output=test.square(4);
	   AssertEquals(16,output);
   }
}
import static org.junit.Assert.*;

public class CountJunitTesting{
   public void test(){
	   main test=new main();
	   int output=test.countA("bavani");
	   AssertEquals(2,output);
   }
}
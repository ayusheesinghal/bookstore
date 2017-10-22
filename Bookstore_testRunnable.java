

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Bookstore_testRunnable {

	   public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(Bookstore_unitTest.class);
			
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println("Junit tests successful: "+result.wasSuccessful());
	   }
	
}

package listeners;

import org.testng.ITestNGListener;
import org.testng.ITestResult;


public class TestNGListeners implements ITestNGListener{

	private int m_count = 0;
	 
	  public void onTestFailure(ITestResult tr) {
	    log("F");
	  }
	 
	  public void onTestSkipped(ITestResult tr) {
	    log("S");
	  }
	 
	  public void onTestSuccess(ITestResult tr) {
	    log(".");
	  }
	 
	  private void log(String string) {
	    System.out.print(string);
	    if (++m_count % 40 == 0) {
	      System.out.println("");
	    }
	  }
}

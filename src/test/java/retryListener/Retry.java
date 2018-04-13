package retryListener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
	private int maxCount=3;
	private int retryCount=0;
	
	@Override
	public boolean retry(ITestResult result) {
		if(retryCount<maxCount)
		{
			System.out.println("Retry of failed TC:"+result.getName()+" with status :"+getStatus(result.getStatus())+" count of retry: "+(retryCount+1)+" time(s).");
			retryCount++;
			return true;
		}
		else
		{
			return  false;
		}
	}
	
	public String getStatus(int status)
	{
		String statusResult = null;
		if(status==1)
			statusResult = "SUCCESS";
		if(status==2)
			statusResult = "FAIL";
		if(status==3)
			statusResult = "SKIP";
		
		return statusResult;
	}
}

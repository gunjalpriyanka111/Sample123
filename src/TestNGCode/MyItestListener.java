package TestNGCode;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyItestListener implements ITestListener{


//this is the std. code for listener.the prog.on which we want to execute the listener just give class name of that prog. in xml file 
	
@Override
public void onFinish(ITestContext context) {        //this method of listener will call when test finish. otherwise it will not execute this code
	ITestListener.super.onFinish(context);
	Reporter.log("Test started" +context.getName());
}	
	
@Override
	public void onTestFailure(ITestResult result) {     //this method of listener will call when test fail. otherwise it will not execute this code
	ITestListener.super.onTestFailure(result);
	Reporter.log("Test get failed");
	}


@Override
	public void onTestStart(ITestResult result) {        //this method of listener will call when test start. otherwise it will not execute this code
		ITestListener.super.onTestStart(result);
		Reporter.log("Test started");

	}
	}





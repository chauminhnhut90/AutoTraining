package BaiTapBuoi15;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerB15 implements IRetryAnalyzer {
    int counter = 0;
    int retryLimit = 5;

    public boolean retry(ITestResult result) {

        if(counter < retryLimit)
        {
            counter++;
            return true;
        }
        return false;
    }
}

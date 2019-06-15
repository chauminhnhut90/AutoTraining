package FahashaBuoi13;
import CustomAnnotation.RetryCountIfFailed;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    int counter = 0;
    int retryLimit = 5;


   // @Override
    public boolean retry(ITestResult result) {

        if(counter < retryLimit)
        {
            System.out.println("Retrying test " + result.getName() + " with status "
                    + getResultStatusName(result.getStatus()) + " for the " + (counter+1) + " time(s).");
            counter++;
            return true;
        }
        return false;
    }

    public String getResultStatusName(int status) {
        String resultName = null;
        if(status==1)
            resultName = "SUCCESS";
        if(status==2)
            resultName = "FAILURE";
        if(status==3)
            resultName = "SKIP";
        return resultName;
    }



//    public boolean retry(ITestResult result){
//// check if the test method had RetryCountIfFailed annotation
//
//        RetryCountIfFailed annotation = result.getMethod().getConstructorOrMethod().getMethod()
//                .getAnnotation(RetryCountIfFailed.class);
//        // based on the value of annotation see if test needs to be rerun
//        if((annotation != null) && (counter < annotation.value()))
//        {
//            counter++;
//            return true;
//        }
//        return false;
//    }
}

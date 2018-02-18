package test1;

import com.eviware.soapui.tools.SoapUISecurityTestRunner;
import com.eviware.soapui.tools.SoapUITestCaseRunner;
import org.testng.annotations.Test;

public class SomeTest {

    @Test
    public void test1(){
        SoapUITestCaseRunner testCaseRunner = new SoapUITestCaseRunner();
        testCaseRunner.setProjectFile("speller-yandex-soapui-project.xml");
        testCaseRunner.setPrintReport(true);
        SoapUISecurityTestRunner soapUISecurityTestRunner = new SoapUISecurityTestRunner();
        try {
            testCaseRunner.runRunner();
            soapUISecurityTestRunner.runRunner();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

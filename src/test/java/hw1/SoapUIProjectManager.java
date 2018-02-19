package hw1;

import com.eviware.soapui.tools.SoapUITestCaseRunner;
import org.testng.annotations.Test;

public class SoapUIProjectManager {

    @Test
    public void checkManagementOpportunity() {
        SoapUITestCaseRunner testCaseRunner = new SoapUITestCaseRunner();
        testCaseRunner.setProjectFile("speller-yandex-soapui-project.xml");
        testCaseRunner.setPrintReport(true);
        try {
            testCaseRunner.runRunner();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

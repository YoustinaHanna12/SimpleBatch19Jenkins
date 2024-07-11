package Class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        System.out.println("iam before method");
    }

    @Test(groups = "smoke") // de 3lshan natba3 excued bas Case A

    public void ATestCase() {
        System.out.println("iam test case A");
    }

    @Test
    public void BTestCase() {
        System.out.println("iam test case B");
    }

    @AfterMethod(alwaysRun = true)
    // Hena 7ataina (alwaysRun = true) hay3mal excused el code kolo before and after method
    public void afterMethod() {
        System.out.println(" iam after method");
    }


}
// we need to run outside the class } to run th whole code ; run annotations
// and without writing annotation which is @Test will not execute the code
// Alphabetical order will be the result; for example will be printed first
// Atestcase and the Btestcase EVEN if i write the btestcase first before the Atestcase
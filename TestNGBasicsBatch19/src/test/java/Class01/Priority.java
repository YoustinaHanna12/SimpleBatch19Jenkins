package Class01;

import org.testng.annotations.Test;

public class Priority {
    @Test (priority = 3)
    public  void AtestCase(){

        System.out.println("I am test case A");
   }
    @Test (priority = 2)
    public  void BtestCase(){
        System.out.println("I am test case B");
    }

    @Test (priority = 1)
    public  void CtestCase(){
        System.out.println("I am test case C");
    }

    @Test
    public void DtestCase(){
        System.out.println("I am test case D");
    }

}

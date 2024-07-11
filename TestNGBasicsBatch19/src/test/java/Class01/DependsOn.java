package Class01;

import org.testng.annotations.Test;

public class DependsOn {
    @Test
    public void login(){
        System.out.println(10/0);
    }

    @Test (dependsOnMethods =  {"login"})
    public void dashBoard(){
        System.out.println("I am dashBoard");
    }
}

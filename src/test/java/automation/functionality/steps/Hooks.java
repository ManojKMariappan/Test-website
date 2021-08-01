package automation.functionality.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static automation.functionality.utils.DriverUtils.getDriver;
import static automation.functionality.utils.DriverUtils.tearDown;

public class Hooks {
    @Before
   public void setUp(){
        getDriver(); }

    @After
    public void teardown(){
   tearDown();
 }
}

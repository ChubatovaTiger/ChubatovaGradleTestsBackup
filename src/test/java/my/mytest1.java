package my;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import java.lang.*;
import org.apache.log4j.Logger;

Logger log = Logger.getLogger(JUnitTest.class.getName());

public class mytest1 {

    @Test
    public void test11c() {
        //if (System.currentTimeMillis()%3==1){
        //}
        //else {
            Assert.fail("fail mk");
System.out.print("GfG1d");
        //};

    };
    @Test
    public void test12c() {
        try 
            {
                //Thread.sleep(180000);
            Thread.sleep(90);
            } 
            catch(InterruptedException e)
            {
            // this part is executed when an exception (in this example InterruptedException) occurs
            }
        if (System.currentTimeMillis()%3==1){
        }
        else {
          //
        };

    };
    @Test
    public void test13c() {
        if (System.currentTimeMillis()%1==1){
        }
        else {
            Assert.fail("fail messajge2");
            
            log.info("hi from the test output");
        };

    };

}

package com.jh.pattern.test;

import com.jh.pattern.test.inter.ICar;
import com.jh.pattern.test.inter.IDriver;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Test;

public class DriverTest {
    Mockery context = new JUnit4Mockery();
    @Test
    public void testDriver(){
        final ICar car = context.mock(ICar.class);
        IDriver driver = new Driver();
        context.checking(new Expectations(){{oneOf (car).run();}

        });
        driver.drive(car);
    }



}

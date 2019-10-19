package waitservices;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class FluentWaitServices extends waitservices.Wait {

    Wait<WebDriver> fluentWait;

    FluentWaitServices() {
        fluentWait = new FluentWait<WebDriver>(webdriver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(500, TimeUnit.MILLISECONDS);
    }

    FluentWaitServices(int timeOutSeconds, int poolingEverySeconds) {
        fluentWait = new FluentWait<WebDriver>(webdriver)
                .withTimeout(timeOutSeconds, TimeUnit.SECONDS)
                .pollingEvery(poolingEverySeconds, TimeUnit.SECONDS);
    }

    FluentWaitServices(int timeOutSeconds, int poolingEverySeconds, Exception ignoreException) {
        fluentWait = new FluentWait<WebDriver>(webdriver)
                .withTimeout(timeOutSeconds, TimeUnit.SECONDS)
                .pollingEvery(poolingEverySeconds, TimeUnit.SECONDS)
                .ignoring(ignoreException.getClass());
    }


}

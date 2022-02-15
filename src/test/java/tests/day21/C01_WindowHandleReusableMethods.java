package tests.day21;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.day20.ReusableMethod;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.Set;

public class C01_WindowHandleReusableMethods {
    @Test
    public void test01(){
        //https://demoqa.com/browser-windows gidin
        //new tab butonunu basalm
        //new tab'a gecip title'nin "new tab" oldugunu test edin

        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        String ilkSayfaWindowHandle=Driver.getDriver().getWindowHandle();
        Driver.getDriver().findElement(By.linkText("Click Here")).click();

        Set<String> handleSet=Driver.getDriver().getWindowHandles();
        String ikinciSayfaHandle="";

        for(String each: handleSet){
            if(!each.equals(ikinciSayfaHandle)){
                ikinciSayfaHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaHandle);

        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

        Driver.closeDriver();
    }
   
}

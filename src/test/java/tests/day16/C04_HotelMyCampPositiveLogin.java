package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C04_HotelMyCampPositiveLogin {
    @Test(groups = {"miniRegression","smoke"})
    public void pozitifLoginTesti(){
        //1 ) Bir Class olustur : PositiveTest
        //2) Bir test method olustur positiveLoginTest()
        //   https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get("https://www.hotelmycamp.com/");

        //   login butonuna bas
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLink.click();

        //   test data username: manager ,
        hotelMyCampPage.usernameBox.sendKeys("manager" + Keys.ENTER);

        //   test data password : Manager1!
        hotelMyCampPage.passwordBox.sendKeys("Manager1!" + Keys.ENTER);
        hotelMyCampPage.loginButtonu.click();

        //   Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
    }
}

package tests.day17;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_PropertiesIlkClass {
    @Test
    public void pozitiveLoginTest(){
        //HotelMyCamp sitesine positive login testini POM'a tam uygun olarak yapin
        //https://www. hotelmycamp.com/ adresine git
        //Driver.getDriver().get("Buraya Properties dosyasina git HMCUrl'e karsilik gelen degeri getir");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        //        login butonuna bas
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLink.click();

        //    test data username: manager ,
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));

        //    test data password : Manager1!
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.loginButtonu.click();

        //    Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCampPage.basariliGirisYaziElementi.isDisplayed());
    }
}

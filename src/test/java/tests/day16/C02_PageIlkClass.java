package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageIlkClass {



    //POM'da farkli class'lara farkli sekilde ulasilmasi benimsenmistir
    //Driver class'i icin static yontemi kullnaiyoruz
    //Page Class'lari icin ise obje uzerindne kullanilmasi tercih edilmistir

    @Test
    public void test01(){
        //Amzon'a gidelim
        Driver.getDriver().get("https://www.amazon.com");

        //arama kutusuna Nutella yazip aratalim
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        //Atama sonuclarinin Nutella icerdigini test edelim
        String actualSonuc=amazonPage.sonucYazisiElement.getText();
        Assert.assertTrue(actualSonuc.contains("Nutella"));

        Driver.closeDriver();
    }

    @Test
    public void test02(){
        //amazon gidelim
        Driver.getDriver().get("https://www.amazon.com");

        //java icin arama yapalim
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Java" + Keys.ENTER);

        //aonucun java icerdigini test edelim
        String sonucYazisiStr=amazonPage.sonucYazisiElement.getText();
        Assert.assertTrue(sonucYazisiStr.contains("Java"));
    }
}

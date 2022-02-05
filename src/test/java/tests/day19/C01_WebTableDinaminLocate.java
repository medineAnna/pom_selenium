package tests.day19;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_WebTableDinaminLocate {
    HMCWebTablePage hmcWebTablePage;
    HotelMyCampPage hotelMyCampPage;

    @Test
    public void satirYazdirTesti(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();

        //1.Method: satir numarasi verdigimde bana o satirdaki datalari yazdirsin
        hmcWebTablePage=new HMCWebTablePage();
        WebElement ucuncuSatirElementi=hmcWebTablePage.satirGetir(4);
        System.out.println(ucuncuSatirElementi.getText());

        Driver.closeDriver();
    }
    @Test
    public void hucreGetirTesti(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();

        //2.Method: satir ve data numarasi girdigimde, verdigim datayi yazdirsin
        hmcWebTablePage=new HMCWebTablePage();

        //2.satirin 4.datasi
        //4.satirin 5.datasi
        System.out.println("Girdiginiz hucredeki element:  " + hmcWebTablePage.hucreWebelementGetir(3,5));
        Driver.closeDriver();
    }
    @Test
    public void sutunYazdirTesti(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();

        //3.Method: sutun numarasi verdigimde bana tum sutunu yazdirsin
        hotelMyCampPage=new HotelMyCampPage();
        hmcWebTablePage.sutunYazdir(4);
        Driver.closeDriver();
    }
}

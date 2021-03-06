package tests.day18;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utilities.Driver;

import java.util.List;

public class C02_WebTables {
    HotelMyCampPage hotelMyCampPage;
    HMCWebTablePage hmcWebTablePage;
    @Test
    public void loginT(){
        //● Bir class oluşturun : C02_WebTables
        //● login( ) metodun oluşturun ve oturum açın.
        //● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
        //            ○ Username : manager
        //            ○ Password : Manager1!
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();

        //● printRows( ) metodu oluşturun //tr
        //            ○ table body’sinde bulunan toplam satir(row) sayısını bulun.
        //            ○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
        //            ○ 4.satirdaki(row) elementleri konsolda yazdırın.
    }
    @Test(dependsOnMethods = "loginT")
    public void table(){
        //● table( ) metodu oluşturun
        //            ○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
        //header kisminda birinci satir ve altindaki datalari locate edelim
        //  //thead//tr[1]//th
        hmcWebTablePage=new HMCWebTablePage();
        List<WebElement> headerDataList=hmcWebTablePage.headerBirinciSatirDatalar;
        System.out.println("Tablodaki sutun sayisi: " + headerDataList.size());

        //            ○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
        //   //tbody
        System.out.println(hmcWebTablePage.tumBodyWEbElement.getText());

        //eger body'e tek bir Webelement olarak locate edersek,icindeki tum datalari getText ile yazdirabiliriz
        //ancak bu durumda bu elementler ayri ayri degil body'nin icindeki tek bir sey String'n parcalari olurlar
        //dolayisiyla bu elementlere tek tek ulasmamiz mumkun olmaz
        //sadece contains methody ile, body'de olup olmadigini test edebiliriz
        //eger her bir data'yi ayri ayri almak istersek //tbody//td seklnde
        //locate edip, bir liste atabiliriz
        List<WebElement>bodyTumDataList=hmcWebTablePage.tumBodyDatalariList;
        System.out.println("Body'deki data sayisi: " + bodyTumDataList);
    }
    @Test(dependsOnMethods = "loginT")
    public void printRows(){
        hmcWebTablePage=new HMCWebTablePage();
        System.out.println(hmcWebTablePage.satirlarListesi.size());
        List<WebElement>satirlarWebelementListesi=hmcWebTablePage.satirlarListesi;
        for (WebElement each:satirlarWebelementListesi) {
            System.out.println(each.getText());
        }
        System.out.println("4.satir: " + satirlarWebelementListesi.get(3).getText());

    }
}

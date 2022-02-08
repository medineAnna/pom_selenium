package tests.day19;

import org.testng.annotations.Test;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_WebTableDemoqa {
    //Bir Class olusturun D19_WebtablesHomework

    @Test(groups = {"smoke","regression"})
    public void demoqaTest(){
        //  1. “https://demoqa.com/webtables” sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("DemoqaUrl"));

        //  2. Headers da bulunan department isimlerini yazdirin
        //  normalde //thead//th, ancak tablo'da class isimleri ile organize edilmis
        DemoqaPage demoqaPage=new DemoqaPage();
        System.out.println("Basliksatiri Elementi: " + demoqaPage.baslikSatiriElementi.getText());
        //2.tontem ===basliklari bir listeye koyabilirim

        //  3.   3. sutunun basligini yazdirin
        System.out.println("Ucuncu sutun Basligi " + demoqaPage.baslikWebelementListesi.get(2).getText());

        //  4. Tablodaki tum datalari yazdirin
        System.out.println("=========Tum Body========");
        System.out.println(demoqaPage.bodyTekWebelement.getText());

        //  5. Tabloda kac cell (data) oldugunu yazdirin
        System.out.println("Tablodaki data Sayisi: " + demoqaPage.tumDataWebelementList.size());

        //  6. Tablodaki satir sayisini yazdirin
        System.out.println("Tum satir sayisi: " + demoqaPage.tumSatirWebelementList.size());

        //  7. Tablodaki sutun sayisini yazdirin
        //  farkli yollardan hesaplanabilir, ama biz hucre sayisi bolu satir sayisi yapalim
        System.out.println("Tablodaki sutun sayisi: " +
                (demoqaPage.tumDataWebelementList.size()/demoqaPage.tumSatirWebelementList.size()));

        //  8. Tablodaki 3.kolonu(sutun) yazdirin
        demoqaPage.sutunYazdir(3);

        //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        demoqaPage.ismeGoreMaasYazdir("Kierra");

        //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin
        demoqaPage.hucreYazdir(2,3);

        Driver.closeDriver();
    }
}

package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_SatirSayisi {
    @Test
    public void test01() throws IOException {
        //ulkeler excel'deki Sayfa1 ve Sayfa2'deki satir sayilarini
        //ve kullanilan satir sayilarini

        String path="src/test/java/reseurces/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);

        Workbook workbook= WorkbookFactory.create(fis);
        int sayfa1SatirSayisi=workbook.getSheet("Sayfa1").getLastRowNum();
        int sayfa1FizikiKullanilanSatirSayi=workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();
        System.out.println("1.Sayfa Satir sayisi: " + sayfa1SatirSayisi);
        System.out.println("1.Sayfa fizikal Satir sayisi: " + sayfa1FizikiKullanilanSatirSayi);

        //fiziki  kullanilan satir sayisi Sayfa2
        int sayfa2SatirSayisi=workbook.getSheet("Sayfa2").getLastRowNum();
        int sayfa2FizikiKullanilanSatirSayi=workbook.getSheet("Sayfa2").getPhysicalNumberOfRows();
        System.out.println("2.Sayfa Satir sayisi: " + sayfa2SatirSayisi);
        System.out.println("2.Sayfa fizikal Satir sayisi: " + sayfa2FizikiKullanilanSatirSayi);
    }
}

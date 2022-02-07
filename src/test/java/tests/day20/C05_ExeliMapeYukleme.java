package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.Map;

public class C05_ExeliMapeYukleme {
    @Test
    public void test01(){
        //dosya yolu ve sayfa ismi verilen bir excel sheet'i map olarak kayit eden
        //reusable bir method olusturalim
        String path="src/test/java/reseurces/ulkeler.xlsx";
        String sayfaAdi="Sayfa1";

        Map<String,String> ulkelerMap=ReusableMethod.mapOlustur(path,sayfaAdi);

        //olusturdugumuz map'i kullanarak ulke ismi Turkey'in bilgilerini yazdirin
        System.out.println(ulkelerMap.get("Turkey"));

        //liste'de Netherlands oldugunu test edin
        Assert.assertTrue(ulkelerMap.containsKey("Netherlands"));

    }
}

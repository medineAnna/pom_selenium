package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;

public class C03_ReusableRunner {
    @Test
    public void test01(){
        //ulkeler excel'deki, sayfa1'de
        //11.index'deki satirin, 2.index'deki hucresinin Azerbaycan oldugunu test et

        String path="src/test/java/reseurces/ulkeler.xlsx";
        String expectedData="Azerbaycan";
        String actualData=ReusableMethod.hucreGetir(path,"Sayfa1",11,2).toString();
        Assert.assertEquals(actualData,expectedData);

    }
}

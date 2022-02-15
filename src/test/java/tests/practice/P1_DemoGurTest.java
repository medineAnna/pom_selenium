package tests.practice;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class P1_DemoGurTest {
    @Test
    public void test01(){
        /*
    http://demo.guru99.com/test/drag_drop.html url e git
    DEBIT SIDE da Account bolumune BANK butonunu surukle ve birak
    CREDIT SIDE da Account bolumune SALES butonunu surukle ve birak
    DEBIT SIDE da Amount bolumune 5000 butonunu surukle ve birak
    CREDIT SIDE da Amount bolumune ise ikinci 5000  butonunu surukle ve birak
    Perfect butonun goruntulendigini dogrulayin
     */
        Driver.getDriver().get(ConfigReader.getProperty("demoGuruUrl"));

    }
}

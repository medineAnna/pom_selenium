package tests.day17;

import org.testng.annotations.Test;
import utilities.Driver;

public class C04_SingletonPattern {
    @Test
    public void test01(){}
    //bir class'dan birden fazla obje uretilmesine izin vermeyen bir pattern
    //biz Driver class'ni driver uretmek uzere kullaniyoruz
    //ancakk Driver class'nda driver isminde bir instance variable de var
    //ve biz obje ureterek bu nstance driver'a ulasabiliriz
    Driver driver1=new Driver();
    Driver driver2=new Driver();

    // Singleton Pattern kabul gormus bir pattern'dir
    // amac bir class'tan obje uretilmemesini saglamaktir
    // bunun icin sigleton Pattern'de koruyacagimiz calss'ta
    // parametresiz bir consructor olusturur ve bu constructor'ı PRIVATE yapariz..
}

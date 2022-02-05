package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.List;

public class HMCWebTablePage {
    public HMCWebTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//thead//tr[1]//th")
    public List<WebElement> headerBirinciSatirDatalar;

    @FindBy(xpath = "//tbody")
    public WebElement tumBodyWEbElement;

    @FindBy(xpath = "//tbody//td")
    public List<WebElement >tumBodyDatalariList;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> satirlarListesi;

    public WebElement satirGetir(int satirNo){
        //2.satiri yazdir=== //tbody//tr[2]

        String satirDinamikXpath="//tbody//tr["+ satirNo + "]";
        WebElement satirElementi=Driver.getDriver().findElement(By.xpath(satirDinamikXpath));
        return satirElementi;
    }

    public String hucreWebelementGetir(int satir, int sutun) {
        //2.satirin 4.datasi
        //4.satirin 5.datasi
        String dinamikHucreXpath="//tbody//tr["+ satir +"]//td["+ sutun +"]";//dinamik olmasi icin yaptik
        WebElement istenenHucreElementi=Driver.getDriver().findElement(By.xpath(dinamikHucreXpath));
        String hucreDatasi=istenenHucreElementi.getText();

        return hucreDatasi;
    }

    public void sutunYazdir(int sutun) {
        //her bir satirdaki istenen sutun elementini yazdirabilmek icin
        //once satir sayisini bilmeliyiz

        int satirSayisi=satirlarListesi.size();

        for (int i = 1; i <=satirSayisi; i++) {
            System.out.println(hucreWebelementGetir(i,sutun));
        }
    }
}

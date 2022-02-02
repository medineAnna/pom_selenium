package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    //bir page class'i actigimizda ilk yapmamiz gereken sey
    //parametresiz constructor olusturup
    //cons icinde PageFactory ile driver'a ilk deger atamasini yapmak olmali

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement amazonAramaKutusu;

    @FindBy(xpath="//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYazisiElement;
}

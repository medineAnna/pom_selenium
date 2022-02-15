package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class P1_DemoGuruPage {
    public  P1_DemoGuruPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}

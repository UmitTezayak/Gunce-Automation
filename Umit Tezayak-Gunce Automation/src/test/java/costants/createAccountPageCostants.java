package costants;

import org.openqa.selenium.By;

public class createAccountPageCostants {
    public static final By packageSelection = By.xpath("//select[@id='choosePackage']");
    public static final By userNameText = By.xpath("//input[@id='Name']");
    public static final String userName = "Ümit";
    public static final By surnameText = By.xpath("//input[@id='Surname']");
    public static final String surname = "Tezayak";
    public static final By phoneNumText = By.xpath("//input[@id='phoneFormatValidate']");
    public static final String phoneNum = "05320568574";
    public static final By emailText = By.xpath("//input[@id='Email']");
    public static final String email = "umit.tezayak@gmail.com";
    public static final By companyNameText = By.xpath("//input[@id='CompanyName']");
    public static final String companyName = "Tezayak Grup3";
    public static final By serviceAgreement = By.xpath("//label[@for='IsServiceAgreement']");
    public static final By customerInfoBySmsCheckbox = By.xpath("//input[@id='BySMS']");
    public static final By customerInfoByMailCheckbox = By.xpath("//label[@for='ByEmail']");
    public static final By customerInfoByPhoneCheckbox = By.xpath("//input[@id='ByPhone']");
    public static final By createAccountButton = By.xpath("//button[@class='btn btn-primary btn-blue']");

}

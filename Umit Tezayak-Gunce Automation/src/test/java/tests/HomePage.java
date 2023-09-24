package tests;

import base.BaseClass;
import methods.Methods;
import static costants.BaseCostants.*;
import static costants.HomePageCostants.*;
import static costants.createAccountPageCostants.*;


import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.NoSuchElementException;


public class HomePage extends BaseClass {


    public static void createAccount() {
        Methods.waitClicableClick(clickToCreateAccount);
        Methods.dropDownElement(packageSelection);
        Methods.waitVisibilitySendKey(userNameText, userName);
        Methods.waitVisibilitySendKey(surnameText, surname);
        Methods.waitVisibilitySendKey(phoneNumText, phoneNum);
        Methods.waitVisibilitySendKey(emailText, email);
        Methods.waitVisibilitySendKey(companyNameText, companyName);
        Methods.waitClicableClick(serviceAgreement);
        Methods.waitVisibilityClick(customerInfoByMailCheckbox);
        Methods.waitClicableClick(createAccountButton);
        //Assert.assertEquals(Methods.findElement(teamMateVerificationElement).isDisplayed(), true);
    }

    public static void addingTeammate() {
        Methods.waitVisibilitySendKey(emailHomePageText, emailHomePage);
        Methods.waitVisibilitySendKey(passwordText, password);
        Methods.waitClicableClick(loginButtonHomePage);
        try {Thread.sleep(7000);}
        catch (InterruptedException e){
            e.printStackTrace();
        }
        Methods.waitClicableClick(ourOffice);
        Methods.waitClicableClick(teamMates);
        Methods.waitClicableClick(addMateButton);
        Methods.waitVisibilitySendKey(teamMatesNameText, teamMatesName);
        Methods.waitVisibilitySendKey(teamMatesSurnameText, teamMatesSurname);
        Methods.waitClicableClick(teamMatesNickname);
        Methods.dropDownElement1(teamMatesTitle);
        Methods.dropDownElement2(teamMatesCompany);
        Methods.waitVisibilitySendKey(teamMatesIdentityNumText, teamMatesIdentityNum);
        Methods.waitClicableClick(teamMatesGunceUser);
        Methods.waitClicableClick(personally);
        Methods.waitVisibilitySendKey(birthdayNumText, birthdayNum);
        Methods.waitClicableClick(birthdayNumPick);
        try {Thread.sleep(6000);}
        catch (InterruptedException e){
            e.printStackTrace();
        }
        Methods.dropDownElement3(employeeType);
        try {Thread.sleep(5000);}
        catch (InterruptedException e){
            e.printStackTrace();
        }
        Methods.waitClicableClick(teamMatesSaveAndClose);
        try {Thread.sleep(6000);}
        catch (InterruptedException e){e.printStackTrace();
        }
        Methods.waitVisibilitySendKey(searchTeamMateText, searchTeamMate);
        try {driver.findElement(By.xpath("//span[text()='Mehmet Erkan ']"));
        System.out.println("Element exists");}
        catch (NoSuchElementException e){
            System.out.println("Element not exists");
        }
    }

    public static void addExpense() {
        Methods.waitVisibilitySendKey(emailHomePageText, emailHomePage);
        Methods.waitVisibilitySendKey(passwordText, password);
        Methods.waitClicableClick(loginButtonHomePage);
        try {Thread.sleep(7000);}
        catch (InterruptedException e){
            e.printStackTrace();
        }
        try {driver.findElement(By.xpath("//li/h4[text()=' Ümit Tezayak ']"));
            System.out.println("Element exists");}
        catch (NoSuchElementException e){
            System.out.println("Element not exists");}

        Methods.waitClicableClick(expensesMenu);
        Methods.waitClicableClick(addExpensesButton);
        Methods.waitClicableClick(addExpensesButton);
        Methods.waitClicableClick(addExpensesChoice);
        Methods.waitVisibilitySendKey(fileAreaText, fileAreaTextEntry);
        Methods.waitClicableClick(fileAreaTextEntryChoice);
        Methods.dropDownExpenseCategory(expenseCategory1);
        Methods.dropDownExpenseSubcategory(expenseSubCategory1);
        Methods.waitClicableClick(nonFile);
        Methods.waitVisibilitySendKey(whyNotFileText, whyNotFile);
        Methods.waitVisibilitySendKey(whyNotFileDateText, whyNotFileDate);
        Methods.waitClicableClick(whyNotFileDatePick);
        Methods.waitVisibilitySendKey(explanationTextArea, explanation1);
        Methods.waitVisibilitySendKey(totalAmountText, totalAmount);
        Methods.clearToElement(clientAmountText);
        Methods.waitVisibilitySendKey(clientAmountText, clientAmount);
        Methods.clearToElement(vatTotalAmountText);
        Methods.waitVisibilitySendKey(vatTotalAmountText, vatTotalAmount);
        Methods.waitVisibilitySendKey(amortisationYearText, amortisationYear);
        try {Thread.sleep(10000);}
        catch (InterruptedException e){
            e.printStackTrace();
        }
        Methods.waitClicableClick(saveExpenseButton);
        try {Thread.sleep(10000);}
        catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.get(URL_GUNCE);
        try {Thread.sleep(10000);}
        catch (InterruptedException e){
            e.printStackTrace();
        }
        Methods.waitClicableClick(expensesMenu);
        try {driver.findElement(By.xpath("//tbody[@role='presentation']/tr[1]/td[2][text()='20.09.2023']"));
            System.out.println("Element exists");}
        catch (NoSuchElementException e){
            System.out.println("Element not exists");
        }
    }

}





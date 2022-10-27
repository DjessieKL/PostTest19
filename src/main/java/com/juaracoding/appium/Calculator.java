package com.juaracoding.appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Calculator {
    public AndroidDriver<MobileElement> driver;

    public Calculator(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //Locator
    @AndroidFindBy(id = "com.android.calculator:id/digit_1")
    MobileElement btnSatu;
    @AndroidFindBy(id = "com.android.calculator:id/digit_2")
    MobileElement btnDua;
    @AndroidFindBy(id = "com.android.calculator:id/digit_3")
    MobileElement btnTiga;

    @AndroidFindBy(id = "com.android.calculator:id/digit_4")
    MobileElement btnEmpat;

    @AndroidFindBy(id = "com.android.calculator:id/eq")
    MobileElement btnSamaDengan;
    @AndroidFindBy(id = "com.android.calculator:id/op_add")
    MobileElement btnTambah;
    @AndroidFindBy(id = "com.android.calculator:id/op_mul")
    MobileElement btnPerkalian;
    @AndroidFindBy(id = "com.android.calculator:id/result_final")
    MobileElement hasil;


    public void penambahan() {
        btnSatu.click();
        System.out.println("Click button angka 1");
        btnTambah.click();
        System.out.println("Click button Tambah");
        btnDua.click();
        System.out.println("Click button angka 2");
        btnSamaDengan.click();
        System.out.println("Click button sama dengan");
    }

    public void perkalian() {
        btnTiga.click();
        System.out.println("Click button angka 3");
        btnPerkalian.click();
        System.out.println("Click button perkalian");
        btnEmpat.click();
        System.out.println("Click button angka 4");
        btnSamaDengan.click();
        System.out.println("Click button sama dengan");
    }

    public String getTxtResult() {
        return hasil.getText();
    }

}
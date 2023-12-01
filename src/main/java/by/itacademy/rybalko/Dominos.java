package by.itacademy.rybalko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dominos {
    private String clickReclamation = "/html/body/div[3]/div[2]/button";
    private String clickPizza = "/html/body/div[2]/div/div[1]/div[2]/div[2]/div/div/div/div/div/div[1]/div/ul/li[1]/a";
    private String clickMyChoise = "//*[@id=\"app-root\"]/div/div[1]/div[2]/div[6]/div/div/div[1]/div/div[6]/div[2]/button/span/span[2]";
    private String clickBusket = "//*[@id=\"app-root\"]/div/div[1]/div[2]/div[2]/div/div/div/div/div/div[3]/div/button/span/span[2]/div";
    private String  getTextProductName = "/html/body/div[2]/div/div[1]/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div[2]/div/div/div/div/div[1]";

   WebDriver driver;
    public Dominos(WebDriver driver) {
        this.driver = driver;
    }

    public void clickReclamation(){
        driver.findElement(By.xpath(clickReclamation)).click();
    }

    public void clickPizza(){
        driver.findElement(By.xpath(clickPizza)).click();
    }

    public void clickMyChoise(){
        driver.findElement(By.xpath(clickMyChoise)).click();
    }

    public void clickBusket(){
        driver.findElement(By.xpath(clickBusket)).click();
    }

    public String getTextProductName() {
        return driver.findElement(By.xpath(getTextProductName)).getText();
    }

}





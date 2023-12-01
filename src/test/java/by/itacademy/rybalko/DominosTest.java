package by.itacademy.rybalko;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class DominosTest extends BaseTest {

    @Test
    public void dominoPizza() throws InterruptedException {
        Dominos dominos = new Dominos(driver);
        Thread.sleep(4000);
        dominos.clickReclamation();
        dominos.clickPizza();
        dominos.clickMyChoise();
        dominos.clickBusket();
        Thread.sleep(4000);
        String actual = dominos.getTextProductName();
        String expected = "Диабло Карри";
        Assertions.assertEquals(expected, actual);
    }

}

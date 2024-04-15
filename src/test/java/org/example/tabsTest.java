package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabsTest {
    public static void main(String[] args)throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qatabs.ccbp.tech/");
        WebElement about = driver.findElement(By.xpath("//button[starts-with(@id ,'about')]"));
        about.click();
        WebElement paragraphAbout = driver.findElement(By.xpath("//p[starts-with(@id ,'about')]"));
        String currentpara = paragraphAbout.getText();
        String expectedpara = "Varanasi is one of the oldest living cities in the world. Its Prominence in Hindu mythology is virtually unrevealed. Mark Twain, the English author and literature, who was enthralled by the legend and sanctity of Benaras, once wrote, \"Benaras is older than history, older than tradition, older even than legend and looks twice as old as all of them put together\".";
        if (currentpara.equals(expectedpara)){
            System.out.println("About content matched");
        }else {
            System.out.println("Mismatch in the \'about\' content");
        }
        Thread.sleep(3000);
        WebElement time = driver.findElement(By.xpath("//button[starts-with(@id ,'timeToVisit')]"));
        time.click();
        WebElement paragraphTime = driver.findElement(By.xpath("//p[starts-with(@id ,'timeToVisit')]"));
        String currentTextOfTime = paragraphTime.getText();
        String expectedTextOfTime = "October to March is the best time to visit Varanasi because most of the fairs here are held during this time of the year. Festivities begin with Diwali and continue to Dev Diwali celebrated on the 15th day from Diwali. In between, there is also Annakut. During this time, the ghats are lit with lights and diyas. Earthen lamps adorn the staircase of the ghats and are also afloat in the river. Firecrackers burn through the night, and it's a sight no one should miss.";
        if (currentTextOfTime.equals(expectedTextOfTime)){
            System.out.println("Time content matched");
        }else {
            System.out.println("Mismatch in the \'time\' content");
        }
        Thread.sleep(3000);
        WebElement attraction = driver.findElement(By.xpath("//button[starts-with(@id ,'attractions')]"));
        attraction.click();
        WebElement paragraphAttraction = driver.findElement(By.xpath("//p[starts-with(@id ,'attractions')]"));
        String currentTextOfAttraction = paragraphAttraction.getText();
        String expectedTextOfAttraction = "When visiting Varanasi, one comes across plenty of ghats, but among them, Dashashwamedh Ghat is said to be one of the oldest and most important. This ghat, leading to the Ganges, is located close to the famous old Vishwanath temple in Kashi (today’s Banaras). Another famous attraction is River Ganges which is the holiest river by the Hindus and many more.";


        if (currentTextOfAttraction.equals(expectedTextOfAttraction)){
            System.out.println("Attraction content matched");
        }else {
            System.out.println("Mismatch in the \'attraction\' content");
        }
        Thread.sleep(3000);
        driver.quit();
    }
}

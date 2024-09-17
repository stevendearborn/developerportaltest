/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeveloperPortalTest;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author stevendearborn
 */
public class APICatalogPage {
    protected WebDriver driver;
    protected WebElement pageTitle;
    
    public APICatalogPage(WebDriver driver){
        this.driver = driver;
               // findBy class is "title-bar__tiele pr-4" is "APIs"
        //pageTitle = driver.findElement(By.className("title-bar__title pr-4"));
        //pageTitle = driver.findElement(By.cssSelector(".title-bar__title"));
        
        // pageTitle = driver.findElement(By.name("APIs"));
        pageTitle = driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/h1"));
        
        if (!"APIs".equals(pageTitle.getText())) {
        throw new IllegalStateException("This is not API Catalog page," + " current page is: " + driver.getCurrentUrl());
        } else {
                    List<WebElement> publishedAPIs = driver.findElements(By.className("card-title"));
                    
                    for (WebElement API : publishedAPIs) {
                        System.out.println("API:" + API.getText());
                    }
            
            // There may be a next button so we need to page through them.
    }
  }
}

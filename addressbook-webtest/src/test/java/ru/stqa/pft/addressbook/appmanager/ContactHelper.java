package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void submitContactCreation() {

    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void submitContactDeletion() {

    click(By.xpath("//input[@value='Delete']"));
  }

  public void pencilClick() {

    click(By.xpath("//img[@alt='Edit']"));
  }

  public void submitDeletionInEditForm() {
    click(By.xpath("//div[@id='content']/form[2]/input[2]"));
  }

  public void submitUpdateContact() {
    click(By.name("update"));
  }

  public void submitModifiedContact() {
    click(By.name("modifiy"));
  }

  public void clickContactInformation() {
    click(By.xpath("//img[@alt='Details']"));
  }


  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"), ContactData.getFirstname());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("address"), contactData.getAddress());
    type(By.name("home"), contactData.getHomeNumber());
    type(By.name("mobile"), contactData.getMobileNumber());
    type(By.name("email"), contactData.getEmail());

    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void closeAlertPopup() {
    wd.switchTo().alert().accept();
  }
}

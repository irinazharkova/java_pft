package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(FirefoxDriver wd) {
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


  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.firstname());
    type(By.name("middlename"), contactData.middlename());
    type(By.name("lastname"), contactData.lastname());
    type(By.name("nickname"), contactData.nickname());
    type(By.name("title"), contactData.title());
    type(By.name("address"), contactData.address());
    type(By.name("home"), contactData.home_number());
    type(By.name("mobile"), contactData.mobile_number());
    type(By.name("email"), contactData.email());
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void closeAlertPopup() {
    wd.switchTo().alert().accept();
  }
}

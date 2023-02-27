package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactCreationTest extends TestBase {
  @Test
  public void testContactCreation() {
    app.getNavigationHelper().goToContactCreationPage();
    app.getContactHelper().fillContactForm(new ContactData("test", "middle", "last", "nick", "title", "address", "9999999", "99999", "test@test.ru"));
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().goToHomePage();
  }
}

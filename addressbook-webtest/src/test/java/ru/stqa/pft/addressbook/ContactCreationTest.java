package ru.stqa.pft.addressbook;

import org.testng.annotations.*;


public class ContactCreationTest extends TestBase {
  @Test
  public void testContactCreation() {
    app.gotoContactCreationPage();
    app.fillContactForm(new ContactData("first", "middle", "last", "nick", "title", "address", "9999999", "99999", "test@test.ru"));
    app.submitContactCreation();
  }
}

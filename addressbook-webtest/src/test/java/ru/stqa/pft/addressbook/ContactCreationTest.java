package ru.stqa.pft.addressbook;

import org.testng.annotations.*;


public class ContactCreationTest extends TestBase {
  @Test
  public void testContactCreation() throws Exception {
    gotoContactCreationPage();
    fillContactForm(new ContactData("first", "midle", "last", "nick", "title", "address", "9999999", "99999", "test@test.ru"));
    submitContactCreation();
  }
}

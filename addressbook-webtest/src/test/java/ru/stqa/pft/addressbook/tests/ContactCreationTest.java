package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;


public class ContactCreationTest extends TestBase {
  @Test
  public void testContactCreation() {
    app.getNavigationHelper().goToGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup((new GroupData("test_name", "test_header", "test_footer")));
    }
    app.getContactHelper().goToContactCreationPage();
    app.getContactHelper().fillContactForm(new ContactData("test", "last", "address", "9999999", "99999", "test@test.ru", "test_name"), true);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().goToHomePage();
  }
}

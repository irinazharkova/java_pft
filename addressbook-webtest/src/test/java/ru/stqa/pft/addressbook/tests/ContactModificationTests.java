package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModificationByPencil() {
    app.getNavigationHelper().goToGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup((new GroupData("test_name", "test_header", "test_footer")));
    }
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("name", "lastname", "address", "0987", "12345", "test@test.ru", "test_name"));
    }
    app.getNavigationHelper().goHomeByLogo();
    app.getContactHelper().pencilClick();
    app.getContactHelper().fillContactForm((new ContactData(null, null, null, "9999999", "11111", "test1@test.ru", null)), false);
  }

  @Test
  public void testContactModificationByIcon() {
    app.getNavigationHelper().goToGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup((new GroupData("test_name", "test_header", "test_footer")));
    }
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("name", "lastname", "address", "0987", "12345", "test@test.ru", "test_name"));
    }
    app.getNavigationHelper().goHomeByLogo();
    app.getContactHelper().clickContactInformation();
    app.getContactHelper().submitModifiedContact();
    app.getContactHelper().fillContactForm((new ContactData(null, null, null, null, "00000", "test@test.ru", null)), false);
  }
}

package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {
  public void fillEditForm(ContactData contactData) {
    app.getContactHelper().fillContactForm(contactData);
    app.getContactHelper().submitUpdateContact();
    app.getNavigationHelper().goToHomePage();
  }

  @Test
  public void testContactModificationByPencil() {
    app.getContactHelper().pencilClick();
    fillEditForm((new ContactData("Update", "middle", " By Pencil", "nick", "null", "address", "9999999", "99999", "test@test.ru")));
  }

  @Test
  public void testContactModificationByIcon() {
    app.getContactHelper().clickContactInformation();
    app.getContactHelper().submitModifiedContact();
    fillEditForm((new ContactData("Update", "By", "Modification", "Icon", "title", "address", "9999999", "99999", "test@test.ru")));
  }
}

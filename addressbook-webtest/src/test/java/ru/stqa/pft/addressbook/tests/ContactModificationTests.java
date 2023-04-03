package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModificationByPencil() {
    app.getContactHelper().pencilClick();
    app.getContactHelper().fillContactForm((new ContactData(null, null, null, "9999999", "11111", "test1@test.ru", null)), false);
  }

  @Test
  public void testContactModificationByIcon() {
    app.getContactHelper().clickContactInformation();
    app.getContactHelper().submitModifiedContact();
    app.getContactHelper().fillContactForm((new ContactData(null, null, null, null, "00000", "test@test.ru", null)), false);
  }
}

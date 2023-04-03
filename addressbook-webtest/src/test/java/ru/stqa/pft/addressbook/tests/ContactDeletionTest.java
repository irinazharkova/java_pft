package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactDeletionTest extends TestBase {
  @Test
  public void testContactDeletionByButton() {
    app.getNavigationHelper().goToGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test_name", "test_header", "test_footer"));
    }
    app.getNavigationHelper().goHomeByLogo();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("name", "lastname", "address", "0987", "12345", "test@test.ru", "test_name"));
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().submitContactDeletion();
    app.getContactHelper().closeAlertPopup();
  }

  @Test
  public void testContactDeletionByPencil() {
    app.getNavigationHelper().goToGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup((new GroupData("test_name", "test_header", "test_footer")));
    }
    app.getNavigationHelper().goHomeByLogo();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("name", "lastname", "address", "0987", "12345", "test@test.ru", "test_name"));
    }
    app.getContactHelper().pencilClick();
    app.getContactHelper().submitDeletionInEditForm();
  }
}

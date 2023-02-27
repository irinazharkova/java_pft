package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {
  @Test
  public void testContactDeletionByButton() {
    app.getContactHelper().selectContact();
    app.getContactHelper().submitContactDeletion();
    app.getContactHelper().closeAlertPopup();
  }

  @Test
  public void testContactDeletionByPencil() {
    app.getContactHelper().pencilClick();
    app.getContactHelper().submitDeletionInEditForm();
  }
}

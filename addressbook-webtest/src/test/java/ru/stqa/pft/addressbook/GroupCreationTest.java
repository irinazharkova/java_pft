package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    goToGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test_name", "test_header", "test_footer"));
    submitGroupCreation();
    returnGroupPage();
  }
}
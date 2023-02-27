package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation(){
    app.goToGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("test_name", "test_header", "test_footer"));
    app.submitGroupCreation();
    app.returnGroupPage();
  }
}
package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

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
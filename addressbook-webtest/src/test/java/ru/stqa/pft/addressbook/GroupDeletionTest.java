package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class GroupDeletionTest extends TestBase {

  @Test
  public void testGroupDeletion(){
    app.goToGroupPage();
    app.selectGroup();
    app.deleteSelectedGroup();
    app.returnGroupPage();
  }
}


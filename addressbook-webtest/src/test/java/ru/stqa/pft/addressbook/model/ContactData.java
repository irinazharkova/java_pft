package ru.stqa.pft.addressbook.model;


public class ContactData {
  private static String firstname;
  private String lastname;
  private String address;
  private String home_number;
  private String mobile_number;
  private String email;
  private String group;




  public ContactData(String firstname, String lastname, String address, String home_number, String mobile_number, String email, String group) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.home_number = home_number;
    this.mobile_number = mobile_number;
    this.address = address;
    this.email = email;
    this.group = group;
  }

  public static String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getHomeNumber() {
    return home_number;
  }

  public String getMobileNumber() {
    return mobile_number;
  }

  public String getAddress() {
    return address;
  }

  public String getEmail() {
    return email;
  }
  public String getGroup() {
    return group;
  }
}

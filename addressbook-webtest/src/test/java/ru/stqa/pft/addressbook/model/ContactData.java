package ru.stqa.pft.addressbook.model;

public record ContactData(String firstname, String middlename, String lastname, String nickname, String title,
                          String address, String home_number, String mobile_nubmer, String email) {
}
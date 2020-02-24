package com.leal.jean.patterns.creational.builder;

public interface UserDTOBuilder {
    UserDTOBuilder withFirstName(String firstName);
    UserDTOBuilder withLastName(String lastName);
    UserDTOBuilder withBirthday(String birthday);
    UserDTOBuilder withAddress(String address);
    UserDTO build();
    UserDTO getUserDTO();
}

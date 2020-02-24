package com.leal.jean.patterns.creational.builder;

public class UserDTO implements UserDTOBuilder {
    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        return null;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        return null;
    }

    @Override
    public UserDTOBuilder withBirthday(String birthday) {
        return null;
    }

    @Override
    public UserDTOBuilder withAddress(String address) {
        return null;
    }

    @Override
    public UserDTO build() {
        return null;
    }

    @Override
    public UserDTO getUserDTO() {
        return null;
    }
}

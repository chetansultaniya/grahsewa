package com.grahsewa.model;

public class Euser extends User {

    public Euser() {

    }

    public Euser(String address, String city, String country, String created_by,
                 String created_on, String dob, String email, String gender,
                 boolean is_visible, String modified_by, String modified_on,
                 String name, String password, String photo, String pincode, String state) {

        super(address,city,country,created_by,
                created_on,dob,email,gender,is_visible,modified_by,modified_on,
                name,password,photo,pincode,state);

    }
}

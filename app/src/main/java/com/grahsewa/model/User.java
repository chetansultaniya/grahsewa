package com.grahsewa.model;

public class User {
    private String address;
    private String city;
    private String country;
    private String created_by;
    private String created_on;
    private String dob;
    private String email;
    private String gender;
    private boolean is_visible;
    private String modified_by;
    private String modified_on;
    private String name;
    private String password;
    private String photo;
    private String pincode;
    private String state;

    public User(){

    }

    public User(String address, String city, String country, String created_by, String created_on, String dob, String email, String gender, boolean is_visible, String modified_by, String modified_on, String name, String password, String photo, String pincode, String state) {
        this.address = address;
        this.city = city;
        this.country = country;
        this.created_by = created_by;
        this.created_on = created_on;
        this.dob = dob;
        this.email = email;
        this.gender = gender;
        this.is_visible = is_visible;
        this.modified_by = modified_by;
        this.modified_on = modified_on;
        this.name = name;
        this.password = password;
        this.photo = photo;
        this.pincode = pincode;
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getCreated_on() {
        return created_on;
    }

    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isIs_visible() {
        return is_visible;
    }

    public void setIs_visible(boolean is_visible) {
        this.is_visible = is_visible;
    }

    public String getModified_by() {
        return modified_by;
    }

    public void setModified_by(String modified_by) {
        this.modified_by = modified_by;
    }

    public String getModified_on() {
        return modified_on;
    }

    public void setModified_on(String modified_on) {
        this.modified_on = modified_on;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}

package com.example.addressapp.models;

import android.text.TextUtils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Address implements Serializable {

    @SerializedName("token")
    @Expose
    public static final String token = "52e04d83e87e509f07982e6ac851e2d2c67d1d0eabc4fe78";

    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("firstname")
    @Expose
    private String name;

    @SerializedName("address1")
    @Expose
    private String add1;

    @SerializedName("address2")
    @Expose
    private String add2;

    @SerializedName("city")
    @Expose
    private String city;

    @SerializedName("country_id")
    @Expose
    private int country;

    @SerializedName("state_id")
    @Expose
    private int state;

    @SerializedName("zipcode")
    @Expose
    private int zip;

    @SerializedName("phone")
    @Expose
    private long phone;

    public Address() {
        this.id = null;
        this.state = 1400;
        this.country = 105;
        this.zip = 111111;
        this.phone = 1111111111;
    }

    public String getAdd2() {
        return add2;
    }

    public void setAdd2(String add2) {
        this.add2 = add2;
    }

    public String getAdd1() {
        return add1;
    }

    public void setAdd1(String add1) {
        this.add1 = add1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder address = new StringBuilder();
        address.append(getAdd1());
        if (!TextUtils.isEmpty(getAdd2())) {
            address.append(", " + getAdd2());
        }
        address.append(",\n" + getCity());
        address.append(", " + getState());
        address.append(",\n" + getZip());
        return (address.toString());
    }

    @Override
    public boolean equals(Object obj) {
        Address address = (Address)obj;
        if(this.id.equals(address.getId()))
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}
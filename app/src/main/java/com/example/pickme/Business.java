package com.example.pickme;

public class Business {
    public String businessName;
    public String location;
    public String industry;
    public int employeeCount;
    public int image;

    public Business() {
    }

    public Business(String businessName, String location, String industry, int employeeCount, int image) {
        this.businessName = businessName;
        this.location = location;
        this.industry = industry;
        this.employeeCount = employeeCount;
        this.image = image;
    }

    public String getUnivName() {
        return businessName;
    }

    public String getGpaReq() {
        return location;
    }

    public String getSatReq() {
        return industry;
    }

    public int getActReq() {
        return employeeCount;
    }

    public int getImage() {
        return image;
    }
}

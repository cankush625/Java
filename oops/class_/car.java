package com.oops.class_;

//by using normal method
public class car {
    public String model;
    public String engine;
    public String year;
    public String color;
}

//by using set method

class car_ {
    private String model;
    private String year;

    public void setModel(String model) {
        //testing
        String validModel = model.toLowerCase();
        if(validModel.equals("continental_gt")){
            this.model = model;
        }else{
            this.model = "unknown";
        }
    }

    public void setYear(String year){
        this.year = year;
    }

    public String getModel() {
        return this.model;
    }

    public String getYear(){
        return this.year;
    }
}
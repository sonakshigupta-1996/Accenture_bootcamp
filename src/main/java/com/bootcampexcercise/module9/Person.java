package com.bootcampexcercise.module9;

public class Person {

    private int weight;   // in kg
    private float height; // in meters

    // Getters and Setters
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // BMI Method
    public String getBodyMassIndex(float height, int weight) {

        // Invalid values i.e 0 or negative
        if (height <= 0 || weight <= 0) {
            return "Invalid input";
        }

        //  Max limits (reasonable limits)
        if (height > 3 || weight > 300) {
            return "Invalid range";
        }

        // BMI calculation
        float bmi = weight / (height * height);

        //  Return category
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

}

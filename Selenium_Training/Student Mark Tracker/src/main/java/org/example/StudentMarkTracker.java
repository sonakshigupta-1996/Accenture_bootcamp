package org.example;

public class StudentMarkTracker
{
    public static void main(String[] args) {

        //Initialize 2D array
        int[][] marks = {
                {80, 75, 77},// student 1
                {79, 54, 90},// student 2
                {69, 79,92} // student 3
        };

        //Using for loop
        for(int i=0; i< marks.length;i++){
            double average = calculateAverage(marks[i]);
            String result= classifyResult(average);

            System.out.println("Student "+ (i+1));
            System.out.println("Average= "+ average);
            System.out.println("Result= "+ result);
        }

    }

    // Method to calculate average marks
    public static double calculateAverage(int[] studentMarks) {
        int sum= 0;
        for(int i =0; i<studentMarks.length; i++){
            sum= sum+studentMarks[i];
        }
        return (double) sum/studentMarks.length;
    }

    //Method to classify result using if expression

    public static String classifyResult(double average) {
        if (average >= 90) {
            return "Excellent";
        } else if (average >= 75) {
            return "Good";
        } else if (average >= 60) {
            return "Pass";
        }
        else {
            return "Fail";
        }
    }
}

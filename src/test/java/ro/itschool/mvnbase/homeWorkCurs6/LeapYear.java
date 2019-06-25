package ro.itschool.mvnbase.homeWorkCurs6;

public class LeapYear {

    public  String leapYear(int year){

        if (year<0) {
            return  "Opps! Please insert a positive number!";

        } else if (year%4==0 || year%400==0 && year%100!=0 ) {
            return  "Is a leap year";
        }
        else {
            return "Is not a leap year";
        }
    }

}

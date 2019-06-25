package ro.itschool.mvnbase.homeWorkCurs6;

public class Palindrom {

    public boolean intPalindrom(int number){
        int length = (int) (Math.log10(number) + 1);
        int copyNumber=number;

        int[]array=new int[length];
        for (int i=length-1;i>=0 ;i-- ) {
            array[i]=copyNumber%10;
            copyNumber/=10;
        }


        int[] palindromArray=new int[length];

        for (int i=0;i<length ;i++ ) {
            palindromArray[i]=number%10;
            number/=10;
        }



        return palindromVerification(array,palindromArray);

    }

    public  boolean palindromVerification(int[]array1,int[]array2){


        boolean verification=false;

        for (int i=0;i<array2.length ;i++ ) {
            if (array1[i]==array2[i]) {
                verification=true;
            }
            else{
                return verification=false;
            }
        }

        return verification;
    }

    public  boolean stringPalindrom(String text){
        String replaceText=text.replaceAll("\\s","");
        int length=replaceText.length();

        int start=0;
        int end=length-1;

        while(end>start){
            char startChar=replaceText.charAt(start++);
            char endChar=replaceText.charAt(end--);
            if (startChar!=endChar) {
                return false;
            }
        }

        return true;
    }

}

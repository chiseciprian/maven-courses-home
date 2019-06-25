package ro.itschool.mvnbase.homeWorkCurs6;

public class Bills {

    public static int[] allBill={500,200,100,50,10,5,1};

    public int arrayDimension(int sum){

        int contor=0;
        int index=0;
        int sum2=sum;

        if(sum==0){
            return contor=1;
        }

        while(sum2>0){
            if (sum2>=allBill[index]) {
                sum2-=allBill[index];
                contor++;
            }
            else{
                index++;
            }
        }

      return contor;
    }

    public int[] distinctNumber(int number){
        int dimension=arrayDimension(number);
        int[]bill=new int[dimension];
        int allBillIndex=0;
        int billIndex=0;

        while (number>0){
            if(number>=allBill[allBillIndex]){
                bill[billIndex]=allBill[allBillIndex];
                billIndex++;
                number-=allBill[allBillIndex];
            }
            else if(number==0){
                bill[billIndex]=0;

            }
            else {
                allBillIndex++;
            }
        }

        return bill;
    }

}

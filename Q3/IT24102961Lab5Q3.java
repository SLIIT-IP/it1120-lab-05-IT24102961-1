import java.util.Scanner;

public class IT24102961Lab5Q3{
    static final double ROOM_CHARGE_PER_DAY=48000.00;
    static final int DISCOUNT_RATE_3_TO_4_DAYS=10;
    static final int DISCOUNT_RATE_5_OR_MORE_DAYS=20;

    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Start Date (1-31): ");
        int startDate=scanner.nextInt();
        System.out.print("Enter End Date (1-31): ");
        int endDate=scanner.nextInt();

        if(startDate<1||startDate>31||endDate<1||endDate>31){
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if(startDate>=endDate){
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int numberOfDaysReserved=endDate-startDate;
        int discountRate=0;
        if(numberOfDaysReserved>=3 && numberOfDaysReserved<= 4){
            discountRate=DISCOUNT_RATE_3_TO_4_DAYS;
        }else if(numberOfDaysReserved>=5){
            discountRate=DISCOUNT_RATE_5_OR_MORE_DAYS;
        }

        double totalAmount=numberOfDaysReserved*ROOM_CHARGE_PER_DAY;
        totalAmount=totalAmount*discountRate/100;

        System.out.println("\nRoom Charge Per Day: Rs. "+ROOM_CHARGE_PER_DAY+"/=");
        System.out.println("Number of Days Reserved: "+numberOfDaysReserved);
        System.out.println("Total Amount to be Paid: "+totalAmount);
    }
}

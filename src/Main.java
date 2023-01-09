import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private  static final DecimalFormat DF= new DecimalFormat("0.00");//讓BMI只顯示到小數點後兩位即可
    public static void main(String[] args) {
        //BMI = (kg/m^2)
        Scanner scanner = new Scanner(System.in); //創建一個掃描器

        System.out.print("請輸入您的體重（公斤）："); //print跟println的差異在於前者不會換行，後者會換行
        double weight = scanner.nextDouble();//用scanner去掃出一個double數值，並存進weight中

        System.out.print("請輸入身高（公分）：");
        double height = scanner.nextDouble() / 100; //cm轉換成m

        double bmi = Double.parseDouble(DF.format(weight/(height*height)));
        System.out.println("您的BMI為：" + bmi);

        if(bmi < 18.5){
            System.out.println("您屬於過輕級別");
        } else if (bmi < 24) {
            System.out.println("您屬於正常級別");
        } else if (bmi < 30) {
            System.out.println("您屬於微胖級別");
        }else {
            System.out.println("您屬於過重級別");
        }
    }
}
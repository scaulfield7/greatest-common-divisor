package projects.learning;

public class Main{
    public static void main(String[] args){
        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
        System.out.println(greatestCommonDivisor.getGreatestCommonDivisor(3, 15));
        System.out.println(greatestCommonDivisor.getGreatestCommonDivisor(15, 75));
        System.out.println(greatestCommonDivisor.getGreatestCommonDivisor(32, 73));
        System.out.println(greatestCommonDivisor.getGreatestCommonDivisor(30, 210));
        System.out.println(greatestCommonDivisor.getGreatestCommonDivisor(44, 10));
        System.out.println(greatestCommonDivisor.getGreatestCommonDivisor(99, 12));
        System.out.println(greatestCommonDivisor.getGreatestCommonDivisor(128, 80));
    }
}

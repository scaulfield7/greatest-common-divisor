package projects.learning;

public class GreatestCommonDivisor{
    public static int getGreatestCommonDivisor(int first, int second){
        int smallerNumber = first;
        int biggerNumber = second;
        int greatestCommonDivisor = -1;
        if(first < 10 || second < 10){
            return greatestCommonDivisor;
        }else{
            if(first == second){
                return first;
            }else if(first > second){
                smallerNumber = second;
                biggerNumber = first;
            }
            greatestCommonDivisor = smallerNumber;
            while(greatestCommonDivisor != 0){
                if(biggerNumber % greatestCommonDivisor == 0 && smallerNumber % greatestCommonDivisor == 0){
                    return greatestCommonDivisor;
                }else{
                    greatestCommonDivisor--;
                }
            }
        }
        return -1;
    }
}

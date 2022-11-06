import java.util.Scanner;

public class Solution {

    public static class RomanToInt {
        int value(char r)
        {
            return switch (r) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };
        }
        int RomanToDecimal(String str)
        {
            int sum = 0;

            for (int i = 0; i < str.length(); i++){
                int s1 = value(str.charAt(i));

                if (i + 1 < str.length()){
                    int s2 = value(str.charAt(i+1));

                    if (s1 >= s2){
                        sum += s1;
                    }
                    else {
                        sum += s2 -s1;
                        i++;
                    }
                }
                else {
                    sum += s1;
                }
            }
            return Math.abs(sum);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RomanToInt ob = new RomanToInt();
        String str = sc.next();
        System.out.println(ob.RomanToDecimal(str));
    }
}

//not perfect thoo 

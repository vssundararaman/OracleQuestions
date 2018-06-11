package easy;

public class CheckTheNumberIsPalindrome {

    public static void main(String[] args) {

        //int number = 12321;
        int number = 123212;

        if(isPalindrome(number))
        {
            System.out.println("This is Palindrome Number");
        }else{
            System.out.println("This is not Palindrome Number");
        }
    }

    static boolean isPalindrome(int number){


        int reverseNumber=0, i = number;

        while(i !=0){
            reverseNumber = reverseNumber *10;
            reverseNumber = reverseNumber + i %10;
            i = i/10;
        }


        if(number == reverseNumber){
            return true;
        }

        return false;
    }
}

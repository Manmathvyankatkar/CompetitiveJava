class Logic
{
    void checkPalindrome(int iNo)
    {
        int iDigit = 0, iRev = 0, iTemp = 0;

        iTemp = iNo;

        while(iNo != 0){
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;
            iNo = iNo / 10;
        }

        if(iRev == iTemp){
            System.out.println("It is Palindrome.");
        }else{
            System.out.println("It is NotPalindrome.");
        }

        
    }
    
}

class ques2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.checkPalindrome(121);
    }
}
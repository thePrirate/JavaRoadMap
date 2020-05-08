package Switches;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int switchVal = 3;
        switch (switchVal){
            case 1:
                System.out.println("the value is 1");
                break;
            case 2:
                System.out.println("the value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("the val is 3, or 4 or 5");
                System.out.println("The actual val is "+switchVal);
//                without the break the code will continue to run though it has already hit the correct val
                break;
            default:
                System.out.println("the val is not 1 or 2");
                break;
        }


        char charVal = 'F';
        switch(charVal){
            case 'A':
                System.out.println("the value is A");
                break;
            case 'B':
                System.out.println("the value is B");
                break;
            case 'C': case 'D': case'E':
                System.out.println("the value is either C, D or E");
                System.out.println("the actual value is "+charVal);
                break;
            default:
                System.out.println("value not found");
        }
    }
}

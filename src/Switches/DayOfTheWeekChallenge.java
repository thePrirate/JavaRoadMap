package Switches;

public class DayOfTheWeekChallenge {
    public static void main(String[] args) {
//        Testing
    DayOfTheWeek(0);
    DayOfTheWeek(1);
    DayOfTheWeek(2);
    DayOfTheWeek(3);
    DayOfTheWeek(4);
    DayOfTheWeek(5);
    DayOfTheWeek(6);
//    Invalid value out of range from 0 to 6
        DayOfTheWeek(-1);
        usingIfElse(0);
        usingIfElse(1);
    }

    private static void DayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("today is Sunday");
                break;
                case 1:
                System.out.println("today is Monday");
                break;
                case 2:
                System.out.println("today is Tuesday");
                break;
                case 3:
                System.out.println("today is Wednesday");
                break;
                case 4:
                System.out.println("today is Thursday");
                break;
                case 5:
                System.out.println("today is Friday");
                break;
                case 6:
                System.out.println("today is Saturday");
                break;
            default:
                System.out.println("invalid day");
        }
    }
//    Using if and else instead of Switch

    private static void usingIfElse(int number){
        if(number==0){
            System.out.println("Sunday");
        } else if(number==1){
            System.out.println("Monday");
        } else if(number==2){
            System.out.println("Tuesday");
        } else if(number ==3){
            System.out.println("Wednesday");
        } else if(number==4){
            System.out.println("Thursday");
        } else if(number==5){
            System.out.println("Friday");
        } else if(number==6){
            System.out.println("Saturday");
        } else {
            System.out.println("invalid day");
        }
    }

}

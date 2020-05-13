package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre vincom = new Theatre("vincom",7,10);
        List<Theatre.Seat> seatCopy = new ArrayList<>(vincom.seats);
        printSeat(seatCopy);

        seatCopy.get(1).reserved();
        if (vincom.reservedSeat("A02")){
            System.out.println("please pay for A02");
        }else {
            System.out.println("Seat is already reserved");
        }

        Collections.shuffle(seatCopy);
        System.out.println("Printing Seat Copy");
        printSeat(seatCopy);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);

        System.out.println("min seat "+minSeat.getSeatNumber());
        System.out.println("max seat "+maxSeat.getSeatNumber());
    }
    public static void printSeat(List<Theatre.Seat> seatList){
        for (Theatre.Seat seat: seatList){
            System.out.println(" "+seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=========================================");
    }
}

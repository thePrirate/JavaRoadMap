package Collection;

import java.util.ArrayList;
import java.util.*;

public class Theatre {
    private final String theatreName;
    public List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRow, int seatPerRow) {
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRow-1);
        for (char row = 'A'; row<=lastRow; row++){
            for (int seatNum = 1; seatNum<= seatPerRow;seatNum++){
                Seat seat = new Seat(row + String.format("%02d",seatNum));
                seats.add(seat);
            }
        }
    }
    public boolean reservedSeat(String seatNumber){
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat,null);
        if (foundSeat>=0){
            return seats.get(foundSeat).reserved();
        }else {
            System.out.println("there is no seat "+seatNumber);
            return false;
        }

//        for (Seat seat: seats){
//            if (seat.getSeatNumber().equals(seatNumber)){
//                requestedSeat = seat;
//                break;
//            }
//        }
//        if (requestedSeat==null){
//            System.out.println("Invalid seat number "+ seatNumber);
//            return false;
//        }
//        return requestedSeat.reserved();
    }
    public void getSeat(){
        for (Seat seat: seats){
            System.out.println(seat.getSeatNumber());
        }
    }
// class Seat
    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserved(){
            if (!this.reserved){
                this.reserved = true;
                System.out.println("Seat "+seatNumber+" has been reserved");
                return true;
            }
            return false;
        }

    @Override
    public int compareTo(Seat seat) {
        return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());    }

    public boolean cancelled(){
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reserved Seat "+ seatNumber+" has been cancelled");
                return true;
            }
            return false;
        }

    public String getSeatNumber() {
        return seatNumber;
    }
}

}

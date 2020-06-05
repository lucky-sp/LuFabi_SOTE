package Exercise6;

import java.util.Iterator;

public class passengerList implements Iterable<Object>{
 
    private Passenger07_6 head;

    public void insert (Passenger07_6 passenger){
        if (head == null){
            head = passenger;
        }else{
            getLastPassenger().setNextPassenger(passenger);
        }
    }

    public Passenger07_6 getLastPassenger(){
        return getLastPassengerRecursive(head);
    }

    private Passenger07_6 getLastPassengerRecursive(Passenger07_6 passenger){
        Passenger07_6 nexPassenger = passenger.getNextPassenger();
        if (nexPassenger == null){
            return passenger;
        }
        return getLastPassengerRecursive(nexPassenger);
    }

    @Override
    public Iterator<Object> iterator() {
        return null;
    }
}
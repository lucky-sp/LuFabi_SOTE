package AirlineSolution2;

public class GetPassengerList implements UseCases {

    public String getActivity(String position) {
        if (position.equals("AirlineSolution1.Pilot") | position.equals("AirlineSolution1.Crew")) {
           return "Here is the passengers list ...";
        }
        else {
            return "You are not authorized to retrieve the passengers list";
        }
    }
    }


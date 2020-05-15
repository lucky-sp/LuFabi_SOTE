package AirlineSolution2;

public class CancelFlight implements UseCases {

    public String getActivity(String position) {
        if (position.equals("Pilot")) {
            return "Flight cancelled";
        }
        else {
            return "You are not authorized to cancel the flight";
        }
    }
}

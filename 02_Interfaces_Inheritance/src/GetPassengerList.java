public class GetPassengerList implements UseCases {

    public String getActivity(String position) {
        if (position.equals("Pilot") | position.equals("Crew")) {
           return "Here is the passengers list ...";
        }
        else {
            return "You are not authorized to retrieve the passengers list";
        }
    }
    }


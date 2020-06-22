package Exercise3;

import java.util.List;

/**
 * a passenger list is returned, which deepens the status of the requesting person
 * This class is for learning purpose only
 *
 * @author Lukas
 */

public class printList {

    /**
     * @param human      set the person how wants to checkout the flight list
     * @param flightList set the flight list which shall be checked out
     * @throws NotAuthorizedException is thrown if any other than a Pilot ot CrewMember is trying to print the flight list
     */
    public static void printPassengerList(Human human, List<Human> flightList) throws NotAuthorizedException {
        if (human instanceof Pilot) {
            for (Human person : flightList) {
                System.out.println(person.getName() + " : " + person.getAge());
            }
        } else if (human instanceof CrewMember) {
            for (Human person : flightList) {
                System.out.println(person.getName());
            }
        } else {
            throw new NotAuthorizedException("You don t have the permission to checkout the flight list");
        }
    }

}
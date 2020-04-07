package airport_project;

import airport_project.models.MilitaryType;
import airport_project.planes.MilitaryPlane;
import airport_project.planes.PassengerPlane;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Runner {

    private static final Logger log = Logger.getLogger(Runner.class.getName());

//    static List<PassengerPlane> passengerPlanes = Arrays.asList(
//            new PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
//            new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
//            new PassengerPlane("Boeing-747", 980, 16100, 70500, 242),
//            new PassengerPlane("Airbus A320", 930, 11800, 65500, 188),
//            new PassengerPlane("Airbus A330", 990, 14800, 80500, 222),
//            new PassengerPlane("Embraer 190", 870, 8100, 30800, 64),
//            new PassengerPlane("Sukhoi Superjet 100", 870, 11500, 50500, 140),
//            new PassengerPlane("Bombardier CS300", 920, 11000, 60700, 196)
//    );
//
//    static List<MilitaryPlane> militaryPlanes = Arrays.asList(
//            new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryType.BOMBER),
//            new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryType.BOMBER),
//            new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryType.BOMBER),
//            new MilitaryPlane("F-15", 1500, 12000, 10000, MilitaryType.FIGHTER),
//            new MilitaryPlane("F-22", 1550, 13000, 11000, MilitaryType.FIGHTER),
//            new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryType.TRANSPORT)
//    );

    public static void main(String[] args) {

//        MilitaryPlane militaryPlane = new MilitaryPlane(militaryPlanes);
//        PassengerPlane passengerPlane = new PassengerPlane(passengerPlanes);
//        Airport passengerAirport = new PassengerPlane(passengerPlanes);
//        Airport militaryAirport = new MilitaryPlane(militaryPlane.getMilitaryPlanes());
//        log.info("Military airport sorted by max distance: " + militaryAirport
//                .sortByMaxDistance()
//                .toString());
//        log.info("Passenger airport sorted by max speed: " + passengerAirport
//                .sortByMaxSpeed()
//                .toString());
//        log.info("Plane with max passenger capacity: " + passengerPlane.getPassengerPlaneWithMaxPassengersCapacity());
    }
}

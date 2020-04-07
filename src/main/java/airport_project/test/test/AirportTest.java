import airport_project.planes.ExperimentalPlane;
import airport_project.Airport;
import airport_project.models.ClassificationLevel;
import airport_project.models.MilitaryType;
import org.testng.Assert;
import org.testng.annotations.Test;
import airport_project.planes.MilitaryPlane;
import airport_project.planes.PassengerPlane;
import airport_project.planes.Plane;

import java.util.Arrays;
import java.util.List;

public class AirportTest {

    static List<Plane> planes = Arrays.asList(
            new PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
            new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
            new PassengerPlane("Boeing-747", 980, 16100, 70500, 242),
            new PassengerPlane("Airbus A320", 930, 11800, 65500, 188),
            new PassengerPlane("Airbus A330", 990, 14800, 80500, 222),
            new PassengerPlane("Embraer 190", 870, 8100, 30800, 64),
            new PassengerPlane("Sukhoi Superjet 100", 870, 11500, 50500, 140),
            new PassengerPlane("Bombardier CS300", 920, 11000, 60700, 196),
            new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryType.BOMBER),
            new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("F-15", 1500, 12000, 10000, MilitaryType.FIGHTER),
            new MilitaryPlane("F-22", 1550, 13000, 11000, MilitaryType.FIGHTER),
            new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryType.TRANSPORT)
    );

    private static PassengerPlane planeWithMaxPassengerCapacity = new PassengerPlane("Boeing-747", 980, 16100, 70500, 242);

    @Test
    public void testGetTransportMilitaryPlanes() {
        MilitaryPlane militaryPlane = (MilitaryPlane) new MilitaryPlane().getMilitaryPlanes(planes);
        List<MilitaryPlane> transportMilitaryPlanes = militaryPlane.getTransportMilitaryPlanes();
        Assert.assertTrue(militaryPlane.isMilitaryPlanesPresent(transportMilitaryPlanes));
    }

    @Test
    public void testGetPassengerPlaneWithMaxCapacity() {
        PassengerPlane passengerPlane = (PassengerPlane) new PassengerPlane().getPassengerPlanes(planes);
        PassengerPlane expectedPlaneWithMaxPassengersCapacity = passengerPlane.getPassengerPlaneWithMaxPassengersCapacity();
        Assert.assertEquals(expectedPlaneWithMaxPassengersCapacity, planeWithMaxPassengerCapacity);
    }

    @Test
    public void test3() {
        Airport airport = new Airport(planes);
        airport.sortByMaxLoadCapacity();
        List<Plane> planesSortedByMaxLoadCapacity = airport.getPlanes();

//        boolean nextPlaneMaxLoadCapacityIsHigherThanCurrent = true;
        boolean nextPlaneMaxLoadCapacityIsHigherThanCurrent = true;
        for (int i = 0; i < planesSortedByMaxLoadCapacity.size() - 1; i++) {
            Plane currentPlane = planesSortedByMaxLoadCapacity.get(i);
            Plane nextPlane = planesSortedByMaxLoadCapacity.get(i + 1);
            if (currentPlane.getMinLoadCapacity() > nextPlane.getMinLoadCapacity()) {
                nextPlaneMaxLoadCapacityIsHigherThanCurrent = false;
                break;
            }
        }
        Assert.assertTrue(nextPlaneMaxLoadCapacityIsHigherThanCurrent);
    }

    @Test
    public void testHasAtLeastOneBomberInMilitaryPlanes() {
        MilitaryPlane militaryPlane = (MilitaryPlane) new MilitaryPlane().getMilitaryPlanes(planes);
        Airport airport = new Airport(planes);
        List<MilitaryPlane> bomberMilitaryPlanes = militaryPlane.getBomberMilitaryPlanes();
        for (militaryPlane : bomberMilitaryPlanes) {
            if ((militaryPlane.getType() == MilitaryType.BOMBER)) {
            }
            else {
                Assert.fail("Test failed!");
            }
        }
    }

    @Test
    public void testExperimentalPlanesHasClassificationLevelHigherThanUnclassified(){
        Airport airport = new Airport(planes);
        List<ExperimentalPlane> experimentalPlanes = airport.getExperimentalPlanes();
        boolean hasUnclassifiedPlanes = false;
        for(ExperimentalPlane experimentalPlane : experimentalPlanes){
            if(experimentalPlane.getClassificationLevel() == ClassificationLevel.UNCLASSIFIED){
                hasUnclassifiedPlanes = true;
                break;
            }
        }
        Assert.assertFalse(hasUnclassifiedPlanes);
    }
}

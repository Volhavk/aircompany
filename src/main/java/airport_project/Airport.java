package airport_project;

import airport_project.planes.ExperimentalPlane;
import airport_project.planes.MilitaryPlane;
import airport_project.planes.PassengerPlane;
import airport_project.planes.Plane;

import java.util.*;

// version: 1.1
// made by Vitali Shulha
// 4-Jan-2019

public class Airport {

    private List<Plane> planes;

    public Airport() {

    }

    public Airport(List<Plane> planes){

    }

    public Airport sortByMaxDistance() {
        Collections.sort(planes, (o1, o2) -> o1.getMaxFlightDistance() - o2.getMaxFlightDistance());
        return this;
    }

    public Airport sortByMaxSpeed() {
        Collections.sort(planes, (o1, o2) -> o1.getMaxSpeed() - o2.getMaxSpeed());
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        Collections.sort(planes, (o1, o2) -> o1.getMinLoadCapacity() - o2.getMinLoadCapacity());
        return this;
    }

    @Override
    public String toString() {
        return "airport_project.Airport{" +
                "airport_project.Planes=" + planes.toString() +
                '}';
    }

    public List<Plane> getPlanes() {
        return planes;
    }

}

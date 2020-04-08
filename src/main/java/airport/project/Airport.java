package airport.project;

import airport.project.planes.Plane;

import java.util.Comparator;
import java.util.List;

// version: 1.1
// made by Vitali Shulha
// 4-Jan-2019

public class Airport {

    private List<Plane> planes;
    private Plane currentPlane;
    private Plane nextPlane;

    public Airport() {

    }

    public Airport(List<Plane> planes) {
    }

    public Airport sortByMaxDistance() {
        planes.sort(Comparator.comparingInt(Plane::getMaxFlightDistance));
        return this;
    }

    public Airport sortByMaxSpeed() {
        planes.sort(Comparator.comparingInt(Plane::getMaxSpeed));
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        planes.sort(Comparator.comparingInt(Plane::getMinLoadCapacity));
        return this;
    }

    @Override
    public String toString() {
        return "airport_project.Airport{" + "airport_project.Planes=" + planes.toString() + '}';
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public boolean isNextPlaneMaxLoadCapacityIsHigherThanCurrent() {
        List<Plane> planesSortedByMaxLoadCapacity = this.getPlanes();
        for (int i = 0; i < planesSortedByMaxLoadCapacity.size() - 1; i++) {
            currentPlane = planesSortedByMaxLoadCapacity.get(i);
            nextPlane = planesSortedByMaxLoadCapacity.get(i + 1);
        }
        return currentPlane.getMinLoadCapacity() > nextPlane.getMinLoadCapacity();
    }

}

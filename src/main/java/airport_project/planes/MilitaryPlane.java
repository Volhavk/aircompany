package airport_project.planes;

import airport_project.models.MilitaryType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MilitaryPlane extends Plane {

    private MilitaryType type;
    private List<Plane> planes;

    public MilitaryPlane (List<MilitaryPlane> planes) {
    }

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType type) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + type + '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MilitaryPlane)) return false;
        MilitaryPlane that = (MilitaryPlane) o;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    public MilitaryType getType() {
        return type;
    }


    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        planes.forEach(plane -> {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
        });
        return militaryPlanes;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
        List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (int i = 0; i < militaryPlanes.size(); i++) {
            MilitaryPlane plane = militaryPlanes.get(i);
            if (plane.getType() == MilitaryType.TRANSPORT) {
                transportMilitaryPlanes.add(plane);
            }
        }
        return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (int i = 0; i < militaryPlanes.size(); i++) {
            MilitaryPlane plane = militaryPlanes.get(i);
            if (plane.getType() == MilitaryType.BOMBER) {
                bomberMilitaryPlanes.add(plane);
            }
        }
        return bomberMilitaryPlanes;
    }
}

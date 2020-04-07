package airport_project.planes;

import airport_project.models.ClassificationLevel;
import airport_project.models.ExperimentalTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExperimentalPlane extends Plane {

    private ClassificationLevel classificationLevel;
    private List<Plane> planes;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes experimentalTypes, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.classificationLevel = classificationLevel;
    }

    @Override
    public String toString() {
        return "ExperimentalPlane{" +
                "classificationLevel=" + classificationLevel + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExperimentalPlane that = (ExperimentalPlane) o;
        return classificationLevel == that.classificationLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), classificationLevel);
    }

    public ClassificationLevel getClassificationLevel() {
        return classificationLevel;
    }


    public List<ExperimentalPlane> getExperimentalPlanes() {
        List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof ExperimentalPlane) {
                experimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return experimentalPlanes;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel) {
        this.classificationLevel = classificationLevel;
    }

}

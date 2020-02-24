package School;

import java.util.HashMap;

public class Location {
    private HashMap<School,Location> schoolLocationMap;

    public Location(HashMap<School, Location> schoolLocationMap) {
        this.schoolLocationMap = schoolLocationMap;
    }

    public HashMap<School, Location> getSchoolLocationMap() {
        return schoolLocationMap;
    }

    public void setSchoolLocationMap(HashMap<School, Location> schoolLocationMap) {
        this.schoolLocationMap = schoolLocationMap;
    }
}

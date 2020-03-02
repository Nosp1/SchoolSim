package School;

import java.util.HashMap;

public class SchoolsLocation {
    private HashMap<School, Location> schoolLocationMap;

    public SchoolsLocation() {
        this.schoolLocationMap = new HashMap<>();

    }
    public void addlocation(School school, Location location) {
        schoolLocationMap.put(school,location);
    }

    public void findLocation(School school){
        schoolLocationMap.get(school);
    }

    public HashMap<School, Location> getSchoolLocationMap() {
        return schoolLocationMap;
    }

    public void setSchoolLocationMap(HashMap<School, Location> schoolLocationMap) {
        this.schoolLocationMap = schoolLocationMap;
    }


}

package main.models;

import java.util.Arrays;
import java.util.Objects;

public class Team {

    private String house;
    private String keeper;
    private String seeker;
    private String[] chasers;

    private static final String POSITION_CHASER = "chaser";
    private static final String POSITION_SEEKER = "seeker";
    private static final String POSITION_KEEPER = "keeper";


    public Team(String house, String keeper, String seeker, String[] chasers) {

        if (house == null || keeper == null || seeker == null) {
            throw new IllegalArgumentException("field values cannot be null");
        }

        if (house.isBlank() || keeper.isBlank() || seeker.isBlank()) {
            throw new IllegalArgumentException("field values cannot be blank");
        }

        if (chasers.length != 3) {
            throw new IllegalArgumentException("there must be three chasers");
        }

        if (hasNull(chasers) || hasBlank(chasers)) {
            throw new IllegalArgumentException("array elements cannot be null/blank");
        }

        this.house = house;
        this.keeper = keeper;
        this.seeker = seeker;
        this.chasers = chasers;
    }

    public Team(Team source) {
        this.house = source.house;
        this.keeper = source.keeper;
        this.seeker = source.seeker;
        this.chasers = source.chasers;
    }

    public String getHouse() {
        return this.house;
    }

    public void setHouse(String house) {
        checkParam(house);
        this.house = house;
    }

    public String getKeeper() {
        return this.keeper;
    }

    public void setKeeper(String keeper) {
        checkParam(keeper);
        this.keeper = keeper;
    }

    public String getSeeker() {
        return this.seeker;
    }

    public void setSeeker(String seeker) {
        checkParam(seeker);
        this.seeker = seeker;
    }

    public String[] getChasers() {
        return this.chasers;
    }

    public void setChasers(String[] chasers) {
        this.chasers = chasers;
    }

    public static String getPositionChaser() {
        return POSITION_CHASER;
    }

    public static String getPositionSeeker() {
        return POSITION_SEEKER;
    }

    public static String getPositionKeeper() {
        return POSITION_KEEPER;
    }

    /**
     * Function name: hasNull
     * @param array
     * @return (boolean)
     * 
     * Inside the function:
     *    1. return false;
     */
    public static boolean hasNull(String[] array) {
        return Arrays.stream(array).anyMatch((element) -> element == null);
    }

    /**
     * Function name: hasBlank
     * @param array
     * @return (boolean)
     * 
     * Inside the function:
     *    1. return false;
     */
    public static boolean hasBlank(String[] array) {
        return Arrays.stream(array).anyMatch((element) -> element.isBlank());
    }

    public void checkParam(String param) {
        if (param == null || param.isBlank()) {
            throw new IllegalArgumentException(param + " cannot be null or blank");
        }
    }

    public String toString() {
        return "House: " + this.house + "\n" +
          "Keeper: " + this.keeper + "\n" +         
          "Seeker: "  + this.seeker + "\n" +         
          "Chasers: " + Arrays.toString(this.chasers) + "\n"; 
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Team)) {
            return false;
        }

        Team team = (Team)obj;
        return this.house.equals(team.house) && this.keeper.equals(team.keeper) && 
            this.seeker.equals(team.seeker)  && Arrays.toString(this.chasers).equals(Arrays.toString(team.chasers));

    }

    public int hashCode() {
        return Objects.hash(house, keeper, seeker, Arrays.toString(this.chasers));
    }

}
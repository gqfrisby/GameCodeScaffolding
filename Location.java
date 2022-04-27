public class Location
{
    private String locationNames;
    private int difficulty;
    private String bossName;


    public void Location(String locationNames, int difficulty, String bossName){
        this.locationNames = locationNames;
        this.difficulty = difficulty;
        this.bossName = bossName;
    }



    //Getters and setters

    public String getLocationName() {
        return locationNames;
    }

    public int getDifficulty() {

        return difficulty;
    }

    public String getBossName() {

        return bossName;
    }

    public void setLocationName(String locationNames) {
        this.locationNames = locationNames;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }
}

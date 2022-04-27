import java.util.ArrayList;

public class Location
{
    private ArrayList<String> locationNames = new ArrayList<>();
    private ArrayList<Integer> difficulty;
    private ArrayList<String> bossName;


    public void Location(){
        locationNames.add("Alabasta");
        locationNames.add("Skypiea");

        difficulty.add(3);
        difficulty.add(4);
    }

    public void location1()
    {
        String locationDescription = "";

        locationDescription += "\nA dry sandy wind brushes across your face... You are now entering " + locationNames.get(0) +
        "\n" + locationNames.get(0) + " is a Kingdom located in the midst of a vast Desert" +
                "\n" + locationNames.get(0) + " has a difficulty rating of" + difficulty.get(0);

        System.out.println(locationDescription);
    }

    public void location2(){
        String locationDescription = "";

        locationDescription += "\nA cool breeze blows by... you are now entering " + locationNames.get(1) +
                "\n" + locationNames.get(1) + " is an island located in the clouds" +
                "\n" + locationNames.get(1) + " has a difficulty rating of " + difficulty.get(1);
    }

    //Getters and setters

    public ArrayList<String> getLocationName() {
        return locationNames;
    }

    public ArrayList<Integer> getDifficulty() {

        return difficulty;
    }

    public ArrayList<String> getBossName() {

        return bossName;
    }

    public void setLocationName(ArrayList<String> locationNames) {
        locationNames.add("");
        this.locationNames = locationNames;
    }

    public void setDifficulty(ArrayList<Integer> difficulty) {
        this.difficulty = difficulty;
    }

    public void setBossName(ArrayList<String> bossName) {
        this.bossName = bossName;
    }
}

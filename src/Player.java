public class Player {
    private String name;
    private String position;
    private String team;
    private int age;
    private double exposurePercentage;

    public Player(String name, String position, String team, int age, double exposurePercentage) {
        this.name = name;
        this.position = position;
        this.team = team;
        this.age = age;
        this.exposurePercentage = exposurePercentage;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getTeam() {
        return team;
    }

    public int getAge() {
        return age;
    }

    public double getExposurePercentage() {
        return exposurePercentage;
    }

    @Override
    public String toString() {
        return String.format("%s (%s, %s, Age: %d): %.2f%%", name, position, team, age, exposurePercentage);
    }
}

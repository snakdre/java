package Lists;

public record Place(String city, double distance) {

    @Override
    public String toString() {
        return city + " ( " + distance + "km )";
    }
}


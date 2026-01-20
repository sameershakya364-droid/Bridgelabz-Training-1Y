class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = 3.14159;

        double volumeKm3 = (4.0 / 3) * pi * Math.pow(radiusKm, 3);

        // 1 cubic mile = 4.168e9 cubic meters approximately
        // or 1 km = 0.621371 miles
        double radiusMiles = radiusKm * 0.621371;
        double volumeMiles3 = (4.0 / 3) * pi * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                           " and cubic miles is " + volumeMiles3);
    }
}

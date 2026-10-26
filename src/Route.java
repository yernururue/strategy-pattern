public class Route {
    private final String travelMode;
    private final double distanceKm;
    private final double durationMinutes;

    public Route(String travelMode, double distanceKm, double durationMinutes) {
        this.travelMode = travelMode;
        this.distanceKm = distanceKm;
        this.durationMinutes = durationMinutes;
    }

    @Override
    public String toString() {
        return String.format("%s route: %.1f km, %.0f min", travelMode, distanceKm, durationMinutes);
    }
}

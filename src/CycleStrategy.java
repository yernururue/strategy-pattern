public class CycleStrategy implements RouteStrategy {
    private static final double BIKE_PATH_DETOUR_FACTOR = 1.1;
    private static final double SPEED_KM_PER_HOUR = 15;

    @Override
    public Route buildRoute(Location origin, Location destination) {
        double distanceKm = origin.distanceTo(destination) * BIKE_PATH_DETOUR_FACTOR;
        double durationMinutes = distanceKm / SPEED_KM_PER_HOUR * 60;
        return new Route("Cycle", distanceKm, durationMinutes);
    }
}

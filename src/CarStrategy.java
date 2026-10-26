public class CarStrategy implements RouteStrategy {
    private static final double ROAD_DETOUR_FACTOR = 1.2;
    private static final double SPEED_KM_PER_HOUR = 60;

    @Override
    public Route buildRoute(Location origin, Location destination) {
        double distanceKm = origin.distanceTo(destination) * ROAD_DETOUR_FACTOR;
        double durationMinutes = distanceKm / SPEED_KM_PER_HOUR * 60;
        return new Route("Car", distanceKm, durationMinutes);
    }
}

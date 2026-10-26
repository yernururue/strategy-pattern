public class WalkStrategy implements RouteStrategy {
    private static final double SPEED_KM_PER_HOUR = 5;

    @Override
    public Route buildRoute(Location origin, Location destination) {
        double distanceKm = origin.distanceTo(destination);
        double durationMinutes = distanceKm / SPEED_KM_PER_HOUR * 60;
        return new Route("Walk", distanceKm, durationMinutes);
    }
}

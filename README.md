# Strategy Pattern: Route Planning

A Java implementation of the Strategy pattern. A `Navigator` plans a route using an interchangeable `RouteStrategy` (car, walk or cycle) that can be switched at runtime.

## Structure

```
src/
├── RouteStrategy.java   # Strategy interface
├── CarStrategy.java     # Concrete strategy
├── WalkStrategy.java    # Concrete strategy
├── CycleStrategy.java   # Concrete strategy
├── Navigator.java       # Context
├── Main.java            # Client
├── Location.java        # Point on the map
└── Route.java           # Result: mode, distance, duration
```

## Build and run

Requires JDK 8 or newer.

```bash
javac -d out src/*.java
java -cp out Main
```

Expected output:

```
Car route: 6.0 km, 6 min
Walk route: 5.0 km, 60 min
Cycle route: 5.5 km, 22 min
```

## How to add a new strategy

1. Create a class that implements `RouteStrategy`, e.g. `src/BusStrategy.java`:

   ```java
   public class BusStrategy implements RouteStrategy {
       private static final double SPEED_KM_PER_HOUR = 30;

       @Override
       public Route buildRoute(Location origin, Location destination) {
           double distanceKm = origin.distanceTo(destination) * 1.3;
           return new Route("Bus", distanceKm, distanceKm / SPEED_KM_PER_HOUR * 60);
       }
   }
   ```

2. Use it from the client: `navigator.setStrategy(new BusStrategy());`

No existing class (`Navigator`, `CarStrategy`, etc.) needs to be changed.

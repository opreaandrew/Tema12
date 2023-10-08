package ro.fasttrackit.exercise5;

public enum Planets {
    MERCURY(0.3),
    VENUS(0.9),

    MOON(0.1),

    MARS(0.3),

    JUPITER(2.5),

    SATURN(1.0),

    URANUS(0.8),

    NEPTUNE(1.1),

    PLUTO(0.0),

    IO(0.18),

    EUROPA(0.13),

    GANYMEDE(0.14),

    CALLISTO(0.12),

    SUN(27.0),

    WHITE_DWARF(1300000.0);

    private final Double coefficient;

    Planets(Double coefficient) {
        this.coefficient = coefficient;
    }

    public static Double equivalentEarthWeight(String planet, Double weight){
        if(planet == null){
            return null;
        }

        for (Planets value : Planets.values()) {
            if(value.name().equalsIgnoreCase(planet)){
                return value.coefficient*weight;
            }
        }
        return null;
    }
}

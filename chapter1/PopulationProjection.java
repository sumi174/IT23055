public class PopulationProjection {
    public static void main(String[] args) {
        // Current population
        int currentPopulation = 312032486;

        // Seconds in a year
        int secondsInYear = 365 * 24 * 60 * 60;

        // Birth, death, and immigration rates
        int birthsPerYear = secondsInYear / 7;
        int deathsPerYear = secondsInYear / 13;
        int immigrantsPerYear = secondsInYear / 45;

        // Population growth per year
        int populationGrowthPerYear = birthsPerYear - deathsPerYear + immigrantsPerYear;

        // Project population for the next 5 years
        for (int year = 1; year <= 5; year++) {
            currentPopulation += populationGrowthPerYear;
            System.out.println("Year " + year + ": " + currentPopulation);
        }
    }
}

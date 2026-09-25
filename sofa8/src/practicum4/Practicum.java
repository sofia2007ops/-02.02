package practicum4;

public class Practicum {
    public static void main(String[] args) {
        PopulationInformer populationInformer = new PopulationInformer();
        System.out.println(populationInformer.getPopulationPercent(Continent.ASIA));
        System.out.println(populationInformer.getPopulationPercent(Continent.AFRICA));
        System.out.println(populationInformer.getPopulationPercent(Continent.NORTH_AMERICA));
        System.out.println(populationInformer.getPopulationPercent(Continent.SOUTH_AMERICA));
        System.out.println(populationInformer.getPopulationPercent(Continent.ANTARCTICA));
        System.out.println(populationInformer.getPopulationPercent(Continent.AUSTRALIA));
    }
}
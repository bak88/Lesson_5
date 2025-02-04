import java.util.ArrayList;
import java.util.List;

public class Park {

    private String name;
    private List<Attraction> attractions;

    public Park(String name) {
        this.name = name;
        attractions = new ArrayList<>();

    }

    public void addAttraction(String name, String openingHours, int cost) {
        Attraction newAttraction = new Attraction(name, openingHours, cost);
        attractions.add(newAttraction);
    }

    public void addAttraction(Attraction attraction) {
        Attraction newAttraction = attraction;
        attractions.add(newAttraction);
    }

    @Override
    public String toString() {
        return "Park{" +
                "name='" + name + '\'' +
                ", \nattraction=" + attractions +
                '}';
    }

    public class Attraction {

        private String name;
        private String openingHours;
        private int cost;

        public Attraction(String name, String openingHours, int cost) {
            this.name = name;
            this.openingHours = openingHours;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", openingHours='" + openingHours + '\'' +
                    ", cost=" + cost +
                    '}' ;
        }
    }
}

public class Park {

    private String name;
    private Attraction attraction;

    public Park(String name, String nameAttraction, String openingHours, int cost) {
        this.name = name;
        attraction = new Attraction(nameAttraction, openingHours, cost);
    }

    @Override
    public String toString() {
        return "Park {" +
                "namePark='" + name + '\'' +
                ", attraction=" + attraction +
                '}';
    }

    private class Attraction {

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
                    '}';
        }
    }
}

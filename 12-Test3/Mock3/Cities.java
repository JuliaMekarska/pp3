import java.util.ArrayList;

public class Cities {
    String[] cities;

    public Cities(String[] cities) {
        this.cities = cities;
    }

    Cities filter(char c) {
        ArrayList<String> cityList = new ArrayList<>();
        for (String city : cities) {
            if (c == city.charAt(0)) {
                cityList.add(city);
            }
        }
        return new Cities(cityList.toArray(new String[cityList.size()]));
    }

    String cities() {
        String cityString = "";
        for (String city : cities) {
            cityString += city;
        }
        return cityString;
    }

    public static void main(String[] args) {
        String[] myCities = { "Warszawa", "Sopot", "Kielce", "Szczecin" };
        Cities cities = new Cities(myCities);
        System.out.println(cities.filter('S').cities());
    }
}
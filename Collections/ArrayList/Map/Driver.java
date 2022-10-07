package Collections.ArrayList.Map;

import java.util.HashMap;
import java.util.Map;

public class Driver {
    public static void main(String[] args) {
        Map<String,String> country = new HashMap<>();

        country.put("TR", "Turkiye");
        country.put("GR", "Almanya");
        country.put("EN", "Ingiltere");

        for (String countryKey : country.keySet()) {
            System.out.println(country.get(countryKey));
        }

        for (String countryValue : country.values()){
            System.out.println(countryValue);
        }

    }
    
}

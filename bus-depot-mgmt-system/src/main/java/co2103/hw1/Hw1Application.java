package co2103.hw1;

import co2103.hw1.domain.Depot;
import co2103.hw1.domain.Bus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Hw1Application {

    public static List<Depot> depots = new ArrayList<>();

    public static void main(String[] args) {
        Depot depot = new Depot();
        depot.setId(1);
        depot.setLocation("Leicester");
        depot.setOwner("Owner A");

        Bus bus1 = new Bus();
        bus1.setManufacturer("Ford");
        bus1.setDriver("Driver A");
        bus1.setCity("Birmingham");
        bus1.setRoute(100);

        Bus bus2 = new Bus();
        bus2.setManufacturer("Mercedes");
        bus2.setDriver("Driver B");
        bus2.setCity("Nottingham");
        bus2.setRoute(200);


        depot.setBuses(new ArrayList<>(List.of(bus1, bus2)));
        System.out.println(depot.getBuses());
        depots.add(depot);


        SpringApplication.run(Hw1Application.class, args);
    }
}

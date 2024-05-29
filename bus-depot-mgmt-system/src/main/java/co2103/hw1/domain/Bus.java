package co2103.hw1.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;

public class Bus {
    @NotEmpty(message = "Manufacturer must not be empty")
    private String manufacturer;

    @NotEmpty(message = "Driver must not be empty")
    private String driver;

    @Pattern(regexp = "Leicester|Birmingham|Nottingham", message = "City must be 'Leicester', 'Birmingham', or 'Nottingham'")
    private String city;

    @NotNull(message = "Route must not be null")
    @Min(value = 1, message = "Route must be between 1 and 250")
    @Max(value = 250, message = "Route must be between 1 and 250")
    private int route;  // primitive int cannot be null

    public Bus() {
    }

    // Getters and Setters
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRoute() {
        return route; // Just return the route, no need for null check
    }

    public void setRoute(int route) {
        this.route = route;
    }

    // You might want to add the rest of your logic here
}

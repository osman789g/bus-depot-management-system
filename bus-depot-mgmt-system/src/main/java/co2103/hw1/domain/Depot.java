package co2103.hw1.domain;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

public class Depot {
    @Positive (message = "ID cannot be null")
    private int id;
    @NotEmpty(message = "Location must not be empty")
    private String location;

    @NotEmpty(message = "Owner must not be empty")
    private String owner;
    private List<Bus> buses = new ArrayList<>();



    public Depot() {
        this.buses = new ArrayList<>();
    }


    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getOwner() {
        return owner;
    }

    public List<Bus> getBuses() {
        return buses;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBuses(List<Bus> buses) {
        this.buses = buses;
    }


}

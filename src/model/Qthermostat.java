package model;

import model.json.Thermostat;

public class Qthermostat extends Thing implements IThing {
    private Thermostat ther;

    public Qthermostat(Thermostat ther) {
        super();

        this.ther = ther;
    }

    public Thermostat getTher() {
        return ther;
    }

    public void setTher(Thermostat ther) {
        this.ther = ther;
    }

    @Override
    public String getNodeID() {

        return ther.node_id + "";

    }

}

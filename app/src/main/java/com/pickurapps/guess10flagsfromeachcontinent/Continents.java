package com.pickurapps.guess10flagsfromeachcontinent;

public abstract class Continents {
    private boolean locked;
    private Stage[] stages;

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public Stage[] getStages() {
        return stages;
    }

    public void setStages(Stage[] stages) {
        this.stages = stages;
    }
}

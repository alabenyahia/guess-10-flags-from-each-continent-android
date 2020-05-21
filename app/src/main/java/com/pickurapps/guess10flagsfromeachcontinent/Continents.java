package com.pickurapps.guess10flagsfromeachcontinent;

public abstract class Continents {
    private boolean locked;
    private Stage[] stages;
    private int currentFlagNum;

    public int getCurrentFlagNum() {
        return currentFlagNum;
    }

    public void setCurrentFlagNum(int currentFlagNum) {
        this.currentFlagNum = currentFlagNum;
    }

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

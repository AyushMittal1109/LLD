package org.example.AdaptorDesignPattern.adapter;

import org.example.AdaptorDesignPattern.adaptee.WeightMachine;

public class WeightMachineAdapterForIndia implements WeightMachineAdapter{
    WeightMachine weightMachine;
    public WeightMachineAdapterForIndia(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKG() {
        double weight = weightMachine.getWeightInPonds();
        return weight / 0.45;
    }
}

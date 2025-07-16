package org.example.AdaptorDesignPattern.client;

import org.example.AdaptorDesignPattern.adaptee.WeightMachineUK;
import org.example.AdaptorDesignPattern.adapter.WeightMachineAdapter;
import org.example.AdaptorDesignPattern.adapter.WeightMachineAdapterForIndia;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterForIndia(new WeightMachineUK());
        System.out.println(weightMachineAdapter.getWeightInKG());
    }
}

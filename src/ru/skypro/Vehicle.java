package ru.skypro;

import java.util.Objects;

public abstract class Vehicle {

    private final String modelName;
    private final int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void service() {
        System.out.println("Обслуживаем" + modelName);
        for (int i = 0; i < wheelsCount; i++) {
        }
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }


    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }
}

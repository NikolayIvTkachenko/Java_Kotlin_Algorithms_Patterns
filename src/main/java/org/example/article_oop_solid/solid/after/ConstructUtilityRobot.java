package org.example.article_oop_solid.solid.after;

import org.example.article_oop_solid.solid.before.UtilityRobot;

public class ConstructUtilityRobot extends UtilityRobot implements OperationBuilding {
    public ConstructUtilityRobot(Integer xStart, Integer yStart, Integer serialNumber, Integer repairPointShield) {
        super(xStart, yStart, serialNumber, repairPointShield*2);
    }

    @Override
    public void repairBuilding(BaseBuilding baseBuilding) {
        System.out.println("Repair building ...");
    }

    @Override
    public void buildBuilding(BaseBuilding baseBuilding) {
        System.out.println("Build building ...");
    }

    @Override
    public void destroyBuilding(BaseBuilding baseBuilding) {
        System.out.println("Destroy building ...");
    }
}

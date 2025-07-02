package org.example.article_oop_solid.solid.before;

import org.example.article_oop_solid.solid.after.BaseBuilding;
import org.example.article_oop_solid.solid.after.MilitaryRobot;

public class DevastatorMilitaryRobot extends MilitaryRobot implements OperationBuilding {
    public DevastatorMilitaryRobot(Integer xStart, Integer yStart, Integer serialNumber, Integer attack) {
        super(xStart, yStart, serialNumber, attack);
    }

    @Override
    public void repairBuilding(BaseBuilding baseBuilding) {
        //Данный метод не делает ничего
    }

    @Override
    public void buildBuilding(BaseBuilding baseBuilding) {
        //Данный метод не делает ничего
    }

    @Override
    public void destroyBuilding(BaseBuilding baseBuilding) {
        System.out.println("Destroy enemy buildings... huu-raa ");
    }
}

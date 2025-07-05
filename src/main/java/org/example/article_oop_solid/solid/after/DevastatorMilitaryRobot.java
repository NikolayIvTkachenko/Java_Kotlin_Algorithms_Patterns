package org.example.article_oop_solid.solid.after;

public class DevastatorMilitaryRobot extends MilitaryRobot implements OperationDestroyBuilding {
    public DevastatorMilitaryRobot(Integer xStart, Integer yStart, Integer serialNumber, Integer attack) {
        super(xStart, yStart, serialNumber, attack);
    }

    @Override
    public void destroyBuilding(BaseBuilding baseBuilding) {
        System.out.println("Destroy enemy buildings... huu-raa ");
    }
}

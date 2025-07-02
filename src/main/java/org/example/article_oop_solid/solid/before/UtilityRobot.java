package org.example.article_oop_solid.solid.before;

import java.util.Date;
import java.util.UUID;

public class UtilityRobot extends BaseRobot implements UpdateState {
    protected Integer repairPointShield;

    public UtilityRobot(Integer xStart, Integer yStart, Integer serialNumber, Integer repairPointShield) {
        this.uuid = UUID.randomUUID();
        this.dataIssue = new Date();
        this.power = ConstantApp.getInstance().ROBOT_POWER_UTILITY;
        this.shield = ConstantApp.getInstance().ROBOT_SHIELD_UTILITY;
        this.xPosition = xStart;
        this.yPosition = yStart;
        this.repairPointShield = repairPointShield;
    }

    //...

    public void sendMessage() {
        String messagePosition = "X: " +xPosition + " , Y: " + yPosition;
        String messageData = "UUID: " + uuid + " , repair point: " + repairPointShield
                + " , power: " + power + " , shield: " + shield;
        System.out.println(messagePosition);
        System.out.println(messageData);
    }

    public Integer getRepairPointShield() {
        return repairPointShield;
    }

    public void setRepairPointShield(Integer repairPointShield) {
        this.repairPointShield = repairPointShield;
    }

    @Override
    public Integer moveX(Integer xStep) {
        //Обработка перемещения по оси X
        return 0;
    }

    @Override
    public Integer moveY(Integer yStep) {
        //Обработка перемещений по оси У
        return 0;
    }

    public void repairUnit(BaseRobot item) {
        item.power = 0;
        item.shield += repairPointShield;
        if (item instanceof MilitaryRobot) {
            if(item.shield > ConstantApp.getInstance().ROBOT_SHIELD_MILITARY)
                item.shield = ConstantApp.getInstance().ROBOT_SHIELD_MILITARY;
        } else if (item instanceof UtilityRobot) {
            if(item.shield > ConstantApp.getInstance().ROBOT_SHIELD_UTILITY)
                item.shield = ConstantApp.getInstance().ROBOT_SHIELD_UTILITY;
        } else if (item instanceof TransportRobot) {
            if(item.shield > ConstantApp.getInstance().ROBOT_SHIELD_TRANSPORT)
                item.shield = ConstantApp.getInstance().ROBOT_SHIELD_TRANSPORT;
        }
    }

    @Override
    public void updateItem() {
        this.power = ConstantApp.getInstance().ROBOT_POWER_UTILITY;
    }

}

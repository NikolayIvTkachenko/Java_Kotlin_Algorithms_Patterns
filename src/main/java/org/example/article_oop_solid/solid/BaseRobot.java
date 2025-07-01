package org.example.article_oop_solid.solid;

import java.util.Date;
import java.util.UUID;

public abstract class BaseRobot {
    protected Integer xPosition;
    protected Integer yPosition;
    protected UUID uuid;
    protected Integer serialNumber;
    protected Date dataIssue;
    protected Integer power;
    protected Integer shield;

    public abstract Integer moveX(Integer xStep);
    public abstract Integer moveY(Integer yStep);

    public Integer getxPosition() {
        return xPosition;
    }

    public Integer getyPosition() {
        return yPosition;
    }

    public UUID getUuid() {
        return uuid;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public Date getDataIssue() {
        return dataIssue;
    }

    public Integer getPower() {
        return power;
    }

    public Integer getShield() {
        return shield;
    }
}

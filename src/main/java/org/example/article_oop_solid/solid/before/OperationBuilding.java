package org.example.article_oop_solid.solid.before;

import org.example.article_oop_solid.solid.after.BaseBuilding;

public interface OperationBuilding {
    void repairBuilding(BaseBuilding baseBuilding);
    void buildBuilding(BaseBuilding baseBuilding);
    void destroyBuilding(BaseBuilding baseBuilding);
}

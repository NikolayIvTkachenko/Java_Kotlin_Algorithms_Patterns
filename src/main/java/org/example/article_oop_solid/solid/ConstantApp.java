package org.example.article_oop_solid.solid;

/**
 * Данный класс создан для примера и домонстрации создания потокобезопасного синглетона на Java
 */
public class ConstantApp {

    //Создаем объект,
    private static Object objSync = new Object();

    private ConstantApp(){}

    private volatile static ConstantApp instance;

    public static ConstantApp getInstance() {
        synchronized(objSync)  {
            if (instance == null) {
                instance = new ConstantApp();
            }
        }
        return instance;
    }

    public final Integer MAP_HORIZONTAL = 1000;
    public final Integer MAP_VERTICAL = 1000;

    public final Integer ROBOT_SHIELD_UTILITY = 10;
    public final Integer ROBOT_SHIELD_TRANSPORT = 5;
    public final Integer ROBOT_SHIELD_MILITARY = 50;
    public final Integer ROBOT_POWER_UTILITY = 15;
    public final Integer ROBOT_POWER_TRANSPORT = 30;
    public final Integer ROBOT_POWER_MILITARY = 10;
    public final Integer ROBOT_UTILITY_REPAIR_POINTS = 2;
    public final Integer ROBOT_MILITARY_ATTACK_POINTS = 1;
    public final Integer ROBOT_TRANSPORT_WEIGHT_POINTS = 15;

}

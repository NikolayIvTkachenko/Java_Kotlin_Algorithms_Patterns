package org.example.solid.ver02.DIP.after;

public class WebFramework {
    public void save(I_Form frm) {
        DataBase dataBase = new DataBase();
        dataBase.save(frm);
    }
}

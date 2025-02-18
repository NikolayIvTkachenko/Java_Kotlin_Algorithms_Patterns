package org.example.solid.ver02.DIP.after;

public class dipExample {
    public static void main(String[] args) {
        ModelForm frm = new ModelForm(1, 30,"Petrov");
        WebFramework w = new WebFramework();
        w.save(frm);

    }
}
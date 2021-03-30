package hw_variant1.items;

import hw_variant1.interfaces.IBarkable;
import hw_variant1.interfaces.IChirikable;
import hw_variant1.interfaces.IMewable;

public class Tuki extends Animals implements IChirikable, IBarkable, IMewable {
    String color;
    String nick;

    public Tuki() {
    }

    public Tuki(String kind, String subspecies, String color, String nick) {
        super(kind, subspecies);
        this.color = color;
        this.nick = nick;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "Tuki{" +
                "kind='" + kind + '\'' +
                ", subspecies='" + subspecies + '\'' +
                ", color='" + color + '\'' +
                ", nick='" + nick + '\'' +
                '}';
    }

    @Override
    public void chirik() {
        System.out.println("Chi-chirikki");
    }

    @Override
    public void bark() {
        System.out.println("Bark-bark");
    }

    @Override
    public void meow() {
        System.out.println("Me-me-ow");
    }
}

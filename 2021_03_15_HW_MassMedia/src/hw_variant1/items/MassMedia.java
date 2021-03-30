package hw_variant1.items;

public abstract class MassMedia {
    String name;

    public MassMedia(String name) {
        if (name != null && name.isEmpty())
        this.name = name;
        else
            this.name = "undefined";
    }

    public MassMedia() {
        name = "undefined";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty())
        this.name = name;
        else System.out.println("Wrong MassMedia name.");
    }

    @Override
    public String toString() {
        return "MassMedia{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MassMedia)) return false;
        MassMedia massMedia = (MassMedia) o;
        return getName().equals(massMedia.getName());
    }

}

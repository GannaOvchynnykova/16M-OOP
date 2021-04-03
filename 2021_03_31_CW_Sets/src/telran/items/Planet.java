package telran.items;

public class Planet implements Comparable<Planet> {
    private String name;
    private long size;
    private int timeToEarth;

    public Planet() {
    }

    public Planet(String name, long size, int timeToEarth) {
        this.name = name;
        this.size = size;
        this.timeToEarth = timeToEarth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public int getTimeToEarth() {
        return timeToEarth;
    }

    public void setTimeToEarth(int timeToEarth) {
        this.timeToEarth = timeToEarth;
    }

    @Override
    public String toString() {
        return "\t" + name + "\t" + size + "\t" + timeToEarth;
    }

    @Override
    public int compareTo(Planet o) {
        int res = name.compareTo(o.name);
        int res2 = (int) (size - o.size);
        return res2 == 0? res: res2;
    }

}

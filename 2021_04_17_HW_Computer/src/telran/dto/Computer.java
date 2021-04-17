package telran.dto;

public class Computer {
    private String company; //производитель
    private String cpu; // тип процессора
    private int memory; // ОЗУ

    public Computer(String company, String cpu, int memory) {
        this.company = company;
        this.cpu = cpu;
        this.memory = memory;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "company='" + company + '\'' +
                ", cpu='" + cpu + '\'' +
                ", memory=" + memory +
                '}';
    }
}

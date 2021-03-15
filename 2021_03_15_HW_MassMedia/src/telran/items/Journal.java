package telran.items;

import telran.interfaces.IPrintable;

public class Journal extends MassMedia implements IPrintable {
    int issueNumber;
    int numberOfPages;
    boolean glossy;

    public Journal() {
    }

    public Journal(String name, int issueNumber, int numberOfPages, boolean glossy) {
        super(name);
        this.issueNumber = issueNumber;
        this.numberOfPages = numberOfPages;
        this.glossy = glossy;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean isGlossy() {
        return glossy;
    }

    public void setGlossy(boolean glossy) {
        this.glossy = glossy;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "issueNumber=" + issueNumber +
                ", numberOfPages=" + numberOfPages +
                ", glossy=" + glossy +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Journal ready to print!");
    }
}

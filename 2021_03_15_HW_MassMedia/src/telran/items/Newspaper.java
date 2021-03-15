package telran.items;

import telran.interfaces.IPrintable;

public class Newspaper extends MassMedia implements IPrintable {
    int issueNumber;
    int numberOfPages;

    public Newspaper(String name, int issueNumber, int numberOfPages) {
        super(name);
        this.issueNumber = issueNumber;
        this.numberOfPages = numberOfPages;
    }

    public Newspaper() {
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

    @Override
    public String toString() {
        return "Newspaper{" +
                "name='" + name + '\'' +
                ", issueNumber=" + issueNumber +
                ", numberOfPages=" + numberOfPages +
                '}';
    }


    @Override
    public void print() {
        System.out.println("Newspaper ready to print");
    }
}

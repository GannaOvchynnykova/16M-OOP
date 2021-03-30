package hw_variant1.items;

import hw_variant1.interfaces.IPrintable;

public class Journal extends MassMedia implements IPrintable {
    int issueNumber;
    int numberOfPages;
    boolean glossy;

    public Journal() {
    }

    public Journal(String name, int issueNumber, int numberOfPages, boolean glossy) {
        super(name);
        setIssueNumber(issueNumber);
        setNumberOfPages(numberOfPages);
        setGlossy(glossy);
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        if (issueNumber > 0)
        this.issueNumber = issueNumber;
        else System.out.println("Wrong a jornal issueNumber");
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages > 0)
        this.numberOfPages = numberOfPages;
        else System.out.println("Wrong a jornal numberOf Pages");
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Journal)) return false;
        Journal journal = (Journal) o;
        return getIssueNumber() == journal.getIssueNumber() && getNumberOfPages() == journal.getNumberOfPages() && isGlossy() == journal.isGlossy();
    }

}

package hw_variant1.items;

import hw_variant1.interfaces.IPrintable;

public class Newspaper extends MassMedia implements IPrintable {
    int issueNumber;
    int numberOfPages;

    public Newspaper(String name, int issueNumber, int numberOfPages) {
        super(name);
        setIssueNumber(issueNumber);
        setNumberOfPages(numberOfPages);
    }

    public Newspaper() {
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        if (issueNumber > 0)
            this.issueNumber = issueNumber;
        else System.out.println("Wrong a newspaper issueNumber");
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages > 0)
            this.numberOfPages = numberOfPages;
        else System.out.println("Wrong a newspaper numberOfPages");
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Newspaper)) return false;
        Newspaper newspaper = (Newspaper) o;
        return getIssueNumber() == newspaper.getIssueNumber() && getNumberOfPages() == newspaper.getNumberOfPages();
    }

}

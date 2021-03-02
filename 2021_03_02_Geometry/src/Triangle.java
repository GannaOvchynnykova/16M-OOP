public class Triangle extends Figure {
    double perimeter;

    public Triangle(double cooficient) {
        super(cooficient);
    }

    @Override
    void findPerimeter() {
        this.perimeter = 1 + 2;
    }

    @Override
    void findSquare() {

    }
}

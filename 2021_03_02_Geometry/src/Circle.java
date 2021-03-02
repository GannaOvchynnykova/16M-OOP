public class Circle extends Figure {
    double length;
    double radius;
    double square;

    public Circle(double radius, double cooficient ) {
        super(cooficient);
        this.cooficient = cooficient;
        this.radius = radius;
    }

    @Override
    void findPerimeter() {
        this.length = 2 * Math.PI * radius;
    }

    @Override
    void findSquare() {
        this.square = Math.PI * radius * radius;

    }
}

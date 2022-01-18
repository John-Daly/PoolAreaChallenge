public class Rectangle {

    double width;
    double length;

    public Rectangle(double width, double length){
        if (width < 0){
            this.width = 0;
        }
        this.width = width;

        if (length < 0){
            this.length = 0;
        }
        this.length = length;
    }

    public Rectangle(){

    }

    public double getWidth(){
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea(){
        return this.width * this.length;
    }
}

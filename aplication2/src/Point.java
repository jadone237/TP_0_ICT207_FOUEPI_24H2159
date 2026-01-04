public class Point {
    double x,y;
    Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    Point(Point p){
        this.x= p.x;
        this.y= p.y;
    }
    Point(){
        this.x = 0;
        this.y = 0;
    }
    void afficher() {
        System.out.println("(" + this.x + "," + this.y + ")");
    }

    double distance(Point p) {
        return Math.sqrt((this.x - p.x) * (this.x - p.x)
                + (this.y - p.y) * (this.y - p.y));
    }

    void deplacer(double dx, double dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }
}

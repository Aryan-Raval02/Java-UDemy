public class Cylinder {

    public int radius,height;

    public double lidArea(){
        return Math.PI*radius*radius;
    }

    public double totalSurfaceArea(){
        return 2*lidArea()+circumference()*height;
    }

    public double circumference(){
        return 2*Math.PI*radius;
    }

    public double volume(){
        return lidArea()*height;
    }

    public static void main(String[] args) {
        Cylinder c = new Cylinder();

        c.radius = 7;
        c.height = 10;

        System.out.println("Lid Area : "+c.lidArea());
        System.out.println("Surface Area : "+c.totalSurfaceArea());
        System.out.println("Circumference : "+c.circumference());
        System.out.println("Volume : "+c.volume());
    }
}

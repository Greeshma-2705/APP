public class Area {
    
    void calcarea(int s){
     int area=s*s;
      System.out.println("AREA OF SQUARE: "+area);
    }
    void calcarea(int l,int b){
       int area=l*b;
        System.out.println("AREA OF RECTANGLE: "+area);
    }
    void calcarea(double  r){
        double area=3.14*r*r;
        System.out.println("AREA OF CIRCLE: "+area);
    }
    public static void main(String[] args) {
        Area a=new Area();
        a.calcarea(9);
        a.calcarea(6.5);
        a.calcarea(9, 8);


    }
}

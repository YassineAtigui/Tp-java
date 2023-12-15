public class TestPoint{
    public static void main(String[] args) {
        Point p = new Point();
        Point p2 = new Point(2.0,3.0);
        p.setX(1.0);
        p.setY(2.0);
        System.out.println("x.p :"+p.getX() +" | x.p2 :"+ p2.getX());
        System.out.println("y.p :"+p.getY()+" | y.p2 :"+ p2.getY());
        //impossible ==> Private System.out.println( p.x +" "+ p2.y);
        System.out.println("La distance entre p et p2 :"+p.distance(p2));
        System.out.println("La distance entre p et p2 :"+p.distance(p2,p));
        System.out.println(p.equals(p2));
        Point q = new Point(1.0,2.0);
        System.out.println("x.p :"+p.getX() +" | x.q :"+ q.getX());
        System.out.println("y.p :"+p.getY()+" | y.q :"+ q.getY());
        System.out.println(p.equals(q));
        Point q2 = q ;
//        System.out.println("E :"+q.equals(q2));
        System.out.println("E2 :"+p.equals2(q));
        //System.out.println("E3 :"+p.equals3(c));

        Object a = new Point (2.0,5.0); 
        Object b = new Point (2.0,5.0);
        System.out.println("E3 :"+((Point) a).equals3(b));
        System.out.println(p.toString());

        String s1 = "hello";
        String s3 = new String("hello");

        System.out.println(s1.equals(s3));

    }


}
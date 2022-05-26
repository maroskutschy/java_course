public class Main2 {

    static boolean isWorking;

    public static void main(String[] args) {
        //boolean isWorking;
        // if you declare as field on row 3, it is compiled ok
        System.out.println(isWorking);

        // defaul values are used
        Person p = new Person();
        System.out.println(p.getAge());
        System.out.println(p.isMarried());


        // not equal - heap
        Integer a = new Integer(10);
        Integer b = 10;

        System.out.println("Max : " + b.MAX_VALUE);
        System.out.println("Min : " + a.MIN_VALUE);

        // yes equal - stack
        int c = 10;
        int d = 10;

        System.out.println( "equal: " + (a==b));
        System.out.println("equal: " + (a.intValue() == b.intValue()));
        System.out.println( "equal: " + (a.equals(b)));
        System.out.println( "equal: " + (a.compareTo(b)));

        System.out.println("equal: " + (c==d));

        // boxing = from primitive to warpper
        int ax=50;
        Integer a2=new Integer(ax);//Boxing
        Integer a3=5;//Boxing

        // unboxing = from Wrapper to primitive
        Integer i=new Integer(50);
        int ai=i;

        // autoboxing ???


    }

}

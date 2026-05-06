public class tester {
    public static void main(String[] args) {
        phone g1=new phone("Apple","iPhone13",2888,2019,'L',false,true, new String[]{"gps","bluetooth"},false);
        System.out.println(g1);
        g1.setSize('k');
        g1.setYear(1988);
        g1.setBrand("");
        g1.setPrice(-100);
        g1.setFeatures(new String[]{"nn"});
        System.out.println(g1);
        phone g2=new phone( "samsung","gslsxy s22",3444,2045,'s',false,true,new String[]{"gps","bluetooth"} ,false);
        g2.setSize('k');
        g2.setYear(1988);
        g2.setBrand("");
        g2.setisOn(true);
        g2.setIslocked(true);
        g2.setFeatures(new String[]{""});
        System.out.println(g2);


    }

}

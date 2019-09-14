public class ThirdFunctionalityOfString {
    public static void main(String[] args) {
        String name="Mr. ABC"; //my string constant
        String name1="Mr. ABC";
        int i = name.compareTo(name1);
        System.out.println("Comparision Status :"+i);
        boolean m = name.startsWith("N");
        System.out.println("name strating with M "+m);
        boolean n = name.endsWith("C");
        System.out.println("name ends with C "+n);
        int a = name.indexOf('A');
        System.out.println("Position of a in name : "+a);
        int i1 = name.indexOf(".", 1);
        System.out.println("Position of dot in name"+i1);
    }
}

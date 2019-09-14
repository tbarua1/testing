public class StringFunctionalityTest {
    public static void main(String[] args) {
       String name="Mr. ABC"; //my string constant
       String name1="Mr. KBC";
        int length = name.length();
       System.out.println("Length of name : "+length);
        char c = name.charAt(5);
        System.out.println("Character at 5th psition : "
                +c);
        boolean equals = name.equals(name1);
        System.out.println(" MR. ABC and KBC euqal : "
                +equals);
        String substring = name.substring(4, 7);
        System.out.println("My Sub String : "+substring);

        }
}

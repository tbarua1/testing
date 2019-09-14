public class SecondStringFunctionality {
    public static void main(String[] args) {
        String name="Mr. ABC"; //my string constant
        String name1="Mr. KBC";
        char[] character_array=new char[5];
        //only valid java 8 or above
        for(char c:character_array){
            System.out.println(c);
        }
        name.getChars(4,7,character_array,
                0);
        for(char c:character_array){ //after inserting values
            System.out.println(c);
        }
    }
}

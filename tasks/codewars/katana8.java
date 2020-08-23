package tasks.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class katana8 {
    public static String camelCase(String input) {
        if(input.isEmpty())
            return null;
        char[] chars = input.toCharArray();
        StringBuilder output = new StringBuilder();
        output.append(chars[0]);
        for (int i=1;i<chars.length;i++){
            if(Character.isUpperCase(chars[i])){
                output.append(' ');
            }
            output.append(chars[i]);

        }
        return output.toString();
    }

    /**
     * Best solution
     */
//    public static String camelCase(String input) {
//        return input.replaceAll("([A-Z])", " $1");
//    }

    @Test
    public void tests() {
        assertEquals( "Incorrect", "camel Casing", katana8.camelCase("camelCasing"));
        assertEquals( "Incorrect", "camel Casing Test", katana8.camelCase("camelCasingTest"));
        assertEquals( "Incorrect", "camelcasingtest", katana8.camelCase("camelcasingtest"));
    }
}


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    // Use this to remove postfix from name

    // need to match pattern exactly.

    public static String removePostfix(String nameString) {

        String pattern = "@..............."; // this is what I want to remove (for personal conversation)

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(nameString);

        if (m.find( )) {
            String newString = "";
            newString = m.group(0);
            nameString = nameString.replace(newString, "");
        }

        return nameString;
    }

    public static String removePostfixgroup(String nameString) {

        String pattern = "@.........................."; // this is what I want to remove (for group conversation)

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(nameString);

        if (m.find( )) {
            String newString = "";
            newString = m.group(0);
            nameString = nameString.replace(newString, "");
        }

        return nameString;
    }
}
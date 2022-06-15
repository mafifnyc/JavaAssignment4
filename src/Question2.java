public class Question2 {

    public static boolean passwordIsValid(String password) {
        int count = 0;

        if (password.length() < 10) {
            return false;
        }
        if (password.contains(" ") || password.contains("`") || password.contains("~") || password.contains("!")
                || password.contains("@") || password.contains("#") || password.contains("$") || password.contains("%")
                || password.contains("^") || password.contains("&") || password.contains("*") || password.contains("(")
                || password.contains(")") || password.contains("-") || password.contains("_") || password.contains("=")
                || password.contains("+") || password.contains("[") || password.contains("{") || password.contains("]")
                || password.contains("}") || password.contains(";") || password.contains(":") || password.contains("'")
                || password.contains("\"") || password.contains(",") || password.contains("<") || password.contains(".")
                || password.contains(">") || password.contains("/") || password.contains("?"))
        {
            return false;
        }
        for(int i=0; i<password.length(); i++)
        {
            char ch=password.charAt(i);
            if(ch>47 && ch<58) {
                count++;
            }
        }
        if(count<2) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(passwordIsValid("12!3AbcAbcAbc"));
    }

}

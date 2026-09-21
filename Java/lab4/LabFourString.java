class LabFourString {
    public static void main(String args[]){
        String str = "Hello, World!";
        System.out.println("Length of the string: " + str.length());

        System.out.println("Character at index 7: " + str.charAt(7));
        System.out.println("Character at index 0: " + str.charAt(0));

        System.out.println("Does the string start with 'Hello'? " + str.startsWith("Hello"));
        System.out.println("Does the string end with 'World!'? " + str.endsWith("World!"));
        String title = "Lab 4: String";
        System.out.println("Index of b: " + title.indexOf('b'));
        System.out.println("Index of `Stri`: " + title.indexOf("Stri"));
        System.out.println("Last index of a: " + title.lastIndexOf('a'));

        String username = "Spongybucket";
        String password = "1234";
        System.out.println("Are the username and password equal? " + username.equals(password));
        System.out.println("Is username equal to 'Spongybucket': " + username.equals("Spongybucket"));
        System.out.println("Is password equal to '1234': " + password.equals("1234"));
        System.out.println("Is username equal to 'SPONGYBUCKET' (ignoring case)? " + username.equalsIgnoreCase("SPONGYBUCKET"));

        String college = "Dav College | BCA | Lalitpur";
        System.out.println("Original String: " + college);
        System.out.println("Uppercase: " + college.toUpprCase());
        System.out.println("Lowercase: " + college.toLowerCase());

        String session = "OOP in Java";
        String[] result = session.split(" ");
        System.out.println("Split string: ");
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }

        for (String s : result) {
            System.out.println(s);
        }
	String regex = "a|e|i|o|u|A|E|I|O|U";
        String[] regexResult = session.split(regex);
        System.out.println("Split string with regex pattern: ");
        for (String s : regexResult) {
            System.out.println(s);
        }
        System.out.println("String before joining: ");
        for (String s : result) {
            System.out.println(s);
        }
        System.out.println("Joining the string array with '-' delimiter: ");
        String joinedString = String.join("-", result);
        System.out.println("Joined string: " + joinedString);

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("StringBuffer before append: " + sb);
        sb.append(", World!");
        System.out.println("StringBuffer after append: " + sb);
        sb.insert(5, " Java");
        System.out.println("StringBuffer after insert: " + sb);
        sb.setCharAt(0, 'h');
        System.out.println("StringBuffer after update: " + sb);
        sb.delete(5, 10);
        System.out.println("StringBuffer after delete: " + sb);
    }
}

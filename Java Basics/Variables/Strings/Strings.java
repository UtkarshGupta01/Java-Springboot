// Introduction to Strings

public class Strings {
  public static void main(String[] args) {
    String fname = "Utkarsh";
    String lname = "Gupta";

    // concatenation
    String fullname = fname + " " + lname;
    System.out.println(fullname);

    // charAt
    System.out.println(fname.charAt(4));

    // length
    System.out.println(fname.length());

    // replace
    String new_fname = fname.replace('s', 'c');
    System.out.println(new_fname);

    // substring
    System.out.println(fname.substring(3, 7));

  }

}

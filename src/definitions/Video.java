package definitions;

public class Video {
    // member variables =?
    // fields/variables of a class

    // creating definition classes in Java

    //rules for creating fields
    // 1. Set the Visibility modifier of the fields to private unless otherwise specified.
    // 2. Set the access modifier of the fields to non-static unless otherwise specified.


    private String videoName;
    private boolean checkOut;
    private int rating;

    // we can create special types of methods to access these fields outside the class.
    // 1.Getter Methods:
    // Observer methods / Accessor methods
    // we can use the getter methods to access the value of a fiels i.e read it.

    public String getVideoName() {
        return videoName;
    }

    public int getRating() {
        return rating;
    }

    // exception for boolens: the getter method starts with 'is' instead of 'get'
    public boolean isCheckOut() {
        return checkOut;
    }

    /*
     * public <am:sameAsTheField> <rt:sameasTheField> get<NameOfTheField> () {}
     *
     */
}

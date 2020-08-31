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
    // we can use the getter methods to access the value of a fields i.e read it.

    // 2.Setter Method:
    // Transformer method / Mutator methods
    // we can use the setter method to set the value of a field i.e read it.

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public int getRating() {
        return rating;
    }

    /*
     * public <am:sameAsTheField> void set<NameOfTheField>(<SameAsTheField>) {}
     *
     * */

    public void setRating(int rating) {
        this.rating = rating;
    }

    // exception for booleans: the getter method starts with 'is' instead of 'get'
    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }



    /*
     * public <am:sameAsTheField> <rt:sameasTheField> get<NameOfTheField> () {}
     *
     * */
}

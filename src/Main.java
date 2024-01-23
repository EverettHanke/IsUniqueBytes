/*
    Code written by: Everett Hanke
    Cohort 19 Green River College
    Note: I've decided to take an old homework assignment and reapportion the assignment with a newly learned technique.
    Explanation: Using the bits of an int variable (32 btw) I can mimic an arraylist by matching the bits of each character
    and if there is any overlap (ex: "Hello" has 2 'l' so it is not unique) then the word is not unique and if there is no overlap
    (ex: "quick" has no duplicate chars) then the word is unique.
 */
public class Main {

    public static void main(String[] args)
    {
        isUnique unique = new isUnique();
        isUnique unique1 = new isUnique();
        isUnique unique2 = new isUnique();
        System.out.println("Hello and welcome!");
        System.out.println("Is 'string' a unique word: "+unique.isUnique("string")); //prints true
        System.out.println("Is 'unique' a unique word: " + (unique1.isUnique("unique"))); //prints false
        System.out.println("Is 'hello' a unique word: " + (unique2.isUnique("hello"))); //prints false
    }

}
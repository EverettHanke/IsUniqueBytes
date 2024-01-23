public class isUnique
{
    private int inventory;

    /**
     * getIndex method
     * @param letter
     * @return
     */
    public int getIndex(char letter)
        {
            return letter - 'a';
        }
        /**
         * add method adds letters to an inventory
         * @param letter
        */
        public void add(char letter)
        {
            int position = getIndex(letter);
            int temp = 1 << position;
            inventory += temp;
            System.out.println("Current inventory num: "+ inventory);
        }

        public boolean isPresent(char letter)
        {
            //we will get position of letter then create a temp number of that bit number
            int position = getIndex(letter);
            //below is how we place that bit num. we will cross reference it with inventory now
            int temp = 1 << position;

            int check = inventory & temp; // "&" is actually a bitwise AND
        /*
        we may have two ints bits and compare now
        first: 0001001000
        second:0010111000
        &:     ___________
        result:0000001000
        note this is & so there must be two 1's in order for the result to retrieve a 1. this will be considered true
         */
            //then we return check over 0 because if there is any trues then we will have a 1
            return check > 0;
        }
    /**
     * isUnique method
     * @param word
     * @return boolean
     * @throws StringIndexOutOfBoundsException
     */
    public boolean isUnique(String word) throws StringIndexOutOfBoundsException
    {
        //first we will declare an int that will act as our array

        //second we will create a loop to go through all chars in the word
        for (int i = 0; i < word.length(); i++)
        {
            add(word.charAt(i));
            if (isPresent(word.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }

}

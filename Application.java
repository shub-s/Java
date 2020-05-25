class Application{
    public static void print(Object msg){
        System.out.println(String.valueOf(msg));
    }
    public static void main(String[] args) {
        String[] wordListOne = {"A","B","C","D","E","F"};
        String[] wordListTwo = {"0","1","2","3","4","5","6","7","8","9"};

        int oneLength = wordListOne.length;
        int twoLenght = wordListTwo.length;

        int rand1 = (int)(Math.random() * oneLength);
        int rand2 = (int)(Math.random() * twoLenght);
        int rand3 = (int)(Math.random() * oneLength);
        int rand4 = (int)(Math.random() * twoLenght);
        int rand5 = (int)(Math.random() * oneLength);
        int rand6 = (int)(Math.random() * twoLenght);

        String phrase = wordListOne[rand1]+wordListTwo[rand2]+wordListOne[rand3]+wordListTwo[rand4]+wordListOne[rand5]+wordListTwo[rand6];

        print(phrase);
    }
}
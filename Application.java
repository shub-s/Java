class Application{
    public static void print(Object msg){
        System.out.println(String.valueOf(msg));
    }
    public static void main(String[] args) {
        String[] wordListOne = {"24/7","multi-Tiar","30,OOOfoot","B-to-B", "win-win","front-end"," web-based" ,"pervasive","smart","six-sigma","critical-path" ,"dynamic"};
        String[] wordListTwo = {"empowered","sticky","value-added.","oriented","centric","distributed","clustered","branded","outaide-the-box","positioned","networked"," focused", "leveraged","aligned","targeted","shared","cooperative","accelerated"};

        int oneLength = wordListOne.length;
        int twoLenght = wordListTwo.length;

        int rand1 = (int)(Math.random() * oneLength);
        int rand2 = (int)(Math.random() * twoLenght);

        String phrase = wordListOne[rand1]+" "+wordListTwo[rand2];

        print(phrase);
    }
}
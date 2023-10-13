public class PhraseOMatic {
    public static void main(String[] args){
        String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", 
        "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma",
        "critical-path", "dynamic"};

        String[] wordListTwo = {"empowered", "sticky", "value-added", 
        "oriented", "centric", "distributed", "clustered", "branded", 
        "outside-the-box", "positioned", "networked", "focused", "leveraged",
        "aligned", "targeted", "shared", "cooperative", "accelerated"};

        String[] wordLisThree = {"process", "tipping=pointed", "solution", 
        "architecture", "core competency", "strategy", "mindshare", "portal", 
        "space", "vision", "paradim", "mission"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordLisThree.length;

        // Math.random() would return a value between 0 and 1.
        // (int) will get the integer of Math.random() times length of one wordlist.
        int rand1 = (int)(Math.random() * oneLength);
        int rand2 = (int)(Math.random() * twoLength);
        int rand3 = (int)(Math.random() * threeLength);

        String phrase = wordListOne[rand1] + "" + wordListTwo[rand2] + "" 
        +wordLisThree[rand3];

        System.out.println("What we need is a " + phrase);
    }    
}

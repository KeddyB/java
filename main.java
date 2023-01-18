class Main {
    static int age;
    public static void main(String[] args){
        
        int score = 0;
        int turns = 10;
        for(int i = 0; i<=turns; i++){
            if (turns == i) {
                System.out.println("ÿour score " + score++);
            } else {
                System.out.println("your turn "+ turns--);
            }
        };
    }
 }
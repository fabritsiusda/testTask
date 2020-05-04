public class NumberTask {

    private final String FIRST_STRING = "Two";
    private final String SECOND_STRING = "Seven";
    private final int FIRST = 2;
    private final int SECOND = 7;

    public void show(int count){
        for (int i = 1; i <= count; i++){
            if (i % FIRST == 0)
                System.out.print(FIRST_STRING);
            if (i % SECOND == 0)
                System.out.print(SECOND_STRING);
            if (i % FIRST != 0 && i %SECOND != 0)
                System.out.print(i);
            System.out.println();
        }
    }

}

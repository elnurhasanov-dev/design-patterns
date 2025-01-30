package structuralDesignPatterns.adapter.example3;

public class SDCardImpl implements SDCard {

    @Override
    public void insertIntoSDCardSlot() {
        System.out.println("SD Card inserted into slot.");
    }
}

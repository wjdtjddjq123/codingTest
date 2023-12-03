package sauna;

public class water {
    private int water;
    private int temp;
    private String waterTemp;

    int setTemp(int temp) {
        this.temp = temp;
        return temp;
    }
    String water() {
        if (temp == 5) {
            waterTemp = "중탕";
        } else if (temp > 6) {
            waterTemp = "온탕";
        } else {
            waterTemp = "냉탕";
        }
        return waterTemp;
    }

    void tempUp() { temp++; }
    void tempDown() { temp--;}

}
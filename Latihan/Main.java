package LatihanClass3;
public class Main {
    public static void main(String[] args) {
        Biodata biodata = new Biodata();
        biodata.inputData("2021071008", "Miftah Adha");
        biodata.viewData();

        Biodata mhs = new Biodata();
        mhs.inputData("202201008", "Mynzuw");
        mhs.viewData();
    }
}

package entities;

public class SinhVienIT extends StudentTechmaster{
    private double java;
    private double html;

    public SinhVienIT(double java, double html) {
        this.java = java;
        this.html = html;
    }

    public SinhVienIT() {
        super();
    }

    public SinhVienIT(String name, double java, double html) {
        super(name);
        this.java = java;
        this.html = html;
    }

    public void getInfoOfIt(int i){

    }

    public void getInfoOfIt(String s){

    }
}

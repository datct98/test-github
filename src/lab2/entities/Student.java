package lab2.entities;

public class Student {
    private static int autoId;
    private int id;
    private String name;
    private double math;
    private double physic;
    private double chemistry;

    public Student(String name, double math, double physic, double chemistry) {
        this.id = ++autoId;
        this.name = name;
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysic() {
        return physic;
    }

    public void setPhysic(double physic) {
        this.physic = physic;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", math=" + math +
                ", physic=" + physic +
                ", chemistry=" + chemistry +
                '}';
    }

    public double caculateAVG(){
        return (math+physic+chemistry)/3;
    }

    public String classify(){
        double avg = caculateAVG();
        if (avg>=8) return "A";
        else if ((avg<8 && avg>= 6.5)) return "B";
        return "C";
    }
}

package B13.lab4.entities;
// NV hành chính
public class MarketingStaff extends Staff{
    private double bonusPercent;
    private double kpi;

    public MarketingStaff(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double caculateSalary() {
        return 0;
    }

    @Override
    public double caculateTax() {
        return 0;
    }

    public MarketingStaff(String name, double salary, double bonusPercent, double kpi) {
        super(name, salary);
        this.bonusPercent = bonusPercent;
        this.kpi = kpi;
    }

    public double getBonusPercent() {
        return bonusPercent;
    }

    public void setBonusPercent(double bonusPercent) {
        this.bonusPercent = bonusPercent;
    }

    public double getKpi() {
        return kpi;
    }

    public void setKpi(double kpi) {
        this.kpi = kpi;
    }

    @Override
    public String toString() {
        return "MarketingStaff{" +
                "bonusPercent=" + bonusPercent +
                ", kpi=" + kpi +
                '}';
    }
}

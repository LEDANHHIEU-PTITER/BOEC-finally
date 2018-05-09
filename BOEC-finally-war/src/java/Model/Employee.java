package Model;

public class Employee extends Person {

    Store store;
    private float salaryBase;
    private float coefficient;
    private float numberExperience;

    public Employee() {
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public float getSalaryBase() {
        return salaryBase;
    }

    public void setSalaryBase(float salaryBase) {
        this.salaryBase = salaryBase;
    }

    public float getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(float coefficient) {
        this.coefficient = coefficient;
    }

    public float getNumberExperience() {
        return numberExperience;
    }

    public void setNumberExperience(float numberExperience) {
        this.numberExperience = numberExperience;
    }

}

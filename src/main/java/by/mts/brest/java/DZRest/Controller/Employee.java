package by.mts.brest.java.DZRest.Controller;

public class Employee {
    static int portal_id = 0;
    private String name;
    private String surname;
    private String patronymic;
    private String datebirth;
    private String position;
    private String adress_work;
    private Integer age;
    // private String grade;
    private String telephone_stack;
    private boolean at_work = true;

    public static int getPortal_id() {
        return portal_id;
    }

    public static void setPortal_id(int portal_id) {
        Employee.portal_id = portal_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDatebirth() {
        return datebirth;
    }

    public void setDatebirth(String datebirth) {
        this.datebirth = datebirth;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAdress_work() {
        return adress_work;
    }

    public void setAdress_work(String adress_work) {
        this.adress_work = adress_work;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTelephone_stack() {
        return telephone_stack;
    }

    public void setTelephone_stack(String telephone_stack) {
        this.telephone_stack = telephone_stack;
    }

    public Employee(String surname, String name, Integer age, String position) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.age = age;
    }

    public Employee() {
        System.out.println();
    }

    public Employee(String name, String surname, String patronymic, String datebirth, String position, String adress_work, String telephone_stack, boolean at_work/*, String grade*/) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.datebirth = datebirth;
        this.position = position;
        this.adress_work = adress_work;
        this.telephone_stack = telephone_stack;
        this.at_work = at_work;
        //this.grade = grade;
    }

}

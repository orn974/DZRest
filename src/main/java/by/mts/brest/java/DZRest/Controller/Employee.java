package by.mts.brest.java.DZRest.Controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    static int portal_id = 0;
    private String name;
    private String surname;
    private String patronymic;
    private String datebirth;
    private String position;
    private String adress_work;
    private Integer age;
    private String telephone_stack;
    private boolean at_work = true;

    public Employee(String surname, String name, Integer age, String position) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.age = age;
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
    }
}

package models;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
    private boolean isActive;
    private String name;
    private String surname;
    private LocalDate hireDate;
    public enum seniorityLevel {
        JUNIOR,
        MID,
        SENIOR
    }
    private seniorityLevel seniorityLevel;

    public Employee(boolean isActive, String name, String surname, LocalDate hireDate) {
        this.isActive = isActive;
        this.name = name;
        this.surname = surname;
        this.hireDate = hireDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
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

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public seniorityLevel getSeniorityLevel() {
        return seniorityLevel;
    }

    public void setSeniorityLevel(seniorityLevel seniorityLevel) {
        this.seniorityLevel = seniorityLevel;
    }

  @Override
  public String toString() {
    return "Employee{" +
      "isActive=" + isActive +
      ", name='" + name + '\'' +
      ", surname='" + surname + '\'' +
      ", hireDate=" + hireDate +
      ", seniorityLevel=" + seniorityLevel +
      '}';
  }
}

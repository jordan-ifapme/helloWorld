package step.employee;


import models.Employee;
import step.Step;
import step.StepReport;
import step.StepResponse;

import java.time.LocalDate;
import java.util.List;

public class ComputeSeniorityStep implements Step<Employee> {
  StepReport report = new StepReport();

  public ComputeSeniorityStep() {
  }

  @Override
  public StepResponse<Employee> execute(List<Employee> input) {
    for (Employee emp : input) {
      if (emp.getHireDate() != null) {
        LocalDate currentDate = LocalDate.now();
        int diffInYear = currentDate.getYear() - emp.getHireDate().getYear();

        if (diffInYear >= 5) {
          emp.setSeniorityLevel(Employee.seniorityLevel.SENIOR);
        } else if (diffInYear >= 2) {
          emp.setSeniorityLevel(Employee.seniorityLevel.MID);
        } else {
          emp.setSeniorityLevel(Employee.seniorityLevel.JUNIOR);
        }
        report.addToTreatedItems();
      } else {
        report.addToErroredItems();
      }
    }
    return new StepResponse<>(report, input);
  }
}

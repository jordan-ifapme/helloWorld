package step.employee;

import models.Employee;
import step.StepResponse;
import step.Step;
import step.StepReport;

import java.util.List;

public class NormalizeNamesStep implements Step<Employee> {
    StepReport report = new StepReport();
    public NormalizeNamesStep() {
    }

    @Override
    public StepResponse<Employee> execute(List<Employee> input) {
      input.forEach(this::normalizeEmployeAndIncrementReport);
      return new StepResponse<Employee>(report, input);
    }

    private void normalizeEmployeAndIncrementReport(Employee employee) {
      employee.setName(normalizeString(employee.getName()));
      employee.setSurname(normalizeString(employee.getSurname()));
      report.addToTreatedItems();
    }

    private String normalizeString(String value) {
      return value.substring(0, 1)
        .toUpperCase() + value.substring(1)
        .toLowerCase();
    }
}

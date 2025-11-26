package step.employee;
import models.Employee;
import step.StepResponse;
import step.Step;
import step.StepReport;

import java.util.ArrayList;
import java.util.List;

public class RemoveInactiveEmployeesStep implements Step<Employee> {
    StepReport report = new StepReport();
    public RemoveInactiveEmployeesStep() {
    }

    @Override
    public StepResponse<Employee> execute(List<Employee> input) {
        ArrayList<Employee> activeEmployees = new ArrayList<>();
        for (Employee emp : input) {
            if (emp.isActive()) {
                activeEmployees.add(emp);
            } else {
                report.addToFilteredItems();
            }
        }
        return new StepResponse<Employee>(report, activeEmployees);
    }
}

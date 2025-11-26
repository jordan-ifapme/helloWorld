
import models.Employee;
import step.ProcessingPipeline;
import step.employee.ComputeSeniorityStep;
import step.employee.NormalizeNamesStep;
import step.employee.RemoveInactiveEmployeesStep;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(true, "john", "doe", buildLocalDate(2021, 15)));
        employees.add(new Employee(false, "jane", "smith", buildLocalDate(2019, 170)));
        employees.add(new Employee(true, "alice", "johnson", buildLocalDate(2002, 98)));

        ProcessingPipeline<Employee> pipeline = new ProcessingPipeline<>();
        pipeline.addStep(new RemoveInactiveEmployeesStep());
        pipeline.addStep(new ComputeSeniorityStep());
        pipeline.addStep(new NormalizeNamesStep());
        List<Employee> pipelineOutput = pipeline.execute(employees);
        pipelineOutput.forEach(System.out::println);
    }

    private static LocalDate buildLocalDate(int year, int day) {
      return LocalDate.ofYearDay(year, day);
    }
}

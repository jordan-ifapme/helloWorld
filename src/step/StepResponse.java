package step;


import java.util.ArrayList;
import java.util.List;

public class StepResponse<T> {
    private StepReport stepReport;
    private List<T> data;

    public StepResponse(StepReport stepReport, List<T> data) {
        this.stepReport = stepReport;
        this.data = data;
    }

    public StepReport getStepReport() {
        return stepReport;
    }

    public List<T> getData() {
        return data;
    }
}

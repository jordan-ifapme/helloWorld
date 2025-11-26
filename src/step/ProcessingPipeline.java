package step;


import java.util.ArrayList;
import java.util.List;

public class ProcessingPipeline<T> {
    private List<Step<T>> step;
    private List<String> reportMessage = new ArrayList<String>();

    public ProcessingPipeline() {
        this.step = new ArrayList<>();
    }

    public void addStep(Step<T> step) {
        this.step.add(step);
    }

    public List<T> execute(List<T> input) {
      List<T> output = input;
        StepResponse<T> response = null;
        for (Step<T> s : step) {
            response = s.execute(output);
            output = response.getData();
            if (response.getStepReport() != null) {
                reportMessage.add("Step " + s.getClass().getSimpleName() + " executed with " + response.getStepReport().getTreatedItems() + " treated items, "
                        + response.getStepReport().getFilteredItems() + " filtered items, "
                        + response.getStepReport().getErroredItems() + " failed items.");
            }
        }
        for (String msg : reportMessage) {
            System.out.println(msg);
        }

        return output;
    }
}

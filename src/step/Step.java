package step;



import java.util.List;

public interface Step<T> {
    public StepResponse<T> execute(List<T> input);
}

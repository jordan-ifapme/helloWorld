package step;

import java.util.List;

public class PersistToDatabaseStep<T> implements Step<T> {
    public PersistToDatabaseStep() {
    }

    @Override
    public StepResponse<T> execute(List<T> input) {
        return new StepResponse<T>(null, input);
    }
}

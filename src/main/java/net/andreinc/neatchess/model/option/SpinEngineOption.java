package net.andreinc.neatchess.model.option;

public class SpinEngineOption extends EngineOption<Integer> {

    private Integer min;
    private Integer max;

    public SpinEngineOption(String name, Integer defaultValue) {
        super(name, defaultValue);
    }

    public SpinEngineOption(String name, Integer defaultValue, Integer min, Integer max) {
        this(name, defaultValue);
        this.min = min;
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public Integer getMax() {
        return max;
    }
}
package dev.morphia.aggregation.experimental.stages;

/**
 * Randomly selects the specified number of documents from its input.
 *
 * @aggregation.expression $skip
 */
public class Skip extends Stage {
    private long size;

    protected Skip(final long size) {
        super("$skip");
        this.size = size;
    }

    /**
     * Creates a new stage with the given skip size
     *
     * @param size the skip size
     * @return the new stage
     */
    public static Skip of(final long size) {
        return new Skip(size);
    }

    /**
     * @return the size
     * @morphia.internal
     */
    public long getSize() {
        return size;
    }
}

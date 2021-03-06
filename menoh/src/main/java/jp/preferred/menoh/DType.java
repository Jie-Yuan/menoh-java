package jp.preferred.menoh;

/**
 * A data type.
 */
public enum DType {
    UNDEFINED(-1), // values[0]
    FLOAT(0);

    private final int id;

    // cache values() to avoid cloning the backing array every time
    private static final DType[] values = values();

    DType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    /**
     * The byte size of this {@link DType}.
     */
    public int size() throws MenohException {
        switch (this) {
            case FLOAT:
                return 4;
            default:
                throw new MenohException(
                        ErrorCode.UNDEFINED, String.format("the size of dtype is unknown: %d", id));
        }
    }

    /**
     * Returns the enum constant of the specified enum type with the specified ID.
     */
    public static DType valueOf(int value) throws MenohException {
        final int index = value + 1;
        if (1 <= index && index < values.length) {
            final DType ret = values[index];
            assert ret.id == value;

            return ret;
        } else {
            throw new MenohException(ErrorCode.UNDEFINED, "undefined dtype: " + value);
        }
    }
}

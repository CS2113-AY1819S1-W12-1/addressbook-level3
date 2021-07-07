package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's remark in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidRemark(String)}
 */
public class Remark {

    public static final String EXAMPLE = "Likes to drink coffee";
    public static final String MESSAGE_REMARK_CONSTRAINTS = "Remarks should be spaces or alphanumeric characters";
    public static final String REMARK_VALIDATION_REGEX = "[\\p{Alnum} ]+";

    public final String fullRemark;

    /**
     * Validates given name.
     *
     * @throws IllegalValueException if given remark string is invalid.
     */
    public Remark(String remark) throws IllegalValueException {
        remark = remark.trim();
        if (!isValidRemark(remark)) {
            throw new IllegalValueException(MESSAGE_REMARK_CONSTRAINTS);
        }
        this.fullRemark = remark;
    }

    /**
     * Returns true if a given string is a valid remark.
     */
    public static boolean isValidRemark(String test) { return test.matches(REMARK_VALIDATION_REGEX); }

    @Override
    public String toString() {
        return fullRemark;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Remark // instanceof handles nulls
                && this.fullRemark.equals(((Remark) other).fullRemark)); // state check
        }

        @Override
        public int hashCode() { return fullRemark.hashCode(); }
    }
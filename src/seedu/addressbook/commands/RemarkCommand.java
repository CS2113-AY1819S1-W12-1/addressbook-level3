package seedu.addressbook.commands;

import seedu.addressbook.data.exception.*;
import seedu.addressbook.data.person.*;
import seedu.addressbook.data.tag.Tag;

import java.util.HashSet;
import java.util.Set;

/**
 * Edits the remark of a person specified in the index.
 */
public class RemarkCommand extends Command {

    public static final String COMMAND_WORD = "remark";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ":\n" + "Edits the remark for a person specified in the index.";

    public static int index;

    public static String remark;
 //   public static Remark remark;

    public RemarkCommand(int index,
                      String remark) {
        this.index = index;
        this.remark = remark;
    }
    public CommandResult execute(){
        try {
            throw new Exception();
        }
        catch (Exception ex) {
            System.out.println(this.index + " " + this.remark);
        }
        return new CommandResult(String.format(COMMAND_WORD));
    }
}
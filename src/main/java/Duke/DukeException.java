package Duke;

public class DukeException extends Exception {
    private String msg;

//    public DukeException(String msg, Throwable cause) {
//        super(msg, cause);
//    }
//
    public DukeException(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        //super(cause);
        if (msg.equals("file not found")) {
            return "no databse found! pls try again ^__^";
        } else if (msg.equals("command not found")) {
            return "Meimei doesn't understand this command!";
        } else if (msg.equals("time")) {
            return "Date format error";
        }else {
            return "☹ OOPS!!! The description of a " + msg + " cannot be empty.";
        }
    }
}

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
        return "☹ OOPS!!! The description of a "+ msg + " cannot be empty.";
    }
}

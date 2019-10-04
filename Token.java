package bashShell;

public class Token {
    public byte kind;
    public String spelling;

    public final static byte FName = 0;
    public final static byte LIT = 1;
    public final static byte VAR = 2;
    public final static byte ASSIGN = 3;
    public final static byte IF = 4;
    public final static byte THEN = 5;
    public final static byte ELSE = 6;
    public final static byte FI = 7;
    public final static byte FOR = 8;
    public final static byte IN = 9;
    public final static byte DO = 10;
    public final static byte OD = 11;
    public final static byte EOL = 12;  // end of line
    public final static byte EOT = 13;  // end of the text
    public final static byte CMD = 14;
    public final static byte ARG = 15;

    private final static String[] spellings = {
            "<shell command>", "<literal>", "<variable>", "assign",
            "if", "then", "else", "fi", "for", "in", "do", "od", "<eol>",
            "<eot>", "<command>", "<argument>"
    };

    public static String kindString(byte kind) {
        return spellings[kind];
    }
}

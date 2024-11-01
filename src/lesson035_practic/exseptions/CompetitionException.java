package lesson035_practic.exseptions;

import lombok.Getter;

public class CompetitionException extends Exception{
    @Getter
    public String errorLine;

    public CompetitionException(Throwable cause, String errorLine) {
        super(cause);
        this.errorLine = errorLine;
    }
}

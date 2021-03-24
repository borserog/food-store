package br.edu.ifpb.padroes.service.log;

public class LogHandlerImpl {

    public LogHandlerImpl(LogHandlerType type) {
        this.type = type;
    }

    public enum LogHandlerType { DATABASE, FILE}

    private LogHandlerType type;

    public void log(String message) {
        if (type.equals(LogHandlerType.DATABASE)) {
        } else if (type.equals(LogHandlerType.FILE)) {
        }
    }

}

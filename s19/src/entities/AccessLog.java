package entities;

import java.util.Date;
import java.util.Objects;

public class AccessLog {
    private String user;
    private String time;

    public AccessLog() {
    }

    public AccessLog(String user, String time) {
        this.user = user;
        this.time = time;
    }

    public String getUser() {
        return user;
    }

    public String getTime() {
        return time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccessLog accessLog = (AccessLog) o;
        return Objects.equals(user, accessLog.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user);
    }

    @Override
    public String toString() {
        return "AccessLog{" +
                "user='" + user + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}

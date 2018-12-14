package app.entidad;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name = "access")
public class Access {

    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "created")
    private Timestamp created;
    @Column(name = "ip")
    private String ip;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "user_agent")
    private String userAgent;

    // standard getters and setters


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
}

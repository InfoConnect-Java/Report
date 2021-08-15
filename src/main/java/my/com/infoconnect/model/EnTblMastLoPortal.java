package my.com.infoconnect.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * $table.getTableComment()
 */
@Entity
@Table(name = "EN_TBL_MAST_LO_PORTAL")
public class EnTblMastLoPortal implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "LOID")
    private String LOID;

    @Column(name = "Name")
    private String name;

    @Column(name = "Link")
    private String link;

    public void setLOID(String LOID) {
        this.LOID = LOID;
    }

    public String getLOID() {
        return LOID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "EnTblMastLoPortal{" +
                "LOID=" + LOID + '\'' +
                "name=" + name + '\'' +
                "link=" + link + '\'' +
                '}';
    }
}

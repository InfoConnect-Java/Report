package my.com.infoconnect.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * $table.getTableComment()
 */
@Entity
@Table(name = "EN_TBL_MAST_PROJECTMANAGER")
public class EnTblMastProjectmanager implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "Staffid", nullable = false)
    private String staffid;

    @Column(name = "ProjectManagerName")
    private String projectManagerName;

    @Column(name = "Email")
    private String email;

    public void setStaffid(String staffid) {
        this.staffid = staffid;
    }

    public String getStaffid() {
        return staffid;
    }

    public void setProjectManagerName(String projectManagerName) {
        this.projectManagerName = projectManagerName;
    }

    public String getProjectManagerName() {
        return projectManagerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "EnTblMastProjectmanager{" +
                "staffid=" + staffid + '\'' +
                "projectManagerName=" + projectManagerName + '\'' +
                "email=" + email + '\'' +
                '}';
    }
}

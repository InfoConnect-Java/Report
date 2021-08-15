package my.com.infoconnect.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * $table.getTableComment()
 */
@Entity
@Table(name = "EN_TBL_MAST_APPROVERS")
public class EnTblMastApprovers implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "StaffID", nullable = false)
    private String staffID;

    @Column(name = "StaffName")
    private String staffName;

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffName() {
        return staffName;
    }

    @Override
    public String toString() {
        return "EnTblMastApprovers{" +
                "staffID=" + staffID + '\'' +
                "staffName=" + staffName + '\'' +
                '}';
    }
}

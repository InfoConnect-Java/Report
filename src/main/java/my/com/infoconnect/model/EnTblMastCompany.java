package my.com.infoconnect.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * $table.getTableComment()
 */
@Entity
@Table(name = "EN_TBL_MAST_COMPANY")
public class EnTblMastCompany implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CompanyID", nullable = false)
    private String companyID;

    @Column(name = "CompanyName")
    private String companyName;

    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String toString() {
        return "EnTblMastCompany{" +
                "companyID=" + companyID + '\'' +
                "companyName=" + companyName + '\'' +
                '}';
    }
}

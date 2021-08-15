package my.com.infoconnect.repository;

import my.com.infoconnect.model.EnTblMastCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EnTblMastCompanyRepository extends JpaRepository<EnTblMastCompany, String>, JpaSpecificationExecutor<EnTblMastCompany> {

}
package my.com.infoconnect.repository;

import my.com.infoconnect.model.EnTblMastStaffinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EnTblMastStaffinfoRepository extends JpaRepository<EnTblMastStaffinfo, String>, JpaSpecificationExecutor<EnTblMastStaffinfo> {

}
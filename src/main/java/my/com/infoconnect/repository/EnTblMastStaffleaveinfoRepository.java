package my.com.infoconnect.repository;

import my.com.infoconnect.model.EnTblMastStaffleaveinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EnTblMastStaffleaveinfoRepository extends JpaRepository<EnTblMastStaffleaveinfo, String>, JpaSpecificationExecutor<EnTblMastStaffleaveinfo> {

}
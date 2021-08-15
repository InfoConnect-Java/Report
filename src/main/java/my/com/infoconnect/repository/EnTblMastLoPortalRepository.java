package my.com.infoconnect.repository;

import my.com.infoconnect.model.EnTblMastLoPortal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EnTblMastLoPortalRepository extends JpaRepository<EnTblMastLoPortal, Void>, JpaSpecificationExecutor<EnTblMastLoPortal> {

}
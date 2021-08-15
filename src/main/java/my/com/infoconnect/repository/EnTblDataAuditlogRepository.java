package my.com.infoconnect.repository;

import my.com.infoconnect.model.EnTblDataAuditlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EnTblDataAuditlogRepository extends JpaRepository<EnTblDataAuditlog, Long>, JpaSpecificationExecutor<EnTblDataAuditlog> {

}
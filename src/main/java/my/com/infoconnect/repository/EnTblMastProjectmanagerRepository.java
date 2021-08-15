package my.com.infoconnect.repository;

import my.com.infoconnect.model.EnTblMastProjectmanager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EnTblMastProjectmanagerRepository extends JpaRepository<EnTblMastProjectmanager, Void>, JpaSpecificationExecutor<EnTblMastProjectmanager> {

}
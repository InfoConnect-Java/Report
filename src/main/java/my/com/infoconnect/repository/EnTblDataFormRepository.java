package my.com.infoconnect.repository;

import my.com.infoconnect.model.EnTblDataForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EnTblDataFormRepository extends JpaRepository<EnTblDataForm, Void>, JpaSpecificationExecutor<EnTblDataForm> {

}
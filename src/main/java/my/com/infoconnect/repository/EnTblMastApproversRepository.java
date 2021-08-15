package my.com.infoconnect.repository;

import my.com.infoconnect.model.EnTblMastApprovers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EnTblMastApproversRepository extends JpaRepository<EnTblMastApprovers, Void>, JpaSpecificationExecutor<EnTblMastApprovers> {

}
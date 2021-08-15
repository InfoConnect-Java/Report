package my.com.infoconnect.repository;

import my.com.infoconnect.model.EnTblMastJobgrading;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EnTblMastJobgradingRepository extends JpaRepository<EnTblMastJobgrading, String>, JpaSpecificationExecutor<EnTblMastJobgrading> {

}
package my.com.infoconnect.repository;

import my.com.infoconnect.model.EnTblMastEmailTracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EnTblMastEmailTrackerRepository extends JpaRepository<EnTblMastEmailTracker, Void>, JpaSpecificationExecutor<EnTblMastEmailTracker> {

}
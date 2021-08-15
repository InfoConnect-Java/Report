package my.com.infoconnect.repository;

import my.com.infoconnect.model.EnTblMastHoliday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EnTblMastHolidayRepository extends JpaRepository<EnTblMastHoliday, Long>, JpaSpecificationExecutor<EnTblMastHoliday> {

}
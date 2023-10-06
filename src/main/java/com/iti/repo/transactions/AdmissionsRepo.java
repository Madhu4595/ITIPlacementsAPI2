package com.iti.repo.transactions;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.iti.entity.transactions.Admissions;
import com.iti.ncvtupload.NcvtProjection;

public interface AdmissionsRepo extends JpaRepository<Admissions, String>{
	
	@Query(value="select * from admissions.iti_admissions where name ilike %:name%",nativeQuery = true)
	public List<Admissions> getByNameslikes(String name);
	
	public Admissions getByAdmNum(String admNum);
	
	@Query(value = "SELECT dist_name,iti.iti_name,iti.iti_code, count(*) FILTER (WHERE admissions.iti_admissions.rec_status='S') as \r\n" + 
			" Success, count(*) FILTER (WHERE admissions.iti_admissions.rec_status='E' or admissions.iti_admissions.rec_status is null) \r\n" + 
			" as Error,  count(*) FILTER (WHERE admissions.iti_admissions.rec_status is null) as Tobeupdated,  count(*) \r\n" + 
			" FILTER (WHERE admissions.iti_admissions.rec_status='E') as Updated,count(*) FILTER (where phno in(select phno from \r\n" + 
			" admissions.iti_admissions where year_of_admission='2022' and admissions.iti_admissions.iti_code=:itiCode group \r\n" + 
			" by admissions.iti_admissions.phno having count(phno)>1 order by phno) and year_of_admission= '2022') as \r\n" + 
			" phno_duplicate,count(*) FILTER (where adarno in(select adarno from admissions.iti_admissions where \r\n" + 
			" year_of_admission='2022' group by admissions.iti_admissions.adarno having count(adarno)>1 order by adarno) and \r\n" + 
			" year_of_admission='2022') as aadhar_duplicate,count(*) FILTER (where email_id in(select email_id from \r\n" + 
			" admissions.iti_admissions where year_of_admission='2022' group by admissions.iti_admissions.email_id having \r\n" + 
			" count(email_id)>1 order by email_id) and year_of_admission= '2022') as email_duplicate from admissions.iti_admissions \r\n" + 
			" left join iti on admissions.iti_admissions.iti_code=iti.iti_code left join dist_mst on \r\n" + 
			" admissions.iti_admissions.dist_code=dist_mst.dist_code  where admissions.iti_admissions.iti_code=:itiCode and \r\n" + 
			"  year_of_admission='2022'\r\n" + 
			" group by iti.iti_code,iti.iti_name,dist_mst.dist_name order by dist_mst.dist_name",nativeQuery = true)
	public NcvtProjection getDashboardreportIti(String itiCode);

}

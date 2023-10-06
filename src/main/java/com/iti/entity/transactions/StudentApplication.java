package com.iti.entity.transactions;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.iti.util.HstoreDataType;
@Entity
@Table(name = "student_application")
public class StudentApplication {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "application_Registration_id_seq")
	@SequenceGenerator(name="application_Registration_id_seq", sequenceName = "public.application_Registration_id_seq",
	initialValue = 2300000,  allocationSize = 1)
	private Integer regid;
	private String name;
	private String fname;
	private String addr;
	private String mname;
	private Long phno;
	private String adarno;
	private String gender;
	private String caste;
	private Boolean ssc_passed;
	private Boolean inter_passed;
	private Integer inter_marks;
	private String local;
	private Integer pincode;
	private String ts;
	private String ip;
	private String uid;
	private Boolean phc;
	private Boolean exservice;
	private Date dob;
	private Long trno;
	private String ssc_regno;
	private String ssc_board;
	private String ssc_year;
	private String ssc_month;
	
	@Column(columnDefinition = "hstore")
	@Convert(converter = HstoreDataType.class)
	private Map<String, String> phase = new HashMap<>();
	
	private String year;
	private String university_area;
	private String data_flag;
	private String app_status;
	private String user_id;
	private String reason;
	private String ssc_type;
	private String email;
	private String pwd_category;
	private Boolean economic_weaker_section;
	private Boolean is_trainee_dual_mode;
	private Timestamp entry_date;
	private Timestamp verified_date;
	private String verified_ip;
	private String ssc_eq_marks;
	private String tc;
	private String caste_certificate;
	private String ph_challenge;
	private String ex_service;
	private String study_certificate;
	private String nativity_certificate;
	private String uidv;
	private String ewsv;
	private String age_21;
	private String experience;
	private String est;
	public StudentApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentApplication(Integer regid, String name, String fname, String addr, String mname, Long phno,
			String adarno, String gender, String caste, Boolean ssc_passed, Boolean inter_passed, Integer inter_marks,
			String local, Integer pincode, String ts, String ip, String uid, Boolean phc, Boolean exservice, Date dob,
			Long trno, String ssc_regno, String ssc_board, String ssc_year, String ssc_month, Map<String, String> phase,
			String year, String university_area, String data_flag, String app_status, String user_id, String reason,
			String ssc_type, String email, String pwd_category, Boolean economic_weaker_section,
			Boolean is_trainee_dual_mode, Timestamp entry_date, Timestamp verified_date, String verified_ip,
			String ssc_eq_marks, String tc, String caste_certificate, String ph_challenge, String ex_service,
			String study_certificate, String nativity_certificate, String uidv, String ewsv, String age_21,
			String experience, String est) {
		super();
		this.regid = regid;
		this.name = name;
		this.fname = fname;
		this.addr = addr;
		this.mname = mname;
		this.phno = phno;
		this.adarno = adarno;
		this.gender = gender;
		this.caste = caste;
		this.ssc_passed = ssc_passed;
		this.inter_passed = inter_passed;
		this.inter_marks = inter_marks;
		this.local = local;
		this.pincode = pincode;
		this.ts = ts;
		this.ip = ip;
		this.uid = uid;
		this.phc = phc;
		this.exservice = exservice;
		this.dob = dob;
		this.trno = trno;
		this.ssc_regno = ssc_regno;
		this.ssc_board = ssc_board;
		this.ssc_year = ssc_year;
		this.ssc_month = ssc_month;
		this.phase = phase;
		this.year = year;
		this.university_area = university_area;
		this.data_flag = data_flag;
		this.app_status = app_status;
		this.user_id = user_id;
		this.reason = reason;
		this.ssc_type = ssc_type;
		this.email = email;
		this.pwd_category = pwd_category;
		this.economic_weaker_section = economic_weaker_section;
		this.is_trainee_dual_mode = is_trainee_dual_mode;
		this.entry_date = entry_date;
		this.verified_date = verified_date;
		this.verified_ip = verified_ip;
		this.ssc_eq_marks = ssc_eq_marks;
		this.tc = tc;
		this.caste_certificate = caste_certificate;
		this.ph_challenge = ph_challenge;
		this.ex_service = ex_service;
		this.study_certificate = study_certificate;
		this.nativity_certificate = nativity_certificate;
		this.uidv = uidv;
		this.ewsv = ewsv;
		this.age_21 = age_21;
		this.experience = experience;
		this.est = est;
	}
	public Integer getRegid() {
		return regid;
	}
	public void setRegid(Integer regid) {
		this.regid = regid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public String getAdarno() {
		return adarno;
	}
	public void setAdarno(String adarno) {
		this.adarno = adarno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public Boolean getSsc_passed() {
		return ssc_passed;
	}
	public void setSsc_passed(Boolean ssc_passed) {
		this.ssc_passed = ssc_passed;
	}
	public Boolean getInter_passed() {
		return inter_passed;
	}
	public void setInter_passed(Boolean inter_passed) {
		this.inter_passed = inter_passed;
	}
	public Integer getInter_marks() {
		return inter_marks;
	}
	public void setInter_marks(Integer inter_marks) {
		this.inter_marks = inter_marks;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getTs() {
		return ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public Boolean getPhc() {
		return phc;
	}
	public void setPhc(Boolean phc) {
		this.phc = phc;
	}
	public Boolean getExservice() {
		return exservice;
	}
	public void setExservice(Boolean exservice) {
		this.exservice = exservice;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Long getTrno() {
		return trno;
	}
	public void setTrno(Long trno) {
		this.trno = trno;
	}
	public String getSsc_regno() {
		return ssc_regno;
	}
	public void setSsc_regno(String ssc_regno) {
		this.ssc_regno = ssc_regno;
	}
	public String getSsc_board() {
		return ssc_board;
	}
	public void setSsc_board(String ssc_board) {
		this.ssc_board = ssc_board;
	}
	public String getSsc_year() {
		return ssc_year;
	}
	public void setSsc_year(String ssc_year) {
		this.ssc_year = ssc_year;
	}
	public String getSsc_month() {
		return ssc_month;
	}
	public void setSsc_month(String ssc_month) {
		this.ssc_month = ssc_month;
	}
	public Map<String, String> getPhase() {
		return phase;
	}
	public void setPhase(Map<String, String> phase) {
		this.phase = phase;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getUniversity_area() {
		return university_area;
	}
	public void setUniversity_area(String university_area) {
		this.university_area = university_area;
	}
	public String getData_flag() {
		return data_flag;
	}
	public void setData_flag(String data_flag) {
		this.data_flag = data_flag;
	}
	public String getApp_status() {
		return app_status;
	}
	public void setApp_status(String app_status) {
		this.app_status = app_status;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getSsc_type() {
		return ssc_type;
	}
	public void setSsc_type(String ssc_type) {
		this.ssc_type = ssc_type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd_category() {
		return pwd_category;
	}
	public void setPwd_category(String pwd_category) {
		this.pwd_category = pwd_category;
	}
	public Boolean getEconomic_weaker_section() {
		return economic_weaker_section;
	}
	public void setEconomic_weaker_section(Boolean economic_weaker_section) {
		this.economic_weaker_section = economic_weaker_section;
	}
	public Boolean getIs_trainee_dual_mode() {
		return is_trainee_dual_mode;
	}
	public void setIs_trainee_dual_mode(Boolean is_trainee_dual_mode) {
		this.is_trainee_dual_mode = is_trainee_dual_mode;
	}
	public Timestamp getEntry_date() {
		return entry_date;
	}
	public void setEntry_date(Timestamp entry_date) {
		this.entry_date = entry_date;
	}
	public Timestamp getVerified_date() {
		return verified_date;
	}
	public void setVerified_date(Timestamp verified_date) {
		this.verified_date = verified_date;
	}
	public String getVerified_ip() {
		return verified_ip;
	}
	public void setVerified_ip(String verified_ip) {
		this.verified_ip = verified_ip;
	}
	public String getSsc_eq_marks() {
		return ssc_eq_marks;
	}
	public void setSsc_eq_marks(String ssc_eq_marks) {
		this.ssc_eq_marks = ssc_eq_marks;
	}
	public String getTc() {
		return tc;
	}
	public void setTc(String tc) {
		this.tc = tc;
	}
	public String getCaste_certificate() {
		return caste_certificate;
	}
	public void setCaste_certificate(String caste_certificate) {
		this.caste_certificate = caste_certificate;
	}
	public String getPh_challenge() {
		return ph_challenge;
	}
	public void setPh_challenge(String ph_challenge) {
		this.ph_challenge = ph_challenge;
	}
	public String getEx_service() {
		return ex_service;
	}
	public void setEx_service(String ex_service) {
		this.ex_service = ex_service;
	}
	public String getStudy_certificate() {
		return study_certificate;
	}
	public void setStudy_certificate(String study_certificate) {
		this.study_certificate = study_certificate;
	}
	public String getNativity_certificate() {
		return nativity_certificate;
	}
	public void setNativity_certificate(String nativity_certificate) {
		this.nativity_certificate = nativity_certificate;
	}
	public String getUidv() {
		return uidv;
	}
	public void setUidv(String uidv) {
		this.uidv = uidv;
	}
	public String getEwsv() {
		return ewsv;
	}
	public void setEwsv(String ewsv) {
		this.ewsv = ewsv;
	}
	public String getAge_21() {
		return age_21;
	}
	public void setAge_21(String age_21) {
		this.age_21 = age_21;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getEst() {
		return est;
	}
	public void setEst(String est) {
		this.est = est;
	}
	@Override
	public String toString() {
		return "StudentApplication [regid=" + regid + ", name=" + name + ", fname=" + fname + ", addr=" + addr
				+ ", mname=" + mname + ", phno=" + phno + ", adarno=" + adarno + ", gender=" + gender + ", caste="
				+ caste + ", ssc_passed=" + ssc_passed + ", inter_passed=" + inter_passed + ", inter_marks="
				+ inter_marks + ", local=" + local + ", pincode=" + pincode + ", ts=" + ts + ", ip=" + ip + ", uid="
				+ uid + ", phc=" + phc + ", exservice=" + exservice + ", dob=" + dob + ", trno=" + trno + ", ssc_regno="
				+ ssc_regno + ", ssc_board=" + ssc_board + ", ssc_year=" + ssc_year + ", ssc_month=" + ssc_month
				+ ", phase=" + phase + ", year=" + year + ", university_area=" + university_area + ", data_flag="
				+ data_flag + ", app_status=" + app_status + ", user_id=" + user_id + ", reason=" + reason
				+ ", ssc_type=" + ssc_type + ", email=" + email + ", pwd_category=" + pwd_category
				+ ", economic_weaker_section=" + economic_weaker_section + ", is_trainee_dual_mode="
				+ is_trainee_dual_mode + ", entry_date=" + entry_date + ", verified_date=" + verified_date
				+ ", verified_ip=" + verified_ip + ", ssc_eq_marks=" + ssc_eq_marks + ", tc=" + tc
				+ ", caste_certificate=" + caste_certificate + ", ph_challenge=" + ph_challenge + ", ex_service="
				+ ex_service + ", study_certificate=" + study_certificate + ", nativity_certificate="
				+ nativity_certificate + ", uidv=" + uidv + ", ewsv=" + ewsv + ", age_21=" + age_21 + ", experience="
				+ experience + ", est=" + est + "]";
	}
	
}

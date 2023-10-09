package com.iti.entity.transactions;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "student_cand_marks")
public class StudentCandMarks {
	
	@Id
	private String regid; 
	
    private Integer ssc_first_lang_marks;
    private String  ssc_first_lang_gpa; 
    private String ssc_first_lang_grade;
    
    private Integer ssc_second_lang_marks; 
    private String ssc_second_lang_gpa; 
    private String ssc_second_lang_grade; 
    
    private Integer ssc_eng_marks; 
    private String ssc_eng_gpa; 
    private String ssc_eng_grade; 
    
    private Integer ssc_math_marks;
    private String ssc_math_gpa; 
    private String ssc_math_grade;
    
    private Integer ssc_sci_marks; 
    private String ssc_sci_gpa; 
    private String ssc_sci_grade;
    
    private Integer ssc_social_marks; 
    private String ssc_social_gpa; 
    private String ssc_social_grade;
    
    private String inter_first_sub; 
    private Integer inter_first_marks;
    private String inter_second_sub;
    
    private Integer inter_second_marks; 
    private String inter_third_sub; 
    private Integer inter_third_marks; 
    
    private Integer ssc_tot_marks;
    private String ssc_tot_gpa;
    
    private Integer temp; 
    private String group; 
    private Integer trno; 
    private String groupname; 
    private String year; 
    private Timestamp entry_date;
	public StudentCandMarks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentCandMarks(String regid, Integer ssc_first_lang_marks, String ssc_first_lang_gpa,
			String ssc_first_lang_grade, Integer ssc_second_lang_marks, String ssc_second_lang_gpa,
			String ssc_second_lang_grade, Integer ssc_eng_marks, String ssc_eng_gpa, String ssc_eng_grade,
			Integer ssc_math_marks, String ssc_math_gpa, String ssc_math_grade, Integer ssc_sci_marks,
			String ssc_sci_gpa, String ssc_sci_grade, Integer ssc_social_marks, String ssc_social_gpa,
			String ssc_social_grade, String inter_first_sub, Integer inter_first_marks, String inter_second_sub,
			Integer inter_second_marks, String inter_third_sub, Integer inter_third_marks, Integer ssc_tot_marks,
			String ssc_tot_gpa, Integer temp, String group, Integer trno, String groupname, String year,
			Timestamp entry_date) {
		super();
		this.regid = regid;
		this.ssc_first_lang_marks = ssc_first_lang_marks;
		this.ssc_first_lang_gpa = ssc_first_lang_gpa;
		this.ssc_first_lang_grade = ssc_first_lang_grade;
		this.ssc_second_lang_marks = ssc_second_lang_marks;
		this.ssc_second_lang_gpa = ssc_second_lang_gpa;
		this.ssc_second_lang_grade = ssc_second_lang_grade;
		this.ssc_eng_marks = ssc_eng_marks;
		this.ssc_eng_gpa = ssc_eng_gpa;
		this.ssc_eng_grade = ssc_eng_grade;
		this.ssc_math_marks = ssc_math_marks;
		this.ssc_math_gpa = ssc_math_gpa;
		this.ssc_math_grade = ssc_math_grade;
		this.ssc_sci_marks = ssc_sci_marks;
		this.ssc_sci_gpa = ssc_sci_gpa;
		this.ssc_sci_grade = ssc_sci_grade;
		this.ssc_social_marks = ssc_social_marks;
		this.ssc_social_gpa = ssc_social_gpa;
		this.ssc_social_grade = ssc_social_grade;
		this.inter_first_sub = inter_first_sub;
		this.inter_first_marks = inter_first_marks;
		this.inter_second_sub = inter_second_sub;
		this.inter_second_marks = inter_second_marks;
		this.inter_third_sub = inter_third_sub;
		this.inter_third_marks = inter_third_marks;
		this.ssc_tot_marks = ssc_tot_marks;
		this.ssc_tot_gpa = ssc_tot_gpa;
		this.temp = temp;
		this.group = group;
		this.trno = trno;
		this.groupname = groupname;
		this.year = year;
		this.entry_date = entry_date;
	}
	public String getRegid() {
		return regid;
	}
	public void setRegid(String regid) {
		this.regid = regid;
	}
	public Integer getSsc_first_lang_marks() {
		return ssc_first_lang_marks;
	}
	public void setSsc_first_lang_marks(Integer ssc_first_lang_marks) {
		this.ssc_first_lang_marks = ssc_first_lang_marks;
	}
	public String getSsc_first_lang_gpa() {
		return ssc_first_lang_gpa;
	}
	public void setSsc_first_lang_gpa(String ssc_first_lang_gpa) {
		this.ssc_first_lang_gpa = ssc_first_lang_gpa;
	}
	public String getSsc_first_lang_grade() {
		return ssc_first_lang_grade;
	}
	public void setSsc_first_lang_grade(String ssc_first_lang_grade) {
		this.ssc_first_lang_grade = ssc_first_lang_grade;
	}
	public Integer getSsc_second_lang_marks() {
		return ssc_second_lang_marks;
	}
	public void setSsc_second_lang_marks(Integer ssc_second_lang_marks) {
		this.ssc_second_lang_marks = ssc_second_lang_marks;
	}
	public String getSsc_second_lang_gpa() {
		return ssc_second_lang_gpa;
	}
	public void setSsc_second_lang_gpa(String ssc_second_lang_gpa) {
		this.ssc_second_lang_gpa = ssc_second_lang_gpa;
	}
	public String getSsc_second_lang_grade() {
		return ssc_second_lang_grade;
	}
	public void setSsc_second_lang_grade(String ssc_second_lang_grade) {
		this.ssc_second_lang_grade = ssc_second_lang_grade;
	}
	public Integer getSsc_eng_marks() {
		return ssc_eng_marks;
	}
	public void setSsc_eng_marks(Integer ssc_eng_marks) {
		this.ssc_eng_marks = ssc_eng_marks;
	}
	public String getSsc_eng_gpa() {
		return ssc_eng_gpa;
	}
	public void setSsc_eng_gpa(String ssc_eng_gpa) {
		this.ssc_eng_gpa = ssc_eng_gpa;
	}
	public String getSsc_eng_grade() {
		return ssc_eng_grade;
	}
	public void setSsc_eng_grade(String ssc_eng_grade) {
		this.ssc_eng_grade = ssc_eng_grade;
	}
	public Integer getSsc_math_marks() {
		return ssc_math_marks;
	}
	public void setSsc_math_marks(Integer ssc_math_marks) {
		this.ssc_math_marks = ssc_math_marks;
	}
	public String getSsc_math_gpa() {
		return ssc_math_gpa;
	}
	public void setSsc_math_gpa(String ssc_math_gpa) {
		this.ssc_math_gpa = ssc_math_gpa;
	}
	public String getSsc_math_grade() {
		return ssc_math_grade;
	}
	public void setSsc_math_grade(String ssc_math_grade) {
		this.ssc_math_grade = ssc_math_grade;
	}
	public Integer getSsc_sci_marks() {
		return ssc_sci_marks;
	}
	public void setSsc_sci_marks(Integer ssc_sci_marks) {
		this.ssc_sci_marks = ssc_sci_marks;
	}
	public String getSsc_sci_gpa() {
		return ssc_sci_gpa;
	}
	public void setSsc_sci_gpa(String ssc_sci_gpa) {
		this.ssc_sci_gpa = ssc_sci_gpa;
	}
	public String getSsc_sci_grade() {
		return ssc_sci_grade;
	}
	public void setSsc_sci_grade(String ssc_sci_grade) {
		this.ssc_sci_grade = ssc_sci_grade;
	}
	public Integer getSsc_social_marks() {
		return ssc_social_marks;
	}
	public void setSsc_social_marks(Integer ssc_social_marks) {
		this.ssc_social_marks = ssc_social_marks;
	}
	public String getSsc_social_gpa() {
		return ssc_social_gpa;
	}
	public void setSsc_social_gpa(String ssc_social_gpa) {
		this.ssc_social_gpa = ssc_social_gpa;
	}
	public String getSsc_social_grade() {
		return ssc_social_grade;
	}
	public void setSsc_social_grade(String ssc_social_grade) {
		this.ssc_social_grade = ssc_social_grade;
	}
	public String getInter_first_sub() {
		return inter_first_sub;
	}
	public void setInter_first_sub(String inter_first_sub) {
		this.inter_first_sub = inter_first_sub;
	}
	public Integer getInter_first_marks() {
		return inter_first_marks;
	}
	public void setInter_first_marks(Integer inter_first_marks) {
		this.inter_first_marks = inter_first_marks;
	}
	public String getInter_second_sub() {
		return inter_second_sub;
	}
	public void setInter_second_sub(String inter_second_sub) {
		this.inter_second_sub = inter_second_sub;
	}
	public Integer getInter_second_marks() {
		return inter_second_marks;
	}
	public void setInter_second_marks(Integer inter_second_marks) {
		this.inter_second_marks = inter_second_marks;
	}
	public String getInter_third_sub() {
		return inter_third_sub;
	}
	public void setInter_third_sub(String inter_third_sub) {
		this.inter_third_sub = inter_third_sub;
	}
	public Integer getInter_third_marks() {
		return inter_third_marks;
	}
	public void setInter_third_marks(Integer inter_third_marks) {
		this.inter_third_marks = inter_third_marks;
	}
	public Integer getSsc_tot_marks() {
		return ssc_tot_marks;
	}
	public void setSsc_tot_marks(Integer ssc_tot_marks) {
		this.ssc_tot_marks = ssc_tot_marks;
	}
	public String getSsc_tot_gpa() {
		return ssc_tot_gpa;
	}
	public void setSsc_tot_gpa(String ssc_tot_gpa) {
		this.ssc_tot_gpa = ssc_tot_gpa;
	}
	public Integer getTemp() {
		return temp;
	}
	public void setTemp(Integer temp) {
		this.temp = temp;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public Integer getTrno() {
		return trno;
	}
	public void setTrno(Integer trno) {
		this.trno = trno;
	}
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Timestamp getEntry_date() {
		return entry_date;
	}
	public void setEntry_date(Timestamp entry_date) {
		this.entry_date = entry_date;
	}
	@Override
	public String toString() {
		return "StudentCandMarks [regid=" + regid + ", ssc_first_lang_marks=" + ssc_first_lang_marks
				+ ", ssc_first_lang_gpa=" + ssc_first_lang_gpa + ", ssc_first_lang_grade=" + ssc_first_lang_grade
				+ ", ssc_second_lang_marks=" + ssc_second_lang_marks + ", ssc_second_lang_gpa=" + ssc_second_lang_gpa
				+ ", ssc_second_lang_grade=" + ssc_second_lang_grade + ", ssc_eng_marks=" + ssc_eng_marks
				+ ", ssc_eng_gpa=" + ssc_eng_gpa + ", ssc_eng_grade=" + ssc_eng_grade + ", ssc_math_marks="
				+ ssc_math_marks + ", ssc_math_gpa=" + ssc_math_gpa + ", ssc_math_grade=" + ssc_math_grade
				+ ", ssc_sci_marks=" + ssc_sci_marks + ", ssc_sci_gpa=" + ssc_sci_gpa + ", ssc_sci_grade="
				+ ssc_sci_grade + ", ssc_social_marks=" + ssc_social_marks + ", ssc_social_gpa=" + ssc_social_gpa
				+ ", ssc_social_grade=" + ssc_social_grade + ", inter_first_sub=" + inter_first_sub
				+ ", inter_first_marks=" + inter_first_marks + ", inter_second_sub=" + inter_second_sub
				+ ", inter_second_marks=" + inter_second_marks + ", inter_third_sub=" + inter_third_sub
				+ ", inter_third_marks=" + inter_third_marks + ", ssc_tot_marks=" + ssc_tot_marks + ", ssc_tot_gpa="
				+ ssc_tot_gpa + ", temp=" + temp + ", group=" + group + ", trno=" + trno + ", groupname=" + groupname
				+ ", year=" + year + ", entry_date=" + entry_date + "]";
	} 
    
    

}

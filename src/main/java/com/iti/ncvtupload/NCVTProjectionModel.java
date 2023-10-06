package com.iti.ncvtupload;

public class NCVTProjectionModel {
	
	private String distName;
	private String itiName;
	private String itiCode;
	private Long success;
	private Long error;
	private Long tobeupdated;
	private Long updated;
	private Long phnoDuplicate;
	private Long aadharDuplicate;
	private Long emailDuplicate;
	
	public NCVTProjectionModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NCVTProjectionModel(String distName, String itiName, String itiCode, Long success, Long error,
			Long tobeupdated, Long updated, Long phnoDuplicate, Long aadharDuplicate, Long emailDuplicate) {
		super();
		this.distName = distName;
		this.itiName = itiName;
		this.itiCode = itiCode;
		this.success = success;
		this.error = error;
		this.tobeupdated = tobeupdated;
		this.updated = updated;
		this.phnoDuplicate = phnoDuplicate;
		this.aadharDuplicate = aadharDuplicate;
		this.emailDuplicate = emailDuplicate;
	}
	public String getDistName() {
		return distName;
	}
	public void setDistName(String distName) {
		this.distName = distName;
	}
	public String getItiName() {
		return itiName;
	}
	public void setItiName(String itiName) {
		this.itiName = itiName;
	}
	public String getItiCode() {
		return itiCode;
	}
	public void setItiCode(String itiCode) {
		this.itiCode = itiCode;
	}
	public Long getSuccess() {
		return success;
	}
	public void setSuccess(Long success) {
		this.success = success;
	}
	public Long getError() {
		return error;
	}
	public void setError(Long error) {
		this.error = error;
	}
	public Long getTobeupdated() {
		return tobeupdated;
	}
	public void setTobeupdated(Long tobeupdated) {
		this.tobeupdated = tobeupdated;
	}
	public Long getUpdated() {
		return updated;
	}
	public void setUpdated(Long updated) {
		this.updated = updated;
	}
	public Long getPhnoDuplicate() {
		return phnoDuplicate;
	}
	public void setPhnoDuplicate(Long phnoDuplicate) {
		this.phnoDuplicate = phnoDuplicate;
	}
	public Long getAadharDuplicate() {
		return aadharDuplicate;
	}
	public void setAadharDuplicate(Long aadharDuplicate) {
		this.aadharDuplicate = aadharDuplicate;
	}
	public Long getEmailDuplicate() {
		return emailDuplicate;
	}
	public void setEmailDuplicate(Long emailDuplicate) {
		this.emailDuplicate = emailDuplicate;
	}
	@Override
	public String toString() {
		return "NCVTProjectionModel [distName=" + distName + ", itiName=" + itiName + ", itiCode=" + itiCode
				+ ", success=" + success + ", error=" + error + ", tobeupdated=" + tobeupdated + ", updated=" + updated
				+ ", phnoDuplicate=" + phnoDuplicate + ", aadharDuplicate=" + aadharDuplicate + ", emailDuplicate="
				+ emailDuplicate + "]";
	}
	
}

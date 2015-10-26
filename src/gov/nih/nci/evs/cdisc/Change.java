package gov.nih.nci.evs.cdisc;

public class Change {
	private String releaseDate;
	private String requestCode;
	private String changeType;
	private String code;
	private String termType;
	private String codelistShortName;
	private String codelistLongName;
	private String changeSummary;
	private String originalValue;
	private String newValue;
	private int noCCode;

	public Change(String relDate, String reqCode, String chType, String c, String tType, String clsn, String clln, String cs, String ov, String nv) {
		this.releaseDate = relDate;
		this.requestCode = reqCode;
		this.changeType = chType;
		this.code = c;
		this.noCCode = Integer.parseInt(code.replace("C", ""));
		this.termType = tType;
		this.codelistShortName = clsn;
		this.codelistLongName = clln;
		this.changeSummary = cs;
		this.originalValue = ov;
		this.newValue = nv;
	}
	
	public String getReleaseDate() {
		return this.releaseDate;
	}
	
	public String getRequestCode() {
		return this.requestCode;
	}
	
	public String getChangeType() {
		return this.changeType;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public String getTermType() {
		return this.termType;
	}
	
	public String getShortName() {
		return this.codelistShortName;
	}
	
	public String getLongName() {
		return this.codelistLongName;
	}
	
	public String getChangeSummary() {
		return this.changeSummary;
	}
	
	public String getOriginalValue() {
		return this.originalValue;
	}
	
	public String getNewValue() {
		return this.newValue;
	}
	
	public int getNoCCode() {
		return this.noCCode;
	}
	
	public String toString() {
		return this.releaseDate + "\t" + this.requestCode + "\t" + this.changeType + "\t" + 
				this.code + "\t" + this.termType + "\t" + this.codelistShortName + "\t" + this.codelistLongName + "\t" + 
				this.changeSummary + "\t" + this.originalValue + "\t" + this.newValue + "\n";
	}
	
}

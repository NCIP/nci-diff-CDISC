package gov.nih.nci.evs.cdisc;

public class Codelist {
	private String code;
	private String extensible;
	private String name;
	private String subValue;
	private String[] synonyms;
	private String definition;
	private String pt;
	
	public Codelist (String c, String ext, String n, String sub, String syns, String def, String ncipt) {
		this.code = c;
		this.extensible = ext;
		this.name = n;
		this.subValue = sub;
		this.synonyms = syns.split(";");
		for(int i=0; i < synonyms.length; i++) {
			synonyms[i] = synonyms[i].trim();
		}
		this.definition = def;
		this.pt = ncipt;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getExtensible() {
		return extensible;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSubValue() {
		return subValue;
	}
	
	public String[] getSynonyms() {
		return synonyms;
	}
	
	public String getDefinition() {
		return definition;
	}
	
	public String getPT() {
		return pt;
	}

}

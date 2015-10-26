package gov.nih.nci.evs.cdisc;

public class Element {
	private String code;
	private String codelistCode;
	private String name;
	private String subValue;
	private String[] synonyms;
	private String definition;
	private String pt;
	
	public Element(String c, String cc, String n, String sub, String syns, String def, String ncipt) {
		this.code = c;
		this.codelistCode = cc;
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
		return this.code;
	}
	
	public String getCodelistCode() {
		return this.codelistCode;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSubValue() {
		return this.subValue;
	}
	
	public String[] getSynonyms() {
		return this.synonyms;
	}
	
	public String getDefinition() {
		return this.definition;
	}
	
	public String getPT() {
		return this.pt;
	}
}

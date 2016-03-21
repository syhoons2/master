
public class User {
	
	private String _name;
	private int _numberOfLines;
	private LinkedLine _linkedLine;
	
	
	public User(){}
	
	public User(String name, String number, String plan){
		this._name = name;
		this._linkedLine = new LinkedLine();
	}

	public String getName() {
		return _name;
	}

	public void setName(String _name) {
		this._name = _name;
	}

	public int getNumberOfLines(){
		return this._numberOfLines;
	}
	
	public void setNumberOfLines(int numberOfLines){
		this._numberOfLines = numberOfLines;
	}
	
	public LinkedLine getLinkedLine(){
		return this._linkedLine;
	}
	
	
	
	
}

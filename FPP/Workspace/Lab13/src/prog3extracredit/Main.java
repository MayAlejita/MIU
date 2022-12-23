package prog3extracredit;

import java.util.HashMap;
import java.util.Objects;

public class Main {
	
	HashMap<Key, Record> map = new HashMap<>();
	Key defaultKey = new Key("secret");
	
	public Main() {
		map.put(defaultKey, new Record("001", "data"));
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		Key k = new Key("secret");
		System.out.println(k.equals(m.defaultKey));
		
		Record recFound = m.map.get(k);
		System.out.println(recFound);
	}

}

class Key{
	private String key;

	public Key(String key) {
		this.key = key;
	}

	@Override
	public int hashCode() {
		return Objects.hash(key);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		return Objects.equals(key, other.key);
	}	
	
	
}

class Record{
	private String recordId;
	private String data;
	
	public Record(String recordId, String data) {
		this.recordId = recordId;
		this.data = data;
	}

	public String getRecordId() {
		return recordId;
	}

	public String getData() {
		return data;
	}

	@Override
	public String toString() {
		return recordId + ":" + data;
	}
	
	
}
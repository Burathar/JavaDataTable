package DataTable;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Row {
	private List<Column> columns = new LinkedList<>();
	private List<Object> cells = new LinkedList<>();
	//private List<Cell> cells = new LinkedList<>();
	
	public List<Column> getColumns() {
		return Collections.unmodifiableList(columns);
	}
	
	public List<Object> getCells() {
		return Collections.unmodifiableList(cells);
	}
	
	Row(Object... items){
		for (int i = 0; i < items.length; i++) {
			if(columns.get(i).checkThingy(items[i])){
				columns.get(i).addRow(this, items[i]);
			}
			
		}
	}
}

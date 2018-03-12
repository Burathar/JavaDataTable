package dataTable;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Row {
	private List<Column> columns;
	private List<Object> cells = new LinkedList<>();
	/* private List<Cell> cells = new LinkedList<>(); */
	
	public List<Column> getColumns() {
		return Collections.unmodifiableList(columns);
	}
	
	public List<Object> getCells() {
		return Collections.unmodifiableList(cells);
	}
	
	Row(List<Column> columns, Object... items){
		this.columns = columns;
		for (int i = 0; i < items.length; i++) {
			columns.get(i).addRow(items[i]);
			cells.add(items[i]);
		}
	}
	
	public void addColumn(Object item) {
		cells.add(item);
	}
}

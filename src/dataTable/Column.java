package dataTable;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Column{
    private String name;
    private List<Row> rows;
    private List<Object> cells = new LinkedList<>();
    //private List<Cell<T>> cells = new LinkedList<>();
	
    public String getName() {
        return name;
    }
	
	public List<Row> getRows() {
		return Collections.unmodifiableList(rows);
	}
	
	public List<Object> getCells() {
		return Collections.unmodifiableList(cells);
	}

	Column(List<Row> rows, String name, Object... items){
    	this.rows = rows;
		this.name = name;
		for (int i = 0; i < items.length; i++) {
			rows.get(i).addColumn(this, items[i]);
			cells.add(items[i]);
		}
	}
	
	public void addRow(Row row, Object item) {
		cells.add(item);
	}
}

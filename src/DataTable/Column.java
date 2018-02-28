package DataTable;

import java.util.*;

public class Column<T> {
    private String name;
    private List<Row> rows = new LinkedList<>();
    private List<T> cells = new LinkedList<>();
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
	
	public Column(String name){
        this.name = name;
    }
	
	public void addRow(Row row, T item) {
    	rows.add(row);
		cells.add(item);
	}
	
	public boolean checkThingy(T item){
    	if(item == null){
    		return false;
	    }
	    return true;
	}
}

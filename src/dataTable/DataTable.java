package dataTable;

import java.util.*;

public class DataTable {
	private LinkedList<Column> columns;
	private LinkedList<Row> rows = new LinkedList<>();
	
	public List<Column> getColumns() {
		return Collections.unmodifiableList(columns);
	}
	
	public List<Row> getRows() {
		return Collections.unmodifiableList(rows);
	}
	
	public DataTable(Column... columns){
    	this.columns = new LinkedList<>(Arrays.asList(columns));
    }
    
    public void addColumn(String name, Object... items){
		if(items.length != rows.size())
			throw new IllegalArgumentException("The amount of arguments are not equal to the amount of rows.");
		columns.add(new Column(rows, name, items));
    }
    
    public void addRow(Object... items){
        if(items.length != columns.size())
            throw new IllegalArgumentException("The amount of arguments are not equal to the amount of columns.");
        rows.add( new Row(columns, items));
    }
}
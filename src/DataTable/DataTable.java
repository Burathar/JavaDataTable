package DataTable;

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
    	this.columns = new LinkedList<Column>(Arrays.asList(columns));
    }
    
    public void addColumn(Column<?> column){
		columns.add(column);
    }
    
    public void addRow(Object... items){
        if(items.length != columns.size())
            throw new IllegalArgumentException("The amount of arguments are not equal to the amount of columns.");
        Row row = new Row(items);
        rows.add(row);
    }
}
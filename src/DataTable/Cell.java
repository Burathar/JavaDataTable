package dataTable;

public class Cell<T> {
	private Row row;
	private Column column;
	private T value;
	
	public Row getRow() {
		return row;
	}
	
	public Column getColumn() {
		return column;
	}
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	Cell(Row row, Column column, T value) {
		this.row = row;
		this.column = column;
		this.value = value;
	}
	
	Cell(Row row, Column column) {
		this.row = row;
		this.column = column;
	}
}

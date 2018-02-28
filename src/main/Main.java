package main;

import DataTable.Column;
import DataTable.DataTable;

public class Main {

    public static void main(String[] args) {
        System.out.println("This application shows the minimum and maximum values of different C# datatypes");
        System.out.println();
        System.out.println("Integer Types:");
        DataTable table = createIntDataTable();
    }
    
    private static DataTable createIntDataTable(){
    	DataTable table = new DataTable();
    	table.addColumn(new Column<String>("Data Type"));
    	table.addColumn(new Column<String>("Primitive Type"));
    	table.addColumn(new Column<>("Min Value"));
    	table.addColumn(new Column<>("Max Value"));
    	table.addRow("byte", "Byte", Byte.MAX_VALUE, Byte.MIN_VALUE);
    	table.addRow("short", "Short", Short.MAX_VALUE, Short.MIN_VALUE);
    	table.addRow("int", "Integer", Integer.MAX_VALUE, Integer.MIN_VALUE);
    	return table;
    	
    }
}
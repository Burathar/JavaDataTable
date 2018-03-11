package main;

import consoleTable.ConsoleTable;
import dataTable.DataTable;

import java.io.Console;

public class Main {

    public static void main(String[] args) {
        System.out.println("This application shows the minimum and maximum values of different C# datatypes");
        System.out.println();
        System.out.println("Integer Types:");
        DataTable table = createIntDataTable();
	    ConsoleTable.drawTable(table, 80);

    }
    
    private static DataTable createIntDataTable(){
    	DataTable table = new DataTable();
    	table.addColumn("Data Type");
    	table.addColumn("Primitive Type");
    	table.addColumn("Min Value");
    	table.addColumn("Max Value");
    	table.addRow("Byte", "byte", Byte.MIN_VALUE, Byte.MAX_VALUE);
    	table.addRow("Short", "short", Short.MIN_VALUE, Short.MAX_VALUE);
    	table.addRow("Integer", "int", Integer.MIN_VALUE, Integer.MAX_VALUE);
    	return table;
    	
    }
}
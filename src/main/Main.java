package main;

import consoleTable.ConsoleTable;
import dataTable.DataTable;

public class Main {

    public static void main(String[] args) {
        System.out.println("This application shows the minimum and maximum values of different C# datatypes");
        System.out.println();
        System.out.println("Integer Types:");
        DataTable table = createIntDataTable();
	    ConsoleTable.drawTable(table, 84);
	
	    System.out.println();
	    System.out.println("Floating Point Types:");
	    table = createFloatDataTable();
	    ConsoleTable.drawTable(table, 96);
	    System.out.printf("A float uses %s bits", Float.SIZE);
	    System.out.println();
	    System.out.printf("A double uses %s bits", Double.SIZE);
    }
    
    private static DataTable createIntDataTable(){
    	DataTable table = new DataTable();
    	table.addColumn("Data Type");
    	table.addColumn("Primitive Type");
    	table.addColumn("Min Value");
    	table.addColumn("Max Value");
    	table.addRow("Byte", "byte", Byte.MIN_VALUE, Byte.MAX_VALUE);
	    table.addRow("Character", "char", (int)Character.MIN_VALUE, (int)Character.MAX_VALUE);
    	table.addRow("Short", "short", Short.MIN_VALUE, Short.MAX_VALUE);
    	table.addRow("Integer", "int", Integer.MIN_VALUE, Integer.MAX_VALUE);
    	table.addRow("Long", "long", Long.MIN_VALUE, Long.MAX_VALUE);
    	return table;
    }
    
    private static DataTable createFloatDataTable(){
    	DataTable table = new DataTable();
    	table.addColumn("Data Type");
    	table.addColumn("Min Value");
    	table.addColumn("Max Value");
    	table.addColumn("Epsilon");
    	table.addRow("Float", Float.MIN_VALUE, Float.MAX_VALUE, Float.MIN_NORMAL);
    	table.addRow("Double", Double.MIN_VALUE, Double.MAX_VALUE, Double.MIN_NORMAL);
    	return table;
    }
}
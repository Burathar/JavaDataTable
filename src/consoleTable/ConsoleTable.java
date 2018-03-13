package consoleTable;

import dataTable.DataTable;
import dataTable.Row;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ConsoleTable {
	private static char[][] lines = new char[][]{
			{'╔', '╦', '╗'},
			{'╠', '╬', '╣'},
			{'╚', '╩', '╝'}, };
	
	public static void drawTable(DataTable table, int tableWidth) {
		printLine(tableWidth, table.getColumns().size(), LineType.Top);
		printRow(getHeaders(table), tableWidth);
		printLine(tableWidth, table.getColumns().size(), LineType.Center);
		
		for (Row row : table.getRows()) {
			List<String> columns = row.getCells().stream().map(Object::toString).collect(Collectors.toList());
			printRow(columns, tableWidth);
		}
		printLine(tableWidth, table.getColumns().size(), LineType.Bottom);
	}
	
	public static void drawTable(DataTable table) {
		drawTable(table, 60);
	}
	
	private static void printLine(int width, int amount, LineType type) {
		for (int i = 0; i < amount; i++) {
			printJunktion(type, i, amount);
			int n = (i == 0) ? 9 : width / amount - 1;
			System.out.print(String.join("", Collections.nCopies(n, "═")));
		}
		printJunktion(type, 1, 1);
		System.out.println();
	}
	
	private static void printJunktion(LineType type, int value, int maxValue){
		int x = 1,y;
		switch (type) {
			case Top:
				x = 0;
				break;
			case Center:
				x = 1;
				break;
			case Bottom:
				x = 2;
				break;
		}
		if(value == 0) y = 0;
		else if(value == maxValue) y = 2;
		else y = 1;
		System.out.print(lines[x][y]);
	}
	
	private static List<String> getHeaders(DataTable table) {
		ArrayList<String> columnHeaders = new ArrayList<>(table.getColumns().size());
		for (int i = 0; i < table.getColumns().size(); i++) {
			columnHeaders.add(table.getColumns().get(i).getName());
		}
		return columnHeaders;
	}
	
	private static void printRow(List<String> columnHeaders, int tableWidth) {
		int width = (tableWidth - columnHeaders.size()) / columnHeaders.size();
		StringBuilder row = new StringBuilder("║");
		
		for (int i = 0; i < columnHeaders.size(); i++) {
			int rowWidth = (i == 0) ? 9 : width;
			row.append(alignCenter(columnHeaders.get(i), rowWidth)).append('║');
		}
		
		System.out.println(row.toString());
	}
	
	private static String alignCenter(String text, int width) {
		if (text.length() > width) text = text.substring(0, width - 3) + "...";
		
		if (text.isEmpty())
			return String.join("", Collections.nCopies(width, " "));
		else
			return padLeft(padRight(text, width - (width - text.length()) / 2), width);
		
	}
	private static String padRight(String s, int n) {
		return String.format("%1$-" + n + "s", s);
	}
	
	private static String padLeft(String s, int n) {
		return String.format("%1$" + n + "s", s);
	}
}

package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;

public class ListProducts {

	public static void main(String[] args) throws IOException {
		var path = Path.of("c:\\classroom\\java\\products.txt");
		var lines = Files.readAllLines(path);

		var products = new TreeMap<String, Integer>();

		for (var line : lines) {
			var parts = line.split(",");
			// first part is name and second part is price
			products.put(parts[0], Integer.parseInt(parts[1]));
		}

		for (var name : products.keySet())
			System.out.printf("%-20s  %5d\n", name, products.get(name));

	}

}

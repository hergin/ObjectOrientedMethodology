package slide45;

class Report {

	public String report;

	public void loadFromFile(String fileName) {
		report = new String("From file: " + fileName);
	}

	public void saveToFile(String fileName) {
		System.out.println("Report saved to " + fileName);
	}

}

class Printer {

	public static void print(Report report) {
		System.out.println("Report printed and content is: " + report.report);
	}

}

public class CouplingV1 {
	public static void main(String[] args) {
		Report report = new Report();
		report.loadFromFile("myreportfile.xml");
		Printer.print(report);
	}
}

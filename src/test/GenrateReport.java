package test;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.common.excelreport.ExcelReportGenerator;

public class GenrateReport {
	public  static void main(String [] args) throws ParserConfigurationException, IOException, SAXException {
		
		ExcelReportGenerator.generateExcelReport("Excelreport.xlsx","/home/vthalecisco/eclipse-workspace2/TestNgProject/" );
		
	}
//"ExcelReport.xlsx",
}

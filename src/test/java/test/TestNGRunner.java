package test;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class TestNGRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			XmlSuite xmlSuite = new XmlSuite();
			xmlSuite.setName("AppiumTests");
			xmlSuite.setParallel("true");
			
			XmlTest xmlTest = new XmlTest(xmlSuite);
			xmlTest.setName("Test-1");
			
			XmlClass publicTestClass = new XmlClass(GoogleSearchTest.class);
			List<XmlClass> list = new ArrayList<XmlClass>();
			list.add(publicTestClass);
			
			xmlTest.setXmlClasses(list);
			
			TestNG testng = new TestNG();
			List<XmlSuite> suites = new ArrayList<XmlSuite>();
			suites.add(xmlSuite);
			testng.setXmlSuites(suites);
			testng.run();
			
			
	}

}

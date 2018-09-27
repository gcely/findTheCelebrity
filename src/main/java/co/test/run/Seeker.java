package co.test.run;

import java.util.List;

import co.test.celebrity.Person;
import co.test.data.CsvReaderFile;

public class Seeker {

	public static void main(String[] args) {
		// read the file with all people
		CsvReaderFile reader = new CsvReaderFile();
		List<Person> persons = reader.getMeetPeopleList();
		// 
		FindCelebrity fc = new FindCelebrity(persons);
		Person result = fc.findCelebrity();
        if (result == null)  
        { 
            System.out.println("No Celebrity"); 
        }  
        else
            System.out.println("Celebrity ID " +  
                                        result.getId()); 		
//		System.out.println("The celebrity is " + celebrity.getId()+ " - " + celebrity.getFirstName() + " " + celebrity.getLastName() + " who knows " + celebrity.getNmbrPeopleKnows() + " persons");
	}

	

}

package co.test.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import co.test.celebrity.Person;

public class FindCelebrity {
  
    private List<Person> persons;
    
    public FindCelebrity(List<Person> persons) {
    	this.persons = persons;
    }
    
    /**
     * @return
     */
    public Person findCelebrity()  
    { 
    	// Se utiliza un stack para manejar cada persona
        Stack<Person> st = new Stack<>(); 
        Person c; 
  
        for (Person p:persons) { 
            st.push(p); 
        } 
  
        while (st.size() > 1) { 
            Person a = st.pop(); 
            Person b = st.pop(); 
  
            if (knows(a, b)){ 
                st.push(b); 
            } else
                st.push(a); 
        } 
  
        c = st.pop(); 
  
        for (int i = 0; i < persons.size(); i++) { 
            if (persons.get(i) != c && (knows(c, persons.get(i)) || !knows(persons.get(i), c))) 
                return null; 
        } 
        return c; 
    } 
    
    /**
     * Metodo que compara si se conocen las personas
     * @param a
     * @param b
     * @return
     */
    static boolean knows(Person a, Person b)  
    { 
        boolean res = a.getNmbrPeopleKnows().equals(b.getId()); 
        return res; 
    } 
    
	public Person findCelebrity2() {
		// para cada una de las personas en la lista, se busca si conoce a alguien
		List<Person> unknowablePersons = new ArrayList<Person>();
		for (int i=0; i<persons.size(); i++) {
			Person a = persons.get(i);
			for (Person b:persons) {
				if (a.getNmbrPeopleKnows().equals(b.getId())) {
					unknowablePersons.add(a);
					break;
				}
				
			}
		}
		
		return persons.get(0);
	} 
  
}

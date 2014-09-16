package junit.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.north.bean.Person;
import cn.north.service.PersonService;

public class PersonServiceTest {
	private static PersonService personService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try {
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
			personService = (PersonService)applicationContext.getBean("personService");
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testSave() {
		personService.save(new Person("С��"));
	}

	@Test
	public void testUpdate() {
		Person person = personService.getPerson(1);
		//....
		person.setName("С��");
		personService.update(person);
	}

//	@Test
//	public void testGetPerson() {
//		Person person = personService.getPerson(2);
//		System.out.println(person.getName());
//		try {
//			System.out.println("��ر����ݿ�");
//			Thread.sleep(1000*15);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("�ڶ��ο�ʼ��ȡ");
//		person = personService.getPerson(2);
//		System.out.println(person.getName());
//	}

//	@Test
//	public void testDelete() {
//		personService.delete(1);
//	}
//
	@Test
	public void testGetPersons() {
		List<Person> persons = personService.getPersons();
		for(Person person : persons){
			System.out.println(person.getName());
		}
	}

}

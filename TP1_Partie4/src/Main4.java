import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.formation.spring.service.IServiceAdherentImpl;

public class Main4 {

	public static void main(String[] args) {
		//Recherche du fichier de configuration de Spring
		ClassPathResource cpr=new ClassPathResource("applicationContext.xml");
		
		//Initialisation de la fabrique SPRING, les singletons sont charges
		ListableBeanFactory bf= new XmlBeanFactory(cpr);
		
	//Initialisation de la methode getBean en parametrant le nom du bean pr recuperer un bean
		IServiceAdherentImpl sa=(IServiceAdherentImpl) bf.getBean("service");
		
		System.out.println(sa.toString());
	}

}

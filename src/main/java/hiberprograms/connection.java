package hiberprograms;

	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

	public class connection {
		public static void main(String[] args) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
			System.out.println("Connection is establish row");
		}

	}



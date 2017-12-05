package backend.sec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecBackendApplication {
	// implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SecBackendApplication.class, args);
	}

	/*
	 * @Override public void run(String... arg0) throws Exception {
	 * 
	 * Empresa techguy = new Empresa(); techguy.setNomeFantasia("TechGuy");
	 * techguy.setRazaoSocial("TechGuy LTDA");
	 * techguy.setCnpj("48.324.228/0001-63"); techguy =
	 * empresaRepository.save(techguy);
	 * 
	 * Cnae22 cnae1 = cnae22Repository.findOne(new Long(111301)); Cnae22 cnae2 =
	 * cnae22Repository.findOne(new Long(111302));
	 * 
	 * List<EmpresaHasCnae> listaEmpresaHasCnae = new ArrayList<>(); EmpresaHasCnae
	 * vinculo1 = new EmpresaHasCnae(new EmpresaHasCnaePK(techguy.getId(),
	 * cnae1.getId())); vinculo1.setCnae(cnae1); vinculo1.setCnaePrincipal(true);
	 * vinculo1.setEmpresa(techguy);
	 * 
	 * EmpresaHasCnae vinculo2 = new EmpresaHasCnae(new
	 * EmpresaHasCnaePK(techguy.getId(), cnae2.getId())); vinculo2.setCnae(cnae2);
	 * vinculo2.setCnaePrincipal(false); vinculo2.setEmpresa(techguy);
	 * 
	 * listaEmpresaHasCnae.addAll(Arrays.asList(vinculo1, vinculo2));
	 * 
	 * techguy.setListaEmpresaHasCnae(listaEmpresaHasCnae); techguy =
	 * empresaRepository.save(techguy); System.out.println(techguy.toString());
	 * 
	 * }
	 */

}

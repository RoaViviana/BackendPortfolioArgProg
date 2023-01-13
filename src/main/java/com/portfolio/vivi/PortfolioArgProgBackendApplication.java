package com.portfolio.vivi;

import com.portfolio.vivi.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PortfolioArgProgBackendApplication implements CommandLineRunner {


	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(PortfolioArgProgBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			/*try{
				Usuario usuario = new Usuario();

				usuario.setNombre("Vivana");
				usuario.setApellido("Roa");
				usuario.setUsername("viviargprog");
				usuario.setPassword(bCryptPasswordEncoder.encode("123456789"));
				usuario.setEmail("c1@gmail.com");
				usuario.setTelefono("988212020");
				usuario.setPerfil("foto.png");

				Rol rol = new Rol();
				rol.setRolId(1L);
				rol.setRolNombre("ADMIN");

				Set<UsuarioRol> usuariosRoles = new HashSet<>();
				UsuarioRol usuarioRol = new UsuarioRol();
				usuarioRol.setRol(rol);
				usuarioRol.setUsuario(usuario);
				usuariosRoles.add(usuarioRol);

				Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario,usuariosRoles);
				System.out.println(usuarioGuardado.getUsername());
			}catch(UsuarioFoundException exception){
				exception.printStackTrace();
			}*/
	}
	@Bean
	public WebMvcConfigurer corsConfigurer(){
		return new WebMvcConfigurer(){
			@Override
			public void addCorsMappings(CorsRegistry registry){
				registry.addMapping("/**").allowedOrigins("https://portfolio-viviana-roa.web.app").allowedMethods("*").allowedHeaders("*");
			}
		};
	}
	@Bean(name = DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_BEAN_NAME)
	public DispatcherServlet dispatcherServlet() {
		DispatcherServlet dispatcherServlet = new DispatcherServlet();
		dispatcherServlet.setDispatchOptionsRequest(true);
		return dispatcherServlet;
	}
}


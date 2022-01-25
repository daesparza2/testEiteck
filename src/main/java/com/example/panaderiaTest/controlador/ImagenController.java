package com.example.panaderiaTest.controlador;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.panaderiaTest.modelo.Imagen;
import com.example.panaderiaTest.servicio.ICajaService;
import com.example.panaderiaTest.servicio.IImagenService;

@RestController
@RequestMapping(value="/imagen")
@CrossOrigin(origins = "*")
public class ImagenController {

	@Autowired
	private IImagenService imgServ;
	
	@Autowired
	private ICajaService cajaServ;
	
	@PostMapping(value = "/guardar", consumes = { "multipart/form-data" })
	public String guardar(@RequestParam("file") MultipartFile multiPart, @RequestParam("id") Long id) {
		
		Imagen img = new Imagen();
		
		try {
			
			img.setCaja(cajaServ.buscarPorId(id));
			
		} catch (Exception e) {
			// TODO: handle exception
			return "Error el id no existe o no fue enviado como parametro";
		}
		
		
		if(!multiPart.isEmpty()) {
			
			Path rutaImg = Paths.get("src//main//resources//static");
			String rutaAbsoluta = rutaImg.toFile().getAbsolutePath();
			
			try {
				
				byte[] bytesImg = multiPart.getBytes();
				Path rutaCompleta = Paths.get(rutaAbsoluta + "//" + multiPart.getOriginalFilename());
				Files.write(rutaCompleta, bytesImg);
				img.setRuta(rutaCompleta.toFile().getAbsolutePath());
				imgServ.guardar(img);
				return "Se registro con exito";
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
				return "Error";
			}
			
		}
		
		return "Error";
	}
}

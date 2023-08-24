package com.Proyecto.service;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service
public interface FirebaseStorageService {
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta,Long id);

    final String BucketName = "techshop-6c998.appspot.com";
    final String rutaSuperiorStorage = "techshop";
    final String rutaJsonFile = "firebase";
    final String archivoJsonFile = "techshop-6c998-firebase-adminsdk-e2628-8bd342a6f4.json" ;
}

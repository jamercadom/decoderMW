package criptoaes256;


import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class MainClassEncrypt {
	
	public static void main(String[] args) {
        try {
            final String claveEncriptacion = "S3rv1c10sL1v3rp00L_MW";            
            String datosOriginales = "#*.*.*.40#";            
            
            Encrypt2_0 encriptador = new Encrypt2_0();
            
            String encriptado = encriptador.encriptar(datosOriginales, claveEncriptacion);
            String desencriptado = encriptador.desencriptar("KQ5OyywiZdkTkrWQWiga2j/XZ41HhtDnIwigZgB5IKHisxla6oVkbEo4ZypHW8UYd6LMau6sPYNSmM120E2+wyrAwecuzhKvP6Wq/X/BsIuw5OdbebzSePBvCf9FJT6H3jz6JuOw0b4T1bbmA1O7NY+sd8jsCD4TIJ3wb7veqiBevUljhZE0SJDiJ0vBU9G3U0YykoaSzwH6yo/4rhGKuw==", claveEncriptacion);
            
            System.out.println("Cadena Original: " + datosOriginales);
            System.out.println("Escriptado     : " + encriptado);
            System.out.println("Desencriptado  : " + desencriptado);            
            
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException ex) {
            Logger.getLogger(Encrypt2_0.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}

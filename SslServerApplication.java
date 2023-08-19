package com.snhu.sslserver;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	} 
    } 

//to verify secure communications

@RequestMapping("/hash")
public String myHash() throws NoSuchAlgorithmException {

String data = "https://localhost:8443/hash";
String hash = calculateHash(data);

return "<p>data:"+data+" : SHA-256 "+" : "+hash;

}

}

//checksum verification class 

public class ChecksumVerification 
{
	
	public static void main(String[] args) {
		
		String filePath; 
		
		String expectedCheckSum = "expected_checksum_value";
		
		try {
			
			String calculatedChecksum = calculateChecksum(filePath);
			System.out.println("Calculated Checksum: " + calculatedChecksum);
			
		if(calculatedChecksum.equals(expectedCheckSum)) {
			System.out.println("Checksum Verification Passed");
		} 
		
		else {
			System.out.println("Checksum Verification Failed");
		}
		} 
	}

private static String calculateChecksum(String filePath) throws NoSuchAlgorithimException
{
	
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] checksumBytes = md.digest(getBytes);
		StringBuilder sb = new StringBuilder();
		for(byte b : checksumBytes) {
			sb.append(String.format(filePath, null));
		}
		return sb.toString();
}
}
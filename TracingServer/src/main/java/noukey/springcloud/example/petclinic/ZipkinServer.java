package noukey.springcloud.example.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer
public class ZipkinServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ZipkinServer.class, args);
	}

}

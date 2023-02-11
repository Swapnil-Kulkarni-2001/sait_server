package org.sait.server;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class SaitServerApplication {

	public static void main(String[] args) throws IOException {
		//ClassLoader classLoader = SaitServerApplication.class.getClassLoader();

		//File file = new File(classLoader.getResource("saitFirebaseSDK.json").getFile());

//		File = ResourceUtils.getFile("classpath:saitFirebaseSDK.json");
//
//		FileInputStream serviceAccount = new FileInputStream(file.getPath());



		//
		Resource resource = new ClassPathResource("saitFirebaseSDK.json");
		InputStream inputStream = resource.getInputStream();
		//

		FirebaseOptions options = new FirebaseOptions.Builder()
				.setCredentials(GoogleCredentials.fromStream(inputStream))
				.setDatabaseUrl("https://sait-website-default-rtdb.asia-southeast1.firebasedatabase.app")
				.build();
		//
		FirebaseApp firebaseApp = null;
		List<FirebaseApp> firebaseApps = FirebaseApp.getApps();
		if(firebaseApps!=null && !firebaseApps.isEmpty()) {
			for (FirebaseApp app : firebaseApps) {
				if (app.getName().equals(FirebaseApp.DEFAULT_APP_NAME))
					firebaseApp = app;
			}
		}
		else
			firebaseApp = FirebaseApp.initializeApp(options);
		//

		System.out.println(firebaseApp);
		//FirebaseApp.initializeApp(options);
		SpringApplication.run(SaitServerApplication.class, args);
	}

}

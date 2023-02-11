package org.sait.server.services;


import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import org.sait.server.entities.ClubService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Component
public class CSService
{

    public List<ClubService> getAllCS() throws ExecutionException, InterruptedException {
        List<ClubService> clubService = new ArrayList<>();

        Firestore dbFirestore = FirestoreClient.getFirestore();
        // asynchronously retrieve all documents
        ApiFuture<QuerySnapshot> future = dbFirestore.collection("club_service").get();
        // future.get() blocks on response
        List<QueryDocumentSnapshot> documents = future.get().getDocuments();
        for (QueryDocumentSnapshot document : documents) {
            clubService.add(document.toObject(ClubService.class));
        }
        return clubService;
    }

}

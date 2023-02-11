package org.sait.server.services;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.cloud.FirestoreClient;
import org.sait.server.entities.Event;
import org.sait.server.entities.Member;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;


@Component
public class EventService
{

    public ArrayList<Event> getAllEvents() throws ExecutionException, InterruptedException {
        ArrayList<Event> list = new ArrayList<>();
        Firestore dbFirestore = FirestoreClient.getFirestore();
        // asynchronously retrieve all documents
        ApiFuture<QuerySnapshot> future = dbFirestore.collection("events").get();
        // future.get() blocks on response
        List<QueryDocumentSnapshot> documents = future.get().getDocuments();
        for (QueryDocumentSnapshot document : documents) {
            list.add(document.toObject(Event.class));
        }
        return list;
    }



}

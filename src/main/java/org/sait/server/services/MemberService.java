package org.sait.server.services;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import org.sait.server.entities.Member;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Component
public class MemberService {



    public String addMember(Member member) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();

        ApiFuture<DocumentReference> addedDocRef = dbFirestore.collection("main_team").add(member);
        System.out.println("Added document with ID: " + addedDocRef.get().getId());

        return addedDocRef.get().getId();
    }

    public Member getMember() throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = dbFirestore.collection("main_team").document("UsDbCqMGVPzEzgcmclJE");
        ApiFuture<DocumentSnapshot> future = documentReference.get();
        DocumentSnapshot document = future.get();
        Member member;
        if (document.exists()) {
            member = document.toObject(Member.class);
            return member;
        }
        return null;
    }

    public List<Member> getAllMembers(String type) throws InterruptedException, ExecutionException {


        List<Member> listMembers = new ArrayList<>();

        Firestore dbFirestore = FirestoreClient.getFirestore();
        // asynchronously retrieve all documents
        ApiFuture<QuerySnapshot> future = dbFirestore.collection(type).get();
        // future.get() blocks on response
        List<QueryDocumentSnapshot> documents = future.get().getDocuments();
        for (QueryDocumentSnapshot document : documents) {
            listMembers.add(document.toObject(Member.class));
        }
        return listMembers;
    }

}

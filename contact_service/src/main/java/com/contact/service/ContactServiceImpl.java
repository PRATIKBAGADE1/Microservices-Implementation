package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

    // fake list of contacts

    List<Contact> list = List.of(
            new Contact(22L, "pooja@gmail.com", "pooja", 1L),
            new Contact(23L, "jayshri@gmail.com", "jayshri", 2L),
            new Contact(24L, "sakshi@gmail.com", "sakshi", 3L)

    );

    @Override
    public List<Contact> getsContactsOfUser(Long userId) {
        return list.stream()
                .filter(Contact -> Contact.getUserId().equals(userId))
                .collect(Collectors.toList());
    }

}

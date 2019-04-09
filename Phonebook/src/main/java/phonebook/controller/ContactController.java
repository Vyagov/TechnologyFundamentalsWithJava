package phonebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import phonebook.entity.Contact;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ContactController {

    private List<Contact> contacts;

    public ContactController() {
        this.contacts = new ArrayList<>();
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("contacts", this.contacts);
        return "index";
    }

    @PostMapping("/")
    public String add(Contact contact) {
        this.contacts.add(contact);
        return "redirect:/";
    }
}

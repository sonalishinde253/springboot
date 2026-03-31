package com.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webmvc.Book;

@Controller
public class BookController {
	@PostMapping("/displayBook")
	public String displayBook(@RequestParam int bid,String bname,int price,Model model) {
		Book b = new Book();
		b.setBid(bid);
		b.setBname(bname);
		b.setPrice(price);
		model.addAttribute("book",b);
		return "display";  //view file name is display.jsp
	}
}

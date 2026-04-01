package com.springrest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.entities.Ticket;
import com.springrest.services.TicketService;

@RestController
public class TicketController {
	@Autowired
	private TicketService ticketService;
	
	@PostMapping("/ticket")  //http://localhost:8080/ticket
	public Ticket bookTicket(@RequestBody Ticket ticket) {
		return ticketService.bookTicket(ticket);
	}
	
	@GetMapping("/ticket/{ticketId}") //http://localhost:8080/ticket/1
	public Ticket getTicketById(@PathVariable Integer ticketId) {
		return ticketService.getTicketById(ticketId);
	}
	
	@GetMapping("/ticket/alltickets")
	public List<Ticket> getAllTickets(){
		return ticketService.getAllTickets();
	}
	
	@PutMapping("/ticket/{ticketId}/{newEmail}")
	public Ticket updateTicket(@PathVariable Integer ticketId,@PathVariable String newEmail) {
		return ticketService.updateTicket(ticketId, newEmail);
	}
	
	@DeleteMapping("/ticket/{ticketId}")
	public void deleteTicket(@PathVariable Integer ticketId) {
		ticketService.deleteTicket(ticketId);
	}
}

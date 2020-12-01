package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Articulos;
import com.example.demo.models.Cliente;
import com.example.demo.models.Pedido;
import com.example.demo.repository.ArticulosRepository;
import com.example.demo.repository.ClientesRepository;
import com.example.demo.repository.PedidosRepository;


@RestController
public class TiendaController {
	
	@Autowired
	ClientesRepository clientesRepository;
	@Autowired
	ArticulosRepository articulosRepository;
	@Autowired
	PedidosRepository pedidosRepository;
	
	@GetMapping("/getAllClientes")
	public List<Cliente> getAllEmpleados()
	{
		return 	clientesRepository.findAll();
	}
	
	@GetMapping("/getAllArticulos")
	public List<Articulos> getAllArticulos()
	{
		return 	articulosRepository.findAll();
	}
	
	@GetMapping("/getAllPedidos")
	public List<Pedido> getAllPedidos()
	{
		return 	pedidosRepository.findAll();
	}
	
	
	@GetMapping("/getBookById/{id}")
	public Optional<Cliente> getBookById(@PathVariable(value="codEmpleado") Long codEmpleado)
	{
		return clientesRepository.findById(codEmpleado); 
	}
	
	
	@PostMapping("/addPedido")
	public Pedido addPedido(@RequestBody Pedido Pedido)
	{
		return pedidosRepository.save(Pedido);
	}
	
	/*
	@PutMapping("/updateBook/{id}")
	public Book updateBook(@PathVariable(value="id") Long id, @RequestBody Book bookDetails)
	{
		Optional<Book> book = bookRepository.findById(id);
		Book book_new=book.get();
		book_new.setAuthor_name(bookDetails.getAuthor_name());
		book_new.setBook_name(bookDetails.getBook_name());
		book_new.setIsbn(bookDetails.getIsbn());
		return bookRepository.save(book_new);
		
	}  */
	
	@DeleteMapping("/deleteBook/{id}")
	public void deleteBook(@PathVariable(value="codEmpleado") Long codEmpleado)
	{
		Optional<Cliente> book=clientesRepository.findById(codEmpleado);
		Cliente book_new=book.get();
		clientesRepository.delete(book_new); 
	}
	

}

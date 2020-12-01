package br.com.teste.kolarik.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;

@Data
@AllArgsConstructor
public class Pbot {
	
	private Bot bot;
	private ObjectId id;

}
